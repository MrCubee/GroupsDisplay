package fr.mrcubee.groups.display.listeners.player;

import fr.mrcubee.groups.bukkit.Groups;
import fr.mrcubee.groups.display.GroupsDisplay;
import org.bukkit.plugin.PluginManager;

/**
 * @author MrCubee
 * @since 1.0
 */
public class RegisterListeners {

    public static void register(GroupsDisplay plugin, Groups groupsPlugin) {
        PluginManager pluginManager;

        if (plugin == null || groupsPlugin == null)
            return;
        pluginManager = plugin.getServer().getPluginManager();
        pluginManager.registerEvents(new AsyncPlayerChat(groupsPlugin), plugin);
        pluginManager.registerEvents(new PlayerGroupChange(), plugin);
    }
}
