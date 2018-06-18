package creational.abstractfactory;

public class EngDeviceFactory implements DeviceFactory {
    public Mouse getMouse() {
        return new EngMouse();
    }

    public Keyboard getKeyboard() {
        return new EngKeyboard();
    }

    public Touchpad getTouchpad() {
        return new EngTouchpad();
    }
}
