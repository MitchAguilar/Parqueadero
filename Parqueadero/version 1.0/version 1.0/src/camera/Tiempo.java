package camera;

import parqueaderoconinterfazmejorada.JPanelBackground;

public class Tiempo {

    public static void main(String[] args) {
        System.out.println("Hola...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("hola 2 segundos despues...");
    }

}
