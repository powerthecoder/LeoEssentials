package xyz.powerthecoder.Essentials;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

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
		
		
		// GameMode
		if (label.equalsIgnoreCase("gm")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("You are console. Your already in God Mode!");
			}
			if (args[0].equalsIgnoreCase("0")) {
				Player player = (Player) sender;
				GameMode mode = player.getGameMode();
				player.setGameMode(GameMode.SURVIVAL);
				player.sendMessage("You are now in Survival");
			}
			if (args[0].equalsIgnoreCase("1")) {
				Player player = (Player) sender;
				GameMode mode = player.getGameMode();
				player.setGameMode(GameMode.CREATIVE);
				player.sendMessage("You are now in Creative");
			}
			
		}
		if (label.equalsIgnoreCase("gmc")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("You are console. Your already in God Mode!");
			}
			Player player = (Player) sender;
			GameMode mode = player.getGameMode();
			player.setGameMode(GameMode.CREATIVE);
			player.sendMessage("You are now in Creative");
		}
		if (label.equalsIgnoreCase("gms")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("You are console. Your already in God Mode!");
			}
			Player player = (Player) sender;
			GameMode mode = player.getGameMode();
			player.setGameMode(GameMode.SURVIVAL);
			player.sendMessage("You are now in Survival");
		}
		
		
		// Speed Effect
		if (label.equalsIgnoreCase("speed")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("Your Console... Go away");
			}
			Player player = (Player) sender;
			String arg_1 = args[0];
			int arg1 = Integer.parseInt(arg_1);
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999, arg1));
            player.sendMessage("You are now fast :)");
		}
		
		//BroadCast
		if (label.equalsIgnoreCase("bc")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("Sending Broadcast...");
				Bukkit.getServer().broadcastMessage(args[0]);
			}
			Player player = (Player) sender;
			player.sendMessage("Sending Broadcast...");
			Bukkit.getServer().broadcastMessage(args[0]);
		}
		
		
		return false;
	}

}
