package sk.itsovy.ganoczi;

public class Main {
    public static void main(String[] args) {
        Flower flower=new Flower();
        // mame tu nejaky interface
        MyInterface ref2=flower::printFlowerName;

        ref2.print("Cactus");
    }
}
