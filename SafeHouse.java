package Oyun;

public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player){
        super(player,"Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in safe house !");
        System.out.println("You are healed !");
        this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
        return true;
    }
    
}
