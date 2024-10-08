package net.mars_myth.monsterworld.entity;


import net.mars_myth.monsterworld.MoonyMonsterWorld;
import net.mars_myth.monsterworld.entity.ball.BasicBallProjectileEntity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<BasicBallProjectileEntity>  BASIC_BALL_PROJECTILE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(MoonyMonsterWorld.MOD_ID, "basic_ball_projectile"),
            EntityType.Builder.<BasicBallProjectileEntity>create(BasicBallProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25f,0.25f).build());
}
