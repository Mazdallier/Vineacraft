package pokefenn.vineacraft;

import net.minecraft.creativetab.CreativeTabs;
import pokefenn.proxy.CommonProxy;
import pokefenn.block.ModBlocks;
import pokefenn.creativetab.CreativeTabVineac;
import pokefenn.item.ModItems;
import pokefenn.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLInterModComms;
import cpw.mods.fml.common.event.FMLInterModComms.IMCEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;



/* To stop these stupid errors  */@SuppressWarnings("unused")

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Vineacraft {

    @Instance(Reference.MOD_ID)
    public static Vineacraft instance;
    
    @SidedProxy(clientSide = "pokefenn.proxy.ClientProxy", serverSide = "pokefenn.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    public static CreativeTabs tabsVineac = new CreativeTabVineac(
            CreativeTabs.getNextID(), Reference.MOD_ID);

    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
       

        // Initialize the Render Tick Handler (Client only)
        proxy.registerRenderers();

        // Register the Sound Handler (Client only)
        proxy.registerSoundHandler();

        // Initialize mod blocks
        ModBlocks.init();

        // Initialize mod items
        ModItems.init();
        
    }
    
    @Init
    public void init(FMLInitializationEvent event){
        
        
     // Initialize mod tile entities
        proxy.registerTileEntities();

     // Initialize custom rendering and pre-load textures (Client only)
        //proxy.initRenderingAndTextures();
        
        
        
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
    
    
     // Initialize the Addon Handler
        //AddonHandler.init();
        
    }
    

}