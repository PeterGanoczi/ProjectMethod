package sk.itsovy.ganoczi;

public class Main {
    public static void main(String[] args) {
        Flower flower=new Flower();

        MyInterface ref=flower::printFlowerName;

        ref.print("Cactus");
    }
}
