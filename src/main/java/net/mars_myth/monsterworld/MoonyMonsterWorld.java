package net.mars_myth.monsterworld;

import net.fabricmc.api.ModInitializer;

import net.mars_myth.monsterworld.item.MonsterBalls;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoonyMonsterWorld implements ModInitializer {
	public static final String MOD_ID = "monster-world";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabricated world of Monsters!");


		MonsterBalls.registerMonsterBalls();
	}
}