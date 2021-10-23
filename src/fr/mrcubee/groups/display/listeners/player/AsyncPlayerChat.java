package fr.mrcubee.groups.display.listeners.player;

import fr.mrcubee.groups.Group;
import fr.mrcubee.groups.bukkit.Groups;
import fr.mrcubee.langlib.Lang;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AsyncPlayerChat implements Listener {

    private Groups groups;

    public AsyncPlayerChat(Groups groups) {
        this.groups = groups;
    }

    @EventHandler
    public void onAsyncPlayerChat(AsyncPlayerChatEvent event) {
        Group group = groups.getGroupManager().getPlayerGroup(event.getPlayer());
        String groupName = group != null ? group.getName() : "null";
        String chatFormat = Lang.getMessage("group." + groupName + ".chat.format", "<%%s> %%s", true, groupName);

        event.setFormat(chatFormat);
    }

}
