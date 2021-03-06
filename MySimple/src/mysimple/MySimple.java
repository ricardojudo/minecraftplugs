/***
 * Excerpted from "Learn to Program with Minecraft Plugins",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/ahmine for more book information.
***/
package mysimple;

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Sound;


public class MySimple extends JavaPlugin {
  public static Logger log = Logger.getLogger("Minecraft");
  public void onEnable() {
    log.info("[MySimple] Start up.");
  }
  public void onReload() {
    log.info("[MySimple] Server reloaded.");
  }
  public void onDisable() {
    log.info("[MySimple] Server stopping.");
  }
  public boolean onCommand(CommandSender sender, Command command, 
                           String commandLabel, String[] args) {         
    if (commandLabel.equalsIgnoreCase("mysimple")) {
      if (sender instanceof Player) { 
        Player me = (Player)sender;
        // Put your code after this line:

        int myAge = 99;
        int myAgeDoubled = myAge * 2;
        float volume = 0.1f;
        float pitch = 1.0f;
        double dayOnIo = 152853.5047;
        String myName = "Andy Hunt";
    
        me.sendMessage("My age " + myAge);
        me.sendMessage("My age doubled " + myAgeDoubled);
        me.sendMessage("A day on Io " + dayOnIo);    
        me.sendMessage("My name " + myName);

        me.playSound(me.getLocation(), Sound.ENTITY_GHAST_SCREAM, volume, pitch);

        // ...and finish your code before this line.
        return true;
        }
    }
    return false;
  }
}
