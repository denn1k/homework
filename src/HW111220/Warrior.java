package HW111220;

public abstract class Warrior {
    private int health;
    private int damage;
    private String weapon;
    private String stamina;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Warrior(int health,int damage, String weapon, String stamina) {
        this.health = health;
        this.damage = damage;
        this.weapon = weapon;
        this.stamina = stamina;
    }

    public String getStamina() {
        return stamina;
    }

    public void setStamina(String stamina) {
        this.stamina = stamina;
    }
    public void info() {
    }
   }

