package creational.singleton;

class SingletonMultiThreading {
    private static volatile SingletonMultiThreading instance;
    String value;

    private SingletonMultiThreading(String value) {
        this.value = value;
    }

    static SingletonMultiThreading getInstance(String value) {
        if (instance == null) {
            synchronized (SingletonMultiThreading.class) {
                if (instance == null) {
                    instance = new SingletonMultiThreading(value);
                }
            }
        }
        return instance;
    }
}
