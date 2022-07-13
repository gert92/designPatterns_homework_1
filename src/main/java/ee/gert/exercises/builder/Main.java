package ee.gert.exercises.builder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog.DogBuilder().name("Sally").age(2).type("Labrador").toys(List.of("Squeaky Chicken", "Ball", "Rope")).build();

        System.out.println(dog);
    }
}
