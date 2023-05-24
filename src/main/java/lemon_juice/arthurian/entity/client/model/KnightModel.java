package lemon_juice.arthurian.entity.client.model;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.entity.custom.KnightEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class KnightModel extends GeoModel<KnightEntity> {
    @Override
    public ResourceLocation getModelResource(KnightEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "geo/knight.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KnightEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "textures/entity/knight.png");
    }

    @Override
    public ResourceLocation getAnimationResource(KnightEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "animations/knight.animation.json");
    }

    @Override
    public void setCustomAnimations(KnightEntity animatable, long instanceId, AnimationState<KnightEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
