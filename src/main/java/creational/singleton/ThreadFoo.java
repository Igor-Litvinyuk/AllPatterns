package creational.singleton;

public class ThreadFoo implements Runnable {
    @Override
    public void run() {
        SingletonMultiThreading singletonMultiThreading = SingletonMultiThreading.getInstance("FOO");
        System.out.println(singletonMultiThreading.value);
    }
}
