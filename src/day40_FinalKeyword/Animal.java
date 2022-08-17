package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;
    private final char genger;
    private final String colour;
    private String size;
    private int age;


    public Animal(String name, String breed, char genger, String colour, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.genger = genger;
        this.colour = colour;
        this.size = size;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGenger() {
        return genger;
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
