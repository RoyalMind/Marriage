package me.lenis0012.mr.commands;

import java.util.logging.Logger;

import me.lenis0012.mr.Marriage;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MarryCMD implements CommandExecutor
{
	private Marriage plugin;
	public MarryCMD(Marriage i) { plugin = i; }
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmnd, String label, String[] args)
	{
		Logger log = plugin.getLogger();
		
		Player player = null;
		if(sender instanceof Player)
		{
			player = (Player)sender;
		}else
		{
			log.info("Command only available as player.");
		}
		
		if(args.length == 0)
			InfoCommand.showInfo(player);
		
		else if(args[0].equalsIgnoreCase("accept"))
			AcceptCommand.Accept(player);
		
		else if(args[0].equalsIgnoreCase("tp"))
			TpCommand.perfrom(player);
		
		else if(args[0].equalsIgnoreCase("gift"))
			GiftCommand.perfom(player);
		
		else if(args[0].equalsIgnoreCase("divorce"))
			DivorceCommand.perfrom(player);
		
		else if(args[0].equalsIgnoreCase("chat"))
			ChatCommand.perform(player);
		
		else if(args[0].equalsIgnoreCase("home"))
			HomeCommand.perform(player);
		
		else if(args[0].equalsIgnoreCase("sethome"))
			SethomeCommand.perform(player);
		
		else if(args[0].equalsIgnoreCase("list"))
			listCommand.perform(player, args);
		
		else if(args.length == 1)
			MarryCommand.request(player, args);
		
		return true;
	}

}