package xyz.powerthecoder.Essentials;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		// about
		if (label.equalsIgnoreCase("about")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("---------Leos Essentials--------");
				sender.sendMessage("      Developer: Leo Power");
				sender.sendMessage("GitHub: github.com/powerthecoder/");
				sender.sendMessage("  Website: powerthecoder.xyz/");
				sender.sendMessage("--------------------------------");
			}
			Player player = (Player) sender;
			player.sendMessage("---------Leos Essentials--------");
			player.sendMessage("      Developer: Leo Power");
			player.sendMessage("GitHub: github.com/powerthecoder/");
			player.sendMessage("  Website: powerthecoder.xyz/");
			player.sendMessage("--------------------------------");
		}
		
		
		return false;
	}

}
