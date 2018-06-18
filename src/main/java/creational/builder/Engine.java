package creational.builder;

public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void of() {
        started = false;
    }

    boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    double getVolume() {
        return volume;
    }

    double getMileage() {
        return mileage;
    }
}