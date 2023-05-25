package lemon_juice.arthurian.entity.client.model;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.entity.custom.KingArthurEntity;
import lemon_juice.arthurian.entity.custom.KnightEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class KingArthurModel extends GeoModel<KingArthurEntity> {
    @Override
    public ResourceLocation getModelResource(KingArthurEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "geo/king_arthur.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(KingArthurEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "textures/entity/king_arthur.png");
    }

    @Override
    public ResourceLocation getAnimationResource(KingArthurEntity animatable) {
        return new ResourceLocation(Arthurian.MOD_ID, "animations/king_arthur.animation.json");
    }

    @Override
    public void setCustomAnimations(KingArthurEntity animatable, long instanceId, AnimationState<KingArthurEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
