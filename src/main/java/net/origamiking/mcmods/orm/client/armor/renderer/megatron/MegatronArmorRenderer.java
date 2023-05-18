package net.origamiking.mcmods.orm.client.armor.renderer.megatron;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.armor.megatron.MegatronArmorItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MegatronArmorRenderer extends GeoArmorRenderer<MegatronArmorItem>{
        public MegatronArmorRenderer() {
            super(new DefaultedItemGeoModel<>(new Identifier(OrmMain.MOD_ID, "armor/megatron")));

            //addRenderLayer(new AutoGlowingGeoLayer<>(this));
        }
    }


