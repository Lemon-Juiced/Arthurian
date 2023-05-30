package lemon_juice.arthurian.entity.client.model;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.entity.custom.LancelotEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class LancelotModel extends GeoModel<LancelotEntity> {
    @Override
    public ResourceLocation getModelResource(LancelotEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "geo/lancelot.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(LancelotEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "textures/entity/lancelot.png");
    }

    @Override
    public ResourceLocation getAnimationResource(LancelotEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "animations/lancelot.animation.json");
    }

    @Override
    public void setCustomAnimations(LancelotEntity animatable, long instanceId, AnimationState<LancelotEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
