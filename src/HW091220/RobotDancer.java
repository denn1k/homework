package HW091220;

public class RobotDancer extends Robot {
    private String dance;
    private String music;

    public RobotDancer(String model, String price, String year, String dance,String music) {
        super("R2", "1200$", "2017");
        this.dance = dance;
        this.music = music;
    }
    @Override
    public void work() {
        System.out.println("Just dance :) ");
    }
}
