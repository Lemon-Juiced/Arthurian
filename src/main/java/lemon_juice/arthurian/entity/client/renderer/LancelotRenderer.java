package lemon_juice.arthurian.entity.client.renderer;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.entity.client.model.LancelotModel;
import lemon_juice.arthurian.entity.custom.LancelotEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class LancelotRenderer extends GeoEntityRenderer<LancelotEntity> {
    public LancelotRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LancelotModel());
    }

    @Override
    public ResourceLocation getTextureLocation(LancelotEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "textures/entity/lancelot.png");
    }
}
