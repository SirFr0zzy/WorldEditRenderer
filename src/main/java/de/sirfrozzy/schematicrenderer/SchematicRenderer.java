package de.sirfrozzy.schematicrenderer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class SchematicRenderer extends JavaPlugin {

    private boolean isRendering = false;


    @Override
    public void onEnable() {

        File schematicFolder = new File("plugins/SchematicRenderer/schematics/");
        if (!schematicFolder.exists())
            schematicFolder.mkdir();




    }

    public void render(){

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
