package lemon_juice.arthurian.entity.client.renderer;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.entity.client.model.MerlinModel;
import lemon_juice.arthurian.entity.custom.MerlinEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MerlinRenderer extends GeoEntityRenderer<MerlinEntity> {
    public MerlinRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MerlinModel());
    }

    @Override
    public ResourceLocation getTextureLocation(MerlinEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "textures/entity/merlin.png");
    }
}
