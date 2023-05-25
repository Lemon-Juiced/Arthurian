package lemon_juice.arthurian.entity.client.renderer;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.entity.client.model.KingArthurModel;
import lemon_juice.arthurian.entity.custom.KingArthurEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class KingArthurRenderer extends GeoEntityRenderer<KingArthurEntity> {
    public KingArthurRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new KingArthurModel());
    }

    @Override
    public ResourceLocation getTextureLocation(KingArthurEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "textures/entity/king_arthur.png");
    }
}