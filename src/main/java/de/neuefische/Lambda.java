package de.neuefische;

public class Lambda {

    public static void main(String[] args) {
        //Runnable Klassik = Interface mit einer Methode mit überschrieben werden
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("My Runnable runs away");
            }
        };

        //Runnable als Lambda -> Methode bleibt "anonym" und wird funktional ausgeführt!
        Runnable run2 = () -> System.out.println("Run2 go!");
    }
}
