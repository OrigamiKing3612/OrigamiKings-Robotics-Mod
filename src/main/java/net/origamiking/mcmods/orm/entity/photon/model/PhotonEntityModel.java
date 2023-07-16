package net.origamiking.mcmods.orm.entity.photon.model;

import net.minecraft.util.Identifier;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.entity.photon.PhotonEntity;
import software.bernie.geckolib.model.DefaultedEntityGeoModel;

public class PhotonEntityModel extends DefaultedEntityGeoModel<PhotonEntity> {
    public PhotonEntityModel() {
        super(new Identifier(OrmMain.MOD_ID, "photon"), true);
    }

}
