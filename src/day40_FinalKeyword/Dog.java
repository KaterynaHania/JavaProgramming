package day40_FinalKeyword;

public final class Dog extends Animal{
    public Dog(String name, String breed, char gender, String colour, String size, int age) {
        super(name, breed, gender, colour, size, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating dog food");
    }
}
