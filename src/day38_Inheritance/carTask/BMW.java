package day38_Inheritance.carTask;

public class BMW extends Car{
    public BMW(String model, int year, double price, String colour, int miles) {
        super("BMW", model, year, price, colour, miles);
    }

    public void start(){
        System.out.println("Call mechanic or jump start to start "+brand+" "+model);
    }

    public void breaksDown(){
        System.out.println(brand+" "+model+" breaks down");
    }

    public void racing(){
        System.out.println(brand+" "+model+" is driving");
    }
}
