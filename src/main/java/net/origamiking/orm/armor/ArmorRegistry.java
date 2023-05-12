package net.origamiking.orm.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;

public class ArmorRegistry {
    public static final CarArmorItem CAR_ARMOR_CHESTPLATE = registerItem("car_armor_chestplate", new CarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Scorpinok_CarArmorItem SCORPINOK_CAR = registerItem("scorpinok_car", new Scorpinok_CarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Skystrike_CarArmorItem SKYSTRIKE_JET = registerItem("skystrike_jet", new Skystrike_CarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Robo_1_CarArmorItem ROBO_1_CAR = registerItem("robo_1_car", new Robo_1_CarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Robo_1ArmorItem ROBO_1_ARMOR_HELMET = registerItem("robo_1_armor_helmet", new Robo_1ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Robo_1ArmorItem ROBO_1_ARMOR_CHESTPLATE = registerItem("robo_1_armor_chestplate", new Robo_1ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Robo_1ArmorItem ROBO_1_ARMOR_LEGGINGS = registerItem("robo_1_armor_leggings", new Robo_1ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Robo_1ArmorItem ROBO_1_ARMOR_BOOTS = registerItem("robo_1_armor_boots", new Robo_1ArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final SkystrikeArmorItem SKYSTRIKE_ARMOR_HELMET = registerItem("skystrike_armor_helmet", new SkystrikeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final SkystrikeArmorItem SKYSTRIKE_ARMOR_CHESTPLATE = registerItem("skystrike_armor_chestplate", new SkystrikeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final SkystrikeArmorItem SKYSTRIKE_ARMOR_LEGGINGS = registerItem("skystrike_armor_leggings", new SkystrikeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final SkystrikeArmorItem SKYSTRIKE_ARMOR_BOOTS = registerItem("skystrike_armor_boots", new SkystrikeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final ScorpinokArmorItem SCORPINOK_ARMOR_HELMET = registerItem("scorpinok_helmet", new ScorpinokArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final ScorpinokArmorItem SCORPINOK_ARMOR_CHESTPLATE = registerItem("scorpinok_chestplate", new ScorpinokArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final ScorpinokArmorItem SCORPINOK_ARMOR_LEGGINGS = registerItem("scorpinok_leggings", new ScorpinokArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final ScorpinokArmorItem SCORPINOK_ARMOR_BOOTS = registerItem("scorpinok_boots", new ScorpinokArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final RobotStarscreamArmorItem ROBOT_STARSCREAM_ARMOR_HELMET = registerItem("robot_starscream_armor_helmet", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final RobotStarscreamArmorItem ROBOT_STARSCREAM_ARMOR_CHESTPLATE = registerItem("robot_starscream_armor_chestplate", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final RobotStarscreamArmorItem ROBOT_STARSCREAM_ARMOR_LEGGINGS = registerItem("robot_starscream_armor_leggings", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final RobotStarscreamArmorItem ROBOT_STARSCREAM_ARMOR_BOOTS = registerItem("robot_starscream_armor_boots", new RobotStarscreamArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final RobotStarscreamJetArmorItem ROBOT_STARSCREAM_JET_ARMOR = registerItem("robot_starscream_jet", new RobotStarscreamJetArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final OptimusPrimeArmorItem OPTIMUS_PRIME_ARMOR_HELMET = registerItem("optimus_prime_armor_helmet", new OptimusPrimeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final OptimusPrimeArmorItem OPTIMUS_PRIME_ARMOR_CHESTPLATE = registerItem("optimus_prime_armor_chestplate", new OptimusPrimeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final OptimusPrimeArmorItem OPTIMUS_PRIME_ARMOR_LEGGINGS = registerItem("optimus_prime_armor_leggings", new OptimusPrimeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final OptimusPrimeArmorItem OPTIMUS_PRIME_ARMOR_BOOTS = registerItem("optimus_prime_armor_boots", new OptimusPrimeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final OptimusPrimeCarArmorItem OPTIMUS_PRIME_CAR = registerItem("optimus_prime_car", new OptimusPrimeCarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainTrainArmorItem ASTROTRAIN_TRAIN = registerItem("astrotrain_train", new AstrotrainTrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainShuttleArmorItem ASTROTRAIN_SHUTTLE = registerItem("astrotrain_shuttle", new AstrotrainShuttleArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainArmorItem ASTROTRAIN_HELMET = registerItem("astrotrain_helmet", new AstrotrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final AstrotrainArmorItem ASTROTRAIN_CHESTPLATE = registerItem("astrotrain_chestplate", new AstrotrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final AstrotrainArmorItem ASTROTRAIN_LEGGINGS = registerItem("astrotrain_leggings", new AstrotrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final AstrotrainArmorItem ASTROTRAIN_BOOTS = registerItem("astrotrain_boots", new AstrotrainArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final BumblebeeArmorItem BUMBLEBEE_HELMET = registerItem("bumblebee_helmet", new BumblebeeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final BumblebeeArmorItem BUMBLEBEE_CHESTPLATE = registerItem("bumblebee_chestplate", new BumblebeeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final BumblebeeArmorItem BUMBLEBEE_LEGGINGS = registerItem("bumblebee_leggings", new BumblebeeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final BumblebeeArmorItem BUMBLEBEE_BOOTS = registerItem("bumblebee_boots", new BumblebeeArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final BumblebeeCarArmorItem BUMBLEBEE_CAR = registerItem("bumblebee_car", new BumblebeeCarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final IronhideArmorItem IRONHIDE_HELMET = registerItem("ironhide_helmet", new IronhideArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final IronhideArmorItem IRONHIDE_CHESTPLATE = registerItem("ironhide_chestplate", new IronhideArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final IronhideArmorItem IRONHIDE_LEGGINGS = registerItem("ironhide_leggings", new IronhideArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final IronhideArmorItem IRONHIDE_BOOTS = registerItem("ironhide_boots", new IronhideArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final IronhideCarArmorItem IRONHIDE_CAR = registerItem("ironhide_car", new IronhideCarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final SoundwaveArmorItem SOUNDWAVE_HELMET = registerItem("soundwave_helmet", new SoundwaveArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final SoundwaveArmorItem SOUNDWAVE_CHESTPLATE = registerItem("soundwave_chestplate", new SoundwaveArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final SoundwaveArmorItem SOUNDWAVE_LEGGINGS = registerItem("soundwave_leggings", new SoundwaveArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final SoundwaveArmorItem SOUNDWAVE_BOOTS = registerItem("soundwave_boots", new SoundwaveArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.BOOTS, new Item.Settings()));
    public static final SoundwaveRecorderArmorItem SOUNDWAVE_RECORDER = registerItem("soundwave_recorder", new SoundwaveRecorderArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));



    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(OrmMain.MOD_ID, name), item);
    }
    public static void getArmor() {

    }
}
