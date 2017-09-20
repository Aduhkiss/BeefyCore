public class beef implements CommandExecutor {
  
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    String arg1 = args[0];
    
    if(sender instanceof Player) {
      
      return true;
    }
    else {
     sender.sendMessage("You must run this command in game!");
      return false;
    }
  }
}
