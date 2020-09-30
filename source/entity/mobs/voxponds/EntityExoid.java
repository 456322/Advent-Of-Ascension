package net.tslat.aoa3.entity.mobs.voxponds;

import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.base.AoAMeleeMob;
import net.tslat.aoa3.utils.WorldUtil;

import javax.annotation.Nullable;

public class EntityExoid extends AoAMeleeMob {
    public static final float entityWidth = 0.5625f;
    private int tier = 1;

    public EntityExoid(World world, int tier) {
        this(world);
        this.tier = tier;
    }

    public EntityExoid(World world) {
        super(world, entityWidth, 2.3125f);
    }

    @Override
    public float getEyeHeight() {
        return 2f;
    }

    @Override
    protected double getBaseKnockbackResistance() {
        return 0.15;
    }

    @Override
    protected double getBaseMaxHealth() {
        return 100;
    }

    @Override
    protected double getBaseMeleeDamage() {
        return 11.5;
    }

    @Override
    protected double getBaseMovementSpeed() {
        return 0.2875;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundsRegister.MOB_GADGETOID_LIVING;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundsRegister.MOB_GADGETOID_DEATH;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundsRegister.MOB_GADGETOID_HIT;
    }

    @Override
    protected boolean canDespawn() {
        return false;
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();

        if (!world.isRemote && ticksExisted >= 900) {
            WorldUtil.createExplosion(this, world, 3f);
            setDead();
        }
    }

    @Override
    public void onDeath(DamageSource cause) {
        super.onDeath(cause);

        if (!world.isRemote && tier < 5) {
            EntityExoid exoid = new EntityExoid(world, tier + 1);
            int x = rand.nextBoolean() ? -45 : 45;
            int z = rand.nextBoolean() ? -45 : 45;

            exoid.setLocationAndAngles(posX + x, posY + 3, posZ + z, rotationYaw, rotationPitch);
            world.spawnEntity(exoid);
        }
    }
}
