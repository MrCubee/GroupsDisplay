package fr.mrcubee.groups.display;

import fr.mrcubee.groups.Group;
import fr.mrcubee.groups.bukkit.Groups;
import fr.mrcubee.groups.display.listeners.RegisterListeners;
import fr.mrcubee.langlib.Lang;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class GroupsDisplay extends JavaPlugin {

    @Override
    public void onEnable() {
        Lang.clean(0);
        Plugin plugin = getServer().getPluginManager().getPlugin("Groups");

        if (plugin == null) {
            getLogger().severe("This plugin require Groups.");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        Lang.setDefaultLang("EN_us");
        RegisterListeners.register(this, (Groups) plugin);
        for (Player player : getServer().getOnlinePlayers())
            GroupsDisplay.setPlayerListDisplay(player, ((Groups) plugin).getGroupManager().getPlayerGroup(player));
    }

    @Override
    public void onDisable() {

    }

    public static void setPlayerListDisplay(Player player, Group group) {
        String groupName;
        String playerName;
        String tabListName;

        if (player == null)
            return;
        groupName = group != null ? group.getName() : "null";
        playerName = player.getCustomName();
        if (playerName == null)
            playerName = player.getName();
        tabListName = Lang.getMessage("group." + groupName + ".tablist", "%2$s", true, groupName, playerName);
        player.setPlayerListName(tabListName);
    }
}
