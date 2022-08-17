package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;
    final static String name;

    static {
        name = "EU09";
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

       final double pi = 3.14; //can not be reassigned


        final String name;

        name = "Java";

        System.out.println(name);

        System.out.println("_______________________________");

        FinalVariable obj = new FinalVariable("Oct/1");
        System.out.println(obj.birthDay);


        System.out.println("_______________________________");


        System.out.println(FinalVariable.name);

    }




}
