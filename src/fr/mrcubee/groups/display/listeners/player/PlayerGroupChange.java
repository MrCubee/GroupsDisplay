package fr.mrcubee.groups.display.listeners.player;

import fr.mrcubee.groups.bukkit.events.PlayerGroupChangeEvent;
import fr.mrcubee.groups.display.GroupsDisplay;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerGroupChange implements Listener {

    @EventHandler
    public void onPlayerGroupChange(PlayerGroupChangeEvent event) {
        GroupsDisplay.setPlayerListDisplay(event.getPlayer(), event.getNewGroup());
    }
}
