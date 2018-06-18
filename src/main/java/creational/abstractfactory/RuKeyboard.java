package creational.abstractfactory;

public class RuKeyboard implements Keyboard {
    public void print() {
        System.out.print("Печатаем строку");
    }

    public void println() {
        System.out.println("Печатаем строку с переводом строки");
    }
}
