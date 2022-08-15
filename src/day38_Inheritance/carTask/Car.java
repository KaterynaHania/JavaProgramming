package day38_Inheritance.carTask;

public class Car {

    public String brand, model;
    public int year;
    public double price;
    public String colour;
    public int miles;

    public Car(String brand, String model, int year, double price, String colour, int miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.colour = colour;
        this.miles = miles;
    }

   public void start(){
        System.out.println(brand+" "+model+" is starting");
    }

    public void drive(){
        System.out.println(brand+" "+model+" is driving");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price= $" + price +
                ", colour='" + colour + '\'' +
                ", miles=" + miles +
                '}';
    }
}
