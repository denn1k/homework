package HW111220;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] b = new int[90];
        int [] c = new int[80];
        Berserk berserk = new Berserk(90, 50, "Double axes", "Medium", "Bloodthirst");
        Magician magician = new Magician(80, 30, "Scepter", "Low", "Fireball");
        Tank tank = new Tank(120, 20, "Club", "Very high", "Heavy armor");
        System.out.println("Participants of the battle : ");
        System.out.println("#1 Berserk : ");
        System.out.println("Health : " + berserk.getHealth());
        System.out.println("Weapon : " + berserk.getWeapon());
        System.out.println("Stamina : " + berserk.getStamina());
        System.out.println("Skill : " + berserk.getSkill());
        System.out.println("Damage : " + berserk.getDamage());
        System.out.println();
        System.out.println("#2 Magician : ");
        System.out.println("Health : " + magician.getHealth());
        System.out.println("Weapon : " + magician.getWeapon());
        System.out.println("Stamina : " + magician.getStamina());
        System.out.println("Skill : " + magician.getTypeOfMagic());
        System.out.println("Damage : " + magician.getDamage());
        System.out.println();
        System.out.println("#3 Tank : ");
        System.out.println("Health : " + tank.getHealth());
        System.out.println("Weapon : " + tank.getWeapon());
        System.out.println("Stamina : " + tank.getStamina());
        System.out.println("Skill : " + tank.getArmor());
        System.out.println("Damage : " + tank.getDamage());
        System.out.println();
        System.out.println("Let the battle begin!");
        System.out.println();

        for (int i = 0;  i < b.length  & i < c.length  ; i++) {
            do {
                b[i] = berserk.getHealth() - magician.getDamage();
                b[i+1] = berserk.getHealth();
                System.out.println("Magician attacks berserk for :" + magician.getDamage());
                System.out.println("Berserk health : " + b[i+1]);
                c[i] = magician.getHealth() - berserk.getDamage();
                c[i+1] = magician.getHealth();
                System.out.println("Berserk attacks magician for : " + berserk.getDamage());
                System.out.println("Magician health : " + c[i+1]);
                if (b[i] == 0) {
                    System.out.println("Magician won! Berserk is dead X_X");
                    break;
                }
                if (c[i] == 0) {
                    System.out.println("Berserk won! Magician is dead X_X");
                    break;
                }
            } while (b[i] >0 & c[i] > 0);


        }
    }
}






