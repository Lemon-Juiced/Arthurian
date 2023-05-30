package lemon_juice.arthurian.entity.client.model;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.entity.custom.MerlinEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class MerlinModel extends GeoModel<MerlinEntity> {
    @Override
    public ResourceLocation getModelResource(MerlinEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "geo/merlin.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MerlinEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "textures/entity/merlin.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MerlinEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "animations/merlin.animation.json");
    }

    @Override
    public void setCustomAnimations(MerlinEntity animatable, long instanceId, AnimationState<MerlinEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
