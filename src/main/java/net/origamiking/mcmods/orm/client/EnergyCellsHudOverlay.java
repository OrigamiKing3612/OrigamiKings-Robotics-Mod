package net.origamiking.mcmods.orm.client;

import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.armor.ArmorUtils;
import net.origamiking.mcmods.orm.OrmMain;
import net.origamiking.mcmods.orm.utils.IEntityEnergyCellsDataSaver;
import net.origamiking.mcmods.orm.utils.TransformerArmorItem;

public class EnergyCellsHudOverlay implements HudRenderCallback {
    private static final Identifier FILLED_ENERGY_CELL = new Identifier(OrmMain.MOD_ID, "textures/energy_cells/filled_energy_cell.png");
    private static final Identifier EMPTY_ENERGY_CELL = new Identifier(OrmMain.MOD_ID, "textures/energy_cells/empty_energy_cell.png");

    @Override
    public void onHudRender(DrawContext drawContext, float tickDelta) {
        ClientPlayerEntity player = MinecraftClient.getInstance().player;
        if (ArmorUtils.isArmorSetOfType(player, TransformerArmorItem.class) && !player.isSpectator() && !player.getAbilities().creativeMode) {
            int x = 0;
            int y = 0;
            MinecraftClient client = MinecraftClient.getInstance();
            if (client != null) {
                int width = client.getWindow().getScaledWidth();
                int height = client.getWindow().getScaledHeight();

                x = width / 2;
                y = height;
            }
            int texture_size = 12;
            int number_of_cells = 10;

            RenderSystem.setShader(GameRenderer::getPositionTexProgram);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.setShaderTexture(0, EMPTY_ENERGY_CELL);
            for (int e = 0; e < number_of_cells; e++) {
                drawContext.drawTexture(EMPTY_ENERGY_CELL, x + 95 + (e * number_of_cells - 1), y - 18, 0, 0, texture_size, texture_size, texture_size, texture_size);
            }

            RenderSystem.setShaderTexture(0, FILLED_ENERGY_CELL);
            for (int f = 0; f < number_of_cells; f++) {
                if (((IEntityEnergyCellsDataSaver) player).getPersistentData().getInt("energy_cells") > f) {
                    drawContext.drawTexture(FILLED_ENERGY_CELL, x + 95 + (f * number_of_cells - 1), y - 18, 0, 0, texture_size, texture_size, texture_size, texture_size);
                } else {
                    break;
                }
            }
        }
    }
}
