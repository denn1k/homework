package HW091220;

public class RobotCooker extends Robot {
    private String dishes;
    private String drinks;

    public RobotCooker(String model, String price, String year, String dishes,String drinks) {
        super(model, price, year);
        this.dishes = dishes;
        this.drinks = drinks;
    }
    @Override
    public void work() {
        System.out.println("Just cook dishes :) ");

    }
}
