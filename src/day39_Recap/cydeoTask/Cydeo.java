package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

    Developer developer = new Developer("Kateryna", 36, 'F', 2910, 120000);


    Tester tester = new Tester("Arina", 19, 'F', 811, "SDET", 110000);


    Teacher teacher = new Teacher("Iryna", 63, 'F', 605, "MathTeacher",80000);


    Student student = new Student("Lidiia", 59, 'F', 1962, "SDET");


        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("-----------------------------------");

        developer.setAge(37);

        System.out.println(developer.getAge());
        System.out.println(developer);

        System.out.println("-----------------------------------");

        developer.work();
        tester.work();
        teacher.work();






    }
}
