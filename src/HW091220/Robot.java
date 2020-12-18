package HW091220;

public class Robot {
private String model;
private String price;
private String year;

    public Robot(String model, String price, String year) {
        this.model = model;
        this.price = price;
        this.year = year;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public void work() {
        System.out.println("Just work :) ");
    }
}
