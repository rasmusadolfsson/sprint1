package sprint1.uppgift3;

public class Person {
    private String name;
    private int age;

    Person(){}

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
