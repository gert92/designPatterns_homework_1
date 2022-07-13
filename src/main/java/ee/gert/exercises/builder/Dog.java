package ee.gert.exercises.builder;

import java.util.List;

class Dog {
    public static class DogBuilder {
        private String name;
        private String type;
        private Integer age;
        private List<String> toys;

        public DogBuilder(){}

        public Dog build() {
            return new Dog(this);
        }

        public DogBuilder name(String name){
            this.name = name;
            return this;
        }
        public DogBuilder type(String type){
            this.type = type;
            return this;
        }
        public DogBuilder age(Integer age){
            this.age = age;
            return this;
        }
        public DogBuilder toys(List<String> toys){
            this.toys = toys;
            return this;
        }
    }

    private final String name;
    private final String type;
    private final Integer age;
    private final List<String> toys;

    private Dog(DogBuilder dogBuilder){
        this.name = dogBuilder.name;
        this.type = dogBuilder.type;
        this.age = dogBuilder.age;
        this.toys = dogBuilder.toys;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", toys=" + toys +
                '}';
    }



}


