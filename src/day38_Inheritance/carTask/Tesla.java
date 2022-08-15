package day38_Inheritance.carTask;

public class Tesla extends Car{
    public Tesla(String model, int year, double price, String colour, int miles) {
        super("Tesla", model, year, price, colour, miles);
    }
    public void autoPilot(){
        System.out.println(brand+" "+model+" is autopilot mode");
    }


}
