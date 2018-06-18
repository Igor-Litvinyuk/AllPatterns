package creational.abstractfactory;

public class EngKeyboard implements Keyboard {

    public void print() {
        System.out.print("Print the line");
    }

    public void println() {
        System.out.println("Print the line with line feed");
    }
}
