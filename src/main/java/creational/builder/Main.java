package creational.builder;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(builder);
        Car car1 = builder.getResult();
        System.out.println("Car built:\n" + car1.getType());
        director.constructSportsCar(manualBuilder);
        Manual carManual1 = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual1.print());
        System.out.println("--------------------------------------------------");

        director.constructCityCar(builder);
        Car car2 = builder.getResult();
        System.out.println("Car built:\n" + car2.getType());
        director.constructCityCar(manualBuilder);
        Manual carManual2 = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual2.print());
        System.out.println("--------------------------------------------------");

        director.constructSUV(builder);
        Car car3 = builder.getResult();
        System.out.println("Car built:\n" + car3.getType());
        director.constructSUV(manualBuilder);
        Manual carManual3 = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual3.print());
        System.out.println("--------------------------------------------------");
    }
}