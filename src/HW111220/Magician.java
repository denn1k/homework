package HW111220;

public class Magician extends Warrior {
    private String typeOfMagic;

    Magician(int health,int damage, String weapon, String stamina, String typeOfMagic) {
        super(80,30, "Scepter", "Low");
        this.typeOfMagic = typeOfMagic;
    }

    public String getTypeOfMagic() {
        return typeOfMagic;
    }

    public void setTypeOfMagic(String typeOfMagic) {
        this.typeOfMagic = typeOfMagic;
    }

    @Override
    public void info() {

    }
}
