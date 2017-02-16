package VentanasSegundarias;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.xml.bind.DatatypeConverter;

public class datoscarros {

    private String placa;
    private String marca;
    private String boton;

    private int horas;
    private int minutos;
    private int segundos;
    private String botont;

    public datoscarros(String placa, String marca, String boton, int horas, int minutos, int segundos, String botont) {
        this.placa = placa;
        this.marca = marca;
        this.boton = boton;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.botont = botont;
    }



    public datoscarros() {
        //carros
        placa = "placa";
        marca = "marca";
        boton = "boton";

        horas = 1;
        minutos = 1;
        segundos = 1;
        botont= "botont";
        
    }

    //carros
    public void setdatos(String placav, String marcav, String botonv) throws IOException {
        this.placa = placav;
        this.marca = marcav;
        this.boton = botonv;
        //crear directorio
        File archivo = new File("C:\\MITCODE\\PARQUEADERO\\BaseDeDatos\\CARROS\\REGISTER\\carro" + boton + ".txt");
        FileWriter arc = new FileWriter(archivo);
        PrintWriter escribir = new PrintWriter(arc);
        escribir.println();
        escribir.append(marca);
        escribir.println();
        escribir.append(placa);
        escribir.close();
    }

    public void setBotonNUmero(String botonv) throws IOException {
        this.boton = botonv;

        File archivo2 = new File("C:\\MITCODE\\PARQUEADERO\\BaseDeDatos\\CARROS\\carros.txt");
        FileWriter arc2 = new FileWriter(archivo2);
        PrintWriter escribir2 = new PrintWriter(arc2);

        escribir2.println();
        escribir2.append(boton);
        escribir2.close();
    }

    public void tiemopo(int horas2, int minutos2, int segundos2, String botontt) throws IOException {
        this.horas = horas2;
        this.minutos = minutos2;
        this.segundos = segundos2;
        this.botont = botontt;

        File archivo3 = new File("C:\\MITCODE\\PARQUEADERO\\BaseDeDatos\\CARROS\\TIMES\\carro" + botont + ".txt");
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
