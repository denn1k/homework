package HW091220;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("R3","2000$","2020");
        RobotCooker robotCooker1 = new RobotCooker("R2","1200$","2017","Pasta","Soda");
        RobotDancer robotDancer1= new RobotDancer("R3","1300$","2018","Macarena","Disco");
        CoffeeRobot coffeeRobot1 = new CoffeeRobot("R1","900 $ ","2019","Arabica","300 ml ");

        System.out.println("Robot says : ");

        robot.work();

        System.out.println("Robot - cooker says : ");

        robotCooker1.work();

        System.out.println("Robot - dancer says : ");
        robotDancer1.work();

        System.out.println("Robot - barista says : ");

        coffeeRobot1.work();
    }
}
