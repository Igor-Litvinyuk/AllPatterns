package creational.prototype;

public class Human implements Copyable{
    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Object copy() {
        return new Human(name, age);
    }
}
