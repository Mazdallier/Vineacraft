package pokefenn.util;

import net.minecraft.util.ResourceLocation;
import pokefenn.lib.Reference;

public class ResourceLocationHelper {

    public static ResourceLocation getResourceLocation(String modId, String path) {

        return new ResourceLocation(modId, path);
    }

    public static ResourceLocation getResourceLocation(String path) {

        return getResourceLocation(Reference.MOD_NAME.toLowerCase(), path);
    }
}