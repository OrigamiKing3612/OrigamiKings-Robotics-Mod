package net.origamiking.mcmods.orm.addon;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.origamiking.mcmods.orm.group.ModGroups;

public class OrmAddonHelper {
    protected OrmAddonHelper() {
    }

    public void addChipToGroup(Item chip) {
        ItemGroupEvents.modifyEntriesEvent(ModGroups.ORM_CHIPS).register(entries -> entries.add(chip));
    }

    public void addAddonToGroup(Item addon) {
        ItemGroupEvents.modifyEntriesEvent(ModGroups.ORM_ADDONS).register(entries -> entries.add(addon));
    }

    public void addChipToGroup(Item... chips) {
        ItemGroupEvents.modifyEntriesEvent(ModGroups.ORM_CHIPS).register(entries -> {
            for (Item chip : chips) {
                entries.add(chip);
            }
        });
    }

    public void addAddonToGroup(Item... addons) {
        ItemGroupEvents.modifyEntriesEvent(ModGroups.ORM_ADDONS).register(entries -> {
            for (Item addon : addons) {
                entries.add(addon);
            }
        });
    }
}
