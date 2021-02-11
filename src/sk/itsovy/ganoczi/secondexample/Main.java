package sk.itsovy.ganoczi.secondexample;

public class Main {
    public static void main(String[] args) {

        MyInterface ref=Example::new;
        ref.print(10,5);
    }
}
