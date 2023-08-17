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
        if (ArmorUtils.isArmorSetOfType(player, TransformerArmorItem.class) && !player.isSpectator() && !player.isCreative()) {
            int x = 0;
            int y = 0;
            MinecraftClient client = MinecraftClient.getInstance();
            if (client != null) {
                int width = client.getWindow().getScaledWidth();
                int height = client.getWindow().getScaledHeight();

                x = width / 2;
                y = height;
            }

            RenderSystem.setShader(GameRenderer::getPositionTexProgram);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.setShaderTexture(0, EMPTY_ENERGY_CELL);
            int NUMBER_OF_CELLS = 10;
            for (int i = 0; i < NUMBER_OF_CELLS; i++) {
                drawContext.drawTexture(EMPTY_ENERGY_CELL, x + 95 + (i * NUMBER_OF_CELLS - 1), y - 18, 0, 0, 12, 12, 12, 12);
            }

            RenderSystem.setShaderTexture(0, FILLED_ENERGY_CELL);
            for (int i = 0; i < NUMBER_OF_CELLS; i++) {
                if (((IEntityEnergyCellsDataSaver) MinecraftClient.getInstance().player).getPersistentData().getInt("energy_cells") > i) {
                    drawContext.drawTexture(FILLED_ENERGY_CELL, x + 95 + (i * NUMBER_OF_CELLS - 1), y - 18, 0, 0, 12, 12, 12, 12);
                } else {
                    break;
                }
            }
        }
    }
}
