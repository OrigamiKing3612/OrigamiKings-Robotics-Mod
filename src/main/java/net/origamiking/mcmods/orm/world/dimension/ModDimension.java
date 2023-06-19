package net.origamiking.mcmods.orm.world.dimension;

import net.origamiking.mcmods.orm.world.dimension.cybertron.CybertronDimension;

public class ModDimension {
    public static void get() {
        CybertronDimension.get();
    }
}

//{
//  "type": "orm:cybertron",
//  "generator": {
//    "type": "minecraft:noise",
//    "settings": {
//      "sea_level": 0,
//      "disable_mob_generation": false,
//      "aquifers_enabled": false,
//      "ore_veins_enabled": false,
//      "legacy_random_source": false,
//      "default_block": {
//        "Name": "orm:transformium_block"
//      },
//      "default_fluid": {
//        "Name": "minecraft:air",
//        "Properties": {
//          "level": "0"
//        }
//      },
//      "noise": {
//        "min_y": 0,
//        "height": 384,
//        "size_horizontal": 1,
//        "size_vertical": 2
//      },
//      "noise_router": {
//        "barrier": 0,
//        "fluid_level_floodedness": 0,
//        "fluid_level_spread": 0,
//        "lava": 0,
//        "temperature": 0,
//        "vegetation": 0,
//        "continents": 0,
//        "erosion": 0,
//        "depth": 0,
//        "ridges": 0,
//        "initial_density_without_jaggedness": 0,
//        "final_density": {
//          "type": "minecraft:interpolated",
//          "argument": "minecraft:overworld/base_3d_noise"
//        },
//        "vein_toggle": 0,
//        "vein_ridged": 0,
//        "vein_gap": 0
//      },
//      "spawn_target": [],
//      "surface_rule": {
//        "type": "minecraft:sequence",
//        "sequence": []
//      }
//    },
//    "biome_source": {
//      "type": "minecraft:multi_noise",
//      "biomes": [
//        {
//          "biome": "orm:cybertron",
//          "parameters": {
//            "temperature": 0,
//            "humidity": 0,
//            "continentalness": 0,
//            "erosion": 0,
//            "weirdness": 0,
//            "depth": 0,
//            "offset": 0
//          }
//        }
//      ]
//    }
//  }
//}