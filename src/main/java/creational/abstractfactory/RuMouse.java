package creational.abstractfactory;

public class RuMouse implements Mouse {
    public void click() {
        System.out.println("Щелчок мышью");
    }

    public void doubleClick() {
        System.out.println("Двойной щелчок мышью");
    }

    public void scroll(int direction) {
        if (direction>0){
            System.out.println("Скроллим вверх");
        }
        else if (direction<0){
            System.out.println("Скроллим вниз");
        }
        else {
            System.out.println("Не скроллим");
        }
    }
}
