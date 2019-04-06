package com.zseeds.zseedsmod.entity;

import net.minecraft.entity.ai.EntityAIAttackMelee;

public class EntityAIDefaultZombieAttack extends EntityAIAttackMelee {
    private int raiseArmTicks;
    private ZombieIron ironZombie;

    public EntityAIDefaultZombieAttack(ZombieIron zombieIn, double speedIn, boolean longMemoryIn) {
        super(zombieIn, speedIn, longMemoryIn);
        this.ironZombie = zombieIn;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    @Override
    public void startExecuting() {
        super.startExecuting();
        this.raiseArmTicks = 0;
    }

    /**
     * Resets the task
     */
    @Override
    public void resetTask() {
        super.resetTask();
        this.ironZombie.setArmsRaised(false);
    }

    /**
     * Updates the task
     */
    @Override
    public void updateTask() {
        super.updateTask();
        ++this.raiseArmTicks;

        if (this.raiseArmTicks >= 5 && this.attackTick < 10) {
            this.ironZombie.setArmsRaised(true);
        } else {
            this.ironZombie.setArmsRaised(false);
        }
    }
}