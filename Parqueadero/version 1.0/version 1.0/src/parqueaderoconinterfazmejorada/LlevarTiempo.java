package parqueaderoconinterfazmejorada;

import VentanasSegundarias.traercarro;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LlevarTiempo {

    public static void main(String[] arg) {

       Calendar calendario = Calendar.getInstance();
       int hora, minuto, segundo;
       hora = calendario.get(Calendar.HOUR_OF_DAY);
       minuto = calendario.get(Calendar.MINUTE);
        segundo = calendario.get(Calendar.SECOND);

        System.out.println("hora: " + hora + " minutos: " + minuto + " segundos: " + segundo);

        Calendar calendariogrego = new GregorianCalendar();
        int hora2, minuto2, segun2;
        hora2 = calendariogrego.get(Calendar.HOUR_OF_DAY);
        minuto2 = calendariogrego.get(Calendar.MINUTE);
        segun2 = calendariogrego.get(Calendar.SECOND);
       System.out.println("hora: " + hora2 + " minutos: " + minuto2 + " segundos: " + segun2);
//        

//        String  hola = "kk "+hora;
//        
//        System.out.println(hola);
//        
//        String meter=hola;
//        int prueba;
//        try {
//            prueba=50/0;
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
        //leer archivo para crear el otro archivo
//        String numero2 = "src/BaseDeDatos/CARROS/TIMES/carro1.txt";
//
//        File archivo2 = new File(numero2);
//
//        try {
//            BufferedReader leer = new BufferedReader(new FileReader(archivo2));
//            String textopla = "";
//            String textomarc = "";
//            String textosegu = "";
//
//            for (int i = 0; i <= 1; i++) {
//                textopla = leer.readLine();
//            }
//            System.out.println("este es el metodo de la placa:  " + textopla);
//
//            int convert3 = Integer.parseInt(textopla);
//            convert3 = convert3 + 5;
//            System.out.println(convert3);
//
//            for (int j = 0; j < 1; j++) {
//                textomarc = leer.readLine();
//            }
//            System.out.println("minutos: " + textomarc);
//
//            int convert2 = Integer.parseInt(textomarc);
//            convert2 = convert2 + 5;
//            System.out.println(convert2);
//            for (int k = 0; k < 1; ++k) {
//                textosegu = leer.readLine();
//            }
//            System.out.println("segundos:  " + textosegu);
//
//            int convert = Integer.parseInt(textosegu);
//            convert = convert + 5;
//            System.out.println(convert);
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(traercarro.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(traercarro.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
