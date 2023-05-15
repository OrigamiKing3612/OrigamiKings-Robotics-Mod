package net.origamiking.orm.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.orm.OrmMain;
import net.origamiking.orm.armor.astrotrain.Astrotrain;
import net.origamiking.orm.armor.astrotrain.AstrotrainArmorItem;
import net.origamiking.orm.armor.astrotrain.AstrotrainShuttleArmorItem;
import net.origamiking.orm.armor.astrotrain.AstrotrainTrainArmorItem;
import net.origamiking.orm.armor.bumblebee.Bumblebee;
import net.origamiking.orm.armor.bumblebee.BumblebeeArmorItem;
import net.origamiking.orm.armor.bumblebee.BumblebeeCarArmorItem;
import net.origamiking.orm.armor.ironhide.Ironhide;
import net.origamiking.orm.armor.ironhide.IronhideArmorItem;
import net.origamiking.orm.armor.ironhide.IronhideCarArmorItem;
import net.origamiking.orm.armor.megatron.Megatron;
import net.origamiking.orm.armor.megatron.MegatronArmorItem;
import net.origamiking.orm.armor.optimus_prime.OptimusPrime;
import net.origamiking.orm.armor.optimus_prime.OptimusPrimeArmorItem;
import net.origamiking.orm.armor.optimus_prime.OptimusPrimeCarArmorItem;
import net.origamiking.orm.armor.robo_1.Robo_1;
import net.origamiking.orm.armor.robo_1.Robo_1ArmorItem;
import net.origamiking.orm.armor.robo_1.Robo_1_CarArmorItem;
import net.origamiking.orm.armor.robot_starscream.RobotStarscream;
import net.origamiking.orm.armor.robot_starscream.RobotStarscreamArmorItem;
import net.origamiking.orm.armor.robot_starscream.RobotStarscreamJetArmorItem;
import net.origamiking.orm.armor.scorpinok.Scorpinok;
import net.origamiking.orm.armor.scorpinok.ScorpinokArmorItem;
import net.origamiking.orm.armor.scorpinok.Scorpinok_CarArmorItem;
import net.origamiking.orm.armor.skystrike.Skystrike;
import net.origamiking.orm.armor.skystrike.SkystrikeArmorItem;
import net.origamiking.orm.armor.skystrike.Skystrike_CarArmorItem;
import net.origamiking.orm.armor.soundwave.Soundwave;
import net.origamiking.orm.armor.soundwave.SoundwaveArmorItem;
import net.origamiking.orm.armor.soundwave.SoundwaveRecorderArmorItem;
import net.origamiking.orm.armor.thunder_cracker.ThunderCracker;
import net.origamiking.orm.armor.thunder_cracker.ThunderCrackerArmorItem;
import net.origamiking.orm.armor.thunder_cracker.ThunderCrackerJetArmorItem;

public class ArmorRegistry {
    public static final CarArmorItem CAR_ARMOR_CHESTPLATE = registerItem("car_armor_chestplate", new CarArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Settings()));




    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, new Identifier(OrmMain.MOD_ID, name), item);
    }
    public static void getArmor() {
        Robo_1.get();
        Skystrike.get();
        Scorpinok.get();
        RobotStarscream.get();
        OptimusPrime.get();
        Astrotrain.get();
        Bumblebee.get();
        Ironhide.get();
        Megatron.get();
        Soundwave.get();
        ThunderCracker.get();
    }
}
