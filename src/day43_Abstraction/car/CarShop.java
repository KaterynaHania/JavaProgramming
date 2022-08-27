package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

       Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Audi audi = new Audi("Q7", "Red", 2020, 45000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("--------------------------------------");

        honda.setColor("Blue");
        audi.setColor("Pink");
        tesla.setColor("Green");

        honda.setPrice(20000);
        audi.setPrice(35000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

    }
}
