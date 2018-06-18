package creational.prototype;

public class Prototype {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.run();
    }

    private void run() {
        System.out.println("Копирование через конкретный класс:");
        Human vlad = new Human("Vlad", 25);
        Human vladCopy = (Human) vlad.copy();
        System.out.println(vlad);
        System.out.println(vladCopy);
        System.out.println("--------------------------------------------------");
        System.out.println("Копирование через фабрику:");
        HumanFactory humanFactory = new HumanFactory(vladCopy);
        Human copyVladCopy = humanFactory.makeCopy();
        System.out.println(copyVladCopy);
        System.out.println("--------------------------------------------------");
        System.out.println("Копирование через явную установку прототипа:");
        humanFactory.setPrototype(new Human("Andrey", 23));
        Human newHuman = humanFactory.makeCopy();
        System.out.println(newHuman);
    }
}
