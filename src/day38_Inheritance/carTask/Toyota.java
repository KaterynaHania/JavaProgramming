package day38_Inheritance.carTask;

public class Toyota extends Car {

    public Toyota(String model, int year, double price, String colour, int miles) {
        super("Toyta", model, year, price, colour, miles);
    }

    public void reliabile(){
        System.out.println(brand+" "+model+" is reliable");
    }

}
