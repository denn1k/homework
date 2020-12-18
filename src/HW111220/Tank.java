package HW111220;

public class Tank extends Warrior {
    private String armor;

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    Tank(int health,int damage, String weapon, String stamina, String armor) {
        super(120,20, "Club", "Very high");
        this.armor = armor;
    }

    @Override
    public void info() {
        System.out.println("Health" + getHealth());
        System.out.println("Weapon" + getWeapon());
        System.out.println("Stamina" + getStamina());
        System.out.println("Armor" + armor);
    }
}