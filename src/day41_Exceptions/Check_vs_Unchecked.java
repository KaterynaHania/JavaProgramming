package day41_Exceptions;

import java.io.FileInputStream;

public class Check_vs_Unchecked {

    public static void main(String[] args) {

        // unchecked exceptions:

        int a = 10;
        int b = 0;

      //  System.out.println(a/b);

        char[] characters = {'A','B','C'};

       // System.out.println(characters[99]);

        final String str = "Wooden Spoon";

        // str = null;

        // System.out.println(str.toUpperCase());


        // checked exception:

        System.out.println("Hello");

        //  Thread.sleep(3000); // checked

        System.out.println("Cydeo");

        //FileInputStream file = new FileInputStream("path of the file");

       // System.out.println("java".charAt(20000));//unchecked




    }






}
