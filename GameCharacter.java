package Oyun;

public class GameCharacter {
    private String name;
    private int damage;
    private int health;
    private int coin;
    public GameCharacter(String name,int damage,int health,int coin){
        this.damage=damage;
        this.health=health;
        this.coin=coin;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getCoin() {
        return coin;
    }
    public void setCoin(int coin) {
        this.coin = coin;
    }
    
}
