package VentanasSegundarias;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class traercarro implements ActionListener, KeyListener {

    public class Imagen extends javax.swing.JPanel {

        public Imagen() {
            this.setSize(755, 300); //se selecciona el tamaño del panel
        }

        //Se crea un método cuyo parámetro debe ser un objeto Graphics
        public void paint(Graphics grafico) {
            Dimension height = getSize();

            String numero = "src/BaseDeDatos/CARROS/carros.txt";
            String textomar = "";
            File archivo = new File(numero);

            try {
                BufferedReader leer = new BufferedReader(new FileReader(archivo));
                //StringBuffer buffer = new StringBuffer();

                for (int j = 0; j <= 1; j++) {
                    textomar = leer.readLine();
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(traercarro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(traercarro.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource("/BaseDeDatos/CARROS/PICTURES/carro" + textomar + ".jpg"));

            //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, 755, 300, null);

            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

    JFrame ventana;
    JTextField placa, marca;
    JButton ingresar, cancelar, tomarfoto;
    JPanel panelf;
    JLabel la1, la2, la3, la4;
    int horas, minutos, segundos;
    private String boton;

    public void creartextfield() {
        placa = new JTextField();
        placa.setBounds(300, 350, 300, 30);

        marca = new JTextField();
        marca.setBounds(300, 400, 300, 30);
    }

    public void crearbotones() {
        ingresar = new JButton();
        ingresar.setText("Traer");
        ingresar.setBounds(390, 440, 120, 25);
        ingresar.addActionListener(this);

        cancelar = new JButton();
        cancelar.setText("Salir");
        cancelar.setBounds(660, 440, 120, 25);
        cancelar.addActionListener(this);
        /*
        tomarfoto = new JButton();
        tomarfoto.setText("Tomar Foto");
        tomarfoto.setBounds(20, 375, 120, 30);
        tomarfoto.addActionListener(this);
         */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ingresar)) {
            //leer archivo para crear el otro archivo
            String numero = "src/BaseDeDatos/CARROS/carros.txt";
            String textomar = "";
            File archivo = new File(numero);

            try {
                BufferedReader leer = new BufferedReader(new FileReader(archivo));
                //StringBuffer buffer = new StringBuffer();

                for (int j = 0; j <= 1; j++) {
                    textomar = leer.readLine();
                }
                //leer para mostrar
                datoscarros datos = new datoscarros();
                String numero2 = "src/BaseDeDatos/CARROS/REGISTER/carro" + textomar + ".txt";

                File archivo2 = new File(numero2);

                BufferedReader leer2 = new BufferedReader(new FileReader(archivo2));
                //StringBuffer buffer = new StringBuffer();
                String textopla;
                String textomarc;

                for (int i = 0; i <= 1; i++) {
                    textopla = leer2.readLine();
                    placa.setText(textopla);
                }

                for (int j = 0; j < 1; j++) {
                    textomarc = leer2.readLine();
                    marca.setText(textomarc);
                }
                //mostrar el tiempo

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivos faltantes, daño en la integridad del programa");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Archivos faltantes, daño en la integridad del programa");
            }
            //esto es del tiempo

            String numero2 = "src/BaseDeDatos/CARROS/TIMES/carro" + textomar + ".txt";
            File archivo2 = new File(numero2);

            try {
                BufferedReader leer2 = new BufferedReader(new FileReader(archivo2));
                //mostrar el tiempo
                String textopla = "";
                String textomarc = "";
                String textosegu = "";

                for (int i = 0; i <= 1; i++) {
                    textopla = leer2.readLine();
                }

                int convert3 = Integer.parseInt(textopla);

                for (int j = 0; j < 1; j++) {
                    textomarc = leer2.readLine();
                }

                int convert2 = Integer.parseInt(textomarc);

                for (int k = 0; k < 1; ++k) {
                    textosegu = leer2.readLine();
                }

                int convert = Integer.parseInt(textosegu);

                //tiempo de èste instante
                Calendar calendario = Calendar.getInstance();
                int ho, mi, se;
                ho = calendario.get(Calendar.HOUR_OF_DAY);
                mi = calendario.get(Calendar.MINUTE);
                se = calendario.get(Calendar.SECOND);

                //calculo de lo transcurrido
                int nhoras, nminutos, nsegundos;
                nhoras = ho - convert3;
                nminutos = mi - convert2;
                nsegundos = se - convert;
                //conversion a String
                String mostrarhoras, mostrarminutos, mostrarsegundos;
                mostrarhoras = "" + nhoras;
                mostrarminutos = "" + nminutos;
                mostrarsegundos = "" + nsegundos;
                

                //mostrar los tiepos
                horas = nhoras;
                minutos = nminutos;
                segundos = nsegundos;
                
                //convertir los valore a posivo
                if (horas < 0) {
                    horas = horas * -1;
                }
                if (minutos < 0) {
                    minutos = minutos * -1;
                }
                if (segundos < 0) {
                    segundos = segundos * -1;
                }

                la4.setText(horas + " h : " + minutos + " m : " + segundos + " s");

            } catch (FileNotFoundException ex) {
                Logger.getLogger(traercarro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(traercarro.class.getName()).log(Level.SEVERE, null, ex);
            }

            //trae la imagen
            Imagen img = new Imagen();
            //panelf.setBounds(20, 20, 755, 300);
            panelf.add(img);
            panelf.repaint();

        }
        if (e.getSource().equals(cancelar)) {
            ventana.dispose();
        }

        //imagen
        //panelf.add(i)
    }

    public void crearpanelf() {
        panelf = new JPanel();
        panelf.setBounds(20, 20, 755, 300);
        panelf.setBackground(Color.GRAY);
        panelf.setLayout(null);
    }

    public void crearlabels() {
        la1 = new JLabel();
        la1.setText("Marca:");
        la1.setBounds(230, 350, 90, 30);
        la1.setForeground(Color.BLACK);

        la2 = new JLabel();
        la2.setText("Placa:");
        la2.setBounds(230, 400, 90, 30);
        la2.setForeground(Color.BLACK);

        la3 = new JLabel();
        la3.setText("Tiempo transcurrido:");
        la3.setBounds(20, 375, 170, 30);
        la3.setForeground(Color.BLACK);

        la4 = new JLabel();
        la4.setBounds(50, 400, 170, 20);
        la4.setForeground(Color.BLACK);

    }

    public void crearventana() {
        ventana = new JFrame();
        ventana.setTitle("CARRO 1");
        ventana.setSize(800, 500);

        ventana.add(marca);
        ventana.add(placa);
        ventana.add(ingresar);
        ventana.add(cancelar);
        //  ventana.add(tomarfoto);
        ventana.add(panelf);
        ventana.add(la1);
        ventana.add(la2);
        ventana.add(la3);
        ventana.add(la4);

        ventana.setLayout(null);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
    }

    public traercarro() {
        creartextfield();
        crearbotones();
        crearpanelf();
        crearlabels();
        crearventana();
    }

    public static void main(String[] arg) {
        traercarro carro1 = new traercarro();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            //evento de guardar todo, foto e información

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void creareventodetomarfoto() {
        //metodo par atomar la foto en tiempo real
    }
}
