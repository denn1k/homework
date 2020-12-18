package HW091220;

public class CoffeeRobot extends  Robot {
    private String sortOfCoffee;
    private String cupCapacity;

    CoffeeRobot(String model, String price, String year,String sortOfCoffee,String cupCapacity) {
        super("R1", "1000$", "2018");
        this.sortOfCoffee = sortOfCoffee;
        this.cupCapacity = cupCapacity;

    }
    @Override
    public void work()
    {
        System.out.println("Just make coffee :) ");
    }
}
