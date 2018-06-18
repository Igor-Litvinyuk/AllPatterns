package creational.singleton;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        System.out.println("В однопоточной среде:");
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();
        Main main1 = new Main();
        Main main2 = new Main();
        System.out.println("Два рызных объекта, разные хешкоды:");
        System.out.println(main1.hashCode());
        System.out.println(main2.hashCode());
        System.out.println("anotherSingleton создан не будет, останется хешкод singleton:");
        System.out.println(singleton.hashCode());
        System.out.println(anotherSingleton.hashCode());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------------");
        System.out.println("В многопоточной среде:");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }
}
