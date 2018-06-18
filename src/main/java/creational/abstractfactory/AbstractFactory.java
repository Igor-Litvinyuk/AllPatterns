package creational.abstractfactory;

public class AbstractFactory {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();
        abstractFactory.run();
    }

    private void run() {
        DeviceFactory ruFactory = getFactoryByCountryCode("RU");
        Mouse ruMouse = ruFactory.getMouse();
        Keyboard ruKeyboard = ruFactory.getKeyboard();
        Touchpad ruTouchpad = ruFactory.getTouchpad();
        ruMouse.click();
        ruMouse.doubleClick();
        ruMouse.scroll(2);
        ruKeyboard.print();
        ruKeyboard.println();
        ruTouchpad.track(8,32);

        System.out.println("--------------------------------------------------");

        DeviceFactory engFactory = getFactoryByCountryCode("ENG");
        Mouse engMouse = engFactory.getMouse();
        Keyboard engKeyboard = engFactory.getKeyboard();
        Touchpad engTouchpad = engFactory.getTouchpad();

        engMouse.click();
        engMouse.doubleClick();
        engMouse.scroll(2);
        engKeyboard.print();
        engKeyboard.println();
        engTouchpad.track(8,32);
    }

    private DeviceFactory getFactoryByCountryCode(String language){
        switch (language){
            case "RU":
                return new RuDeviceFactory();
            case "ENG":
                return new EngDeviceFactory();
            default:
                throw  new RuntimeException("Unsupported country code: " + language);
        }
    }
}
