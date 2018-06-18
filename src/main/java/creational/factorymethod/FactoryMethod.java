package creational.factorymethod;

public class FactoryMethod {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod();
        factoryMethod.run();
    }

    private void run() {
        WatchMaker digitalMaker = new DigitalWatchMaker();
        WatchMaker romaMaker = new RomeWatchMaker();
        Watch digitalWatch = digitalMaker.createWatch();
        Watch romeWatch = romaMaker.createWatch();
        digitalWatch.showTime();
        romeWatch.showTime();
        System.out.println("--------------------------------------------------");
        WatchMaker someWatchMaker1 = getWatchMakerByName("Digital");
        Watch someWatch1 = someWatchMaker1.createWatch();
        someWatch1.showTime();
        WatchMaker someWatchMaker2 = getWatchMakerByName("Rome");
        Watch someWatch2 = someWatchMaker2.createWatch();
        someWatch2.showTime();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WatchMaker watchMaker = getWatchMakerByName("China");
        Watch someWatch = watchMaker.createWatch();
        someWatch.showTime();
    }

    private WatchMaker getWatchMakerByName(String maker) {
        if (maker.equals("Digital")){
            return new DigitalWatchMaker();
        }
        else if (maker.equals("Rome")){
            return new RomeWatchMaker();
        }
        throw new RuntimeException("Maker " + maker + " not found");
    }
}
