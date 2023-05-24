package lemon_juice.arthurian.entity.client.renderer;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.entity.client.model.KnightModel;
import lemon_juice.arthurian.entity.custom.KnightEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class KnightRenderer extends GeoEntityRenderer<KnightEntity> {
    public KnightRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new KnightModel());
    }

    @Override
    public ResourceLocation getTextureLocation(KnightEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "textures/entity/knight.png");
    }
}
