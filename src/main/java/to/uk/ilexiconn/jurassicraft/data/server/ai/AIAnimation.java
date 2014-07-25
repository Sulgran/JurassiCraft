package to.uk.ilexiconn.jurassicraft.data.server.ai;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import to.uk.ilexiconn.jurassicraft.api.Util;
import to.uk.ilexiconn.jurassicraft.api.IAnimatedEntity;

public abstract class AIAnimation extends EntityAIBase
{

    public AIAnimation(IAnimatedEntity entity)
    {
        animatedEntity = entity;
        setMutexBits(7);
    }

    public abstract int getAnimID();

    public <T extends EntityLiving> T getEntity()
    {
        return (T) animatedEntity;
    }

    public abstract boolean isAutomatic();

    public abstract int getDuration();

    public boolean shouldAnimate()
    {
        return false;
    }

    public boolean shouldExecute()
    {
        if (isAutomatic()) return animatedEntity.getAnimID() == getAnimID();
        return shouldAnimate();
    }

    public void startExecuting()
    {
        if (!isAutomatic()) Util.sendAnimationPacket(animatedEntity, getAnimID());
        animatedEntity.setAnimTick(0);
    }

    public boolean continueExecuting()
    {
        return animatedEntity.getAnimTick() < getDuration();
    }

    public void resetTask()
    {
        Util.sendAnimationPacket(animatedEntity, 0);
    }

    private IAnimatedEntity animatedEntity;
}