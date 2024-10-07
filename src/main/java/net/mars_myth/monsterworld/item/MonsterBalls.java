package net.mars_myth.monsterworld.item;

import net.mars_myth.monsterworld.MoonyMonsterWorld;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MonsterBalls {



    public static final Item BASIC_BALL = registerItem("basic_ball",
            new Item(new Item.Settings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MoonyMonsterWorld.MOD_ID, name), item);
    }

    public static void registerMonsterBalls() {
        MoonyMonsterWorld.LOGGER.info("Adding Monster Balls to " + MoonyMonsterWorld.MOD_ID);
    }
}
