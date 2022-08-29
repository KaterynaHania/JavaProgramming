package day43_Abstraction.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester("Arina", 19, 'F', 811, "SDET", 110000);
        Developer developer = new Developer("Kateryna", 36, 'F', 291, "Developer", 150000);
        Driver driver = new Driver("Grigore", 38, 'M', 177, "Truck Driver", 70000);
        Teacher teacher = new Teacher("Iryna", 63, 'F', 605, "Math teacher", 90000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(teacher);
        System.out.println("-------------------------");

        tester.bugReport();
        tester.sleep();
        tester.work();
        tester.eat();
        System.out.println("-------------------------");

        developer.sleep();
        developer.work();
        developer.eat();
        System.out.println("-------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();



    }
}
