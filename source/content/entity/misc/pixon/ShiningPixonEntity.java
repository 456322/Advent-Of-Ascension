package net.tslat.aoa3.content.entity.misc.pixon;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.level.Level;

public class ShiningPixonEntity extends PixonEntity {
    public ShiningPixonEntity(EntityType<? extends PathfinderMob> entityType, Level world) {
        super(entityType, world);
    }

    @Override
    public int getHarvestLevelReq() {
        return 60;
    }
}
