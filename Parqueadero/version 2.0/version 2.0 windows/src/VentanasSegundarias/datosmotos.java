package VentanasSegundarias;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class datosmotos {

    private String placa2;
    private String cilindraje2;
    private String boton2;

    private int horas;
    private int minutos;
    private int segundos;
    private String botont;

    public datosmotos(String placa2, String cilindraje2, String boton2, int horas, int minutos, int segundos, String botont) {
        this.placa2 = placa2;
        this.cilindraje2 = cilindraje2;
        this.boton2 = boton2;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.botont = botont;
    }

    public datosmotos() {
        placa2 = "palca";
        cilindraje2 = "cilindraje";
        boton2 = "boton2";
        horas = 1;
        minutos = 1;
        segundos = 1;
        botont = "botont";
    }

    //motos
    public void setdatosmoto(String placam, String cilindraje, String botonm) throws IOException {
        this.placa2 = placam;
        this.cilindraje2 = cilindraje;
        this.boton2 = botonm;
        //crear directorio
        File archivo = new File("C:\\MITCHCODE\\PARQUEADERO\\BaseDeDatos\\MOTOS\\REGISTER\\moto" + boton2 + ".txt");
        FileWriter arc = new FileWriter(archivo);
        PrintWriter escribir = new PrintWriter(arc);
        escribir.println();
        escribir.append(cilindraje2);
        escribir.println();
        escribir.append(placa2);
        escribir.close();
    }

    public void setBotonNUmeromotos(String botonm) throws IOException {
        this.boton2 = botonm;

        File archivo2 = new File("C:\\MITCHCODE\\PARQUEADERO\\BaseDeDatos\\MOTOS\\motos.txt");
        FileWriter arc2 = new FileWriter(archivo2);
        PrintWriter escribir2 = new PrintWriter(arc2);

        escribir2.println();
        escribir2.append(boton2);
        escribir2.close();
    }

    public void tiemopo(int horas2, int minutos2, int segundos2, String botontt) throws IOException {
        this.horas = horas2;
        this.minutos = minutos2;
        this.segundos = segundos2;
        this.botont = botontt;

        File archivo3 = new File("C:\\MITCHCODE\\PARQUEADERO\\BaseDeDatos\\MOTOS\\TIMES/moto" + botont + ".txt");
        FileWriter arc3 = new FileWriter(archivo3);
        PrintWriter escribir3 = new PrintWriter(arc3);
        String hor, min, seg;
        hor = "" + horas;
        min = "" + minutos;
        seg = "" + segundos;

        escribir3.println();
        escribir3.append(hor);
        escribir3.println();
        escribir3.append(min);
        escribir3.println();
        escribir3.append(seg);
        escribir3.close();

    }
}
