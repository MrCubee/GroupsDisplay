package fr.mrcubee.groups.display.listeners;

import fr.mrcubee.groups.bukkit.Groups;
import fr.mrcubee.groups.display.GroupsDisplay;

/**
 * @author MrCubee
 * @since 1.0
 */
public class RegisterListeners {

    public static void register(GroupsDisplay plugin, Groups groupsPlugin) {
        if (plugin == null || groupsPlugin == null)
            return;
        fr.mrcubee.groups.display.listeners.player.RegisterListeners.register(plugin, groupsPlugin);
    }
}
