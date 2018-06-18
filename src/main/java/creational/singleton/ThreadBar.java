package creational.singleton;

public class ThreadBar implements Runnable {
    @Override
    public void run() {
        SingletonMultiThreading singletonMultiThreading = SingletonMultiThreading.getInstance("BAR");
        System.out.println(singletonMultiThreading.value);
    }
}
