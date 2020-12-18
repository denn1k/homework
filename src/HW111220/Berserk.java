package HW111220;

public class Berserk extends Warrior {
    private String skill;

    Berserk(int health,int damage, String weapon, String stamina, String skill) {
        super (90,50,"Double Axes","Medium");
        this.skill = skill;

    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    @Override
    public void info() {
    }

}
