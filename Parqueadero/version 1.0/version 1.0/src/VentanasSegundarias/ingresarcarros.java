package VentanasSegundarias;

import camera.CamaraCarros;
import java.awt.Color;
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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ingresarcarros implements ActionListener, KeyListener {

    JFrame ventana;
    JTextField placa, marca;
    JButton ingresar, cancelar, tomarfoto;
    //JPanel panelf;
    JLabel la1, la2;
    int boton;

    public void creartextfield() {
        placa = new JTextField();
        placa.setBounds(300, 20, 300, 30);

        marca = new JTextField();
        marca.setBounds(300, 80, 300, 30);
    }

    public void crearbotones() {
        ingresar = new JButton();
        ingresar.setText("Ingresar");
        ingresar.setBounds(390, 130, 120, 25);
        ingresar.addActionListener(this);

        cancelar = new JButton();
        cancelar.setText("Cerrar");
        cancelar.setBounds(660, 140, 120, 25);
        cancelar.addActionListener(this);

        tomarfoto = new JButton();
        tomarfoto.setText("Tomar Foto");
        tomarfoto.setBounds(20, 70, 120, 30);
        tomarfoto.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ingresar)) {
            //evento de guardar todo, foto e información

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
                //crear archivo ya con la informaciòn
                datoscarros datos = new datoscarros();
                String pla = placa.getText();
                String mar = marca.getText();

                datos.setdatos(pla, mar, textomar);

                //tiempo de la puta interfaz
                Calendar calendario = Calendar.getInstance();
                int hora, minuto, segundo;
                hora = calendario.get(Calendar.HOUR_OF_DAY);
                minuto = calendario.get(Calendar.MINUTE);
                segundo = calendario.get(Calendar.SECOND);

                datos.tiemopo(hora, minuto, segundo, textomar);

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Archivos faltantes, daño en la integridad del programa");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Archivos faltantes, daño en la integridad del programa");
            }

            //retardo
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CamaraCarros.class.getName()).log(Level.SEVERE, null, ex);
            }

            ventana.dispose();
        }
        if (e.getSource().equals(cancelar)) {
            ventana.dispose();
        }
        if (e.getSource().equals(tomarfoto)) {
            //evento de tomar una foto
            //creareventodetomarfoto();
            SwingUtilities.invokeLater(new CamaraCarros());
        }
    }


    /*public void crearpanelf() {
        panelf = new JPanel();
        panelf.setBounds(20, 20, 755, 300);
        panelf.setBackground(Color.GRAY);
    }*/
    public void crearlabels() {
        la1 = new JLabel();
        la1.setText("Placa:");
        la1.setBounds(230, 20, 90, 30);
        la1.setForeground(Color.BLACK);

        la2 = new JLabel();
        la2.setText("Marca:");
        la2.setBounds(230, 80, 90, 30);
        la2.setForeground(Color.BLACK);

    }

    public void crearventana() {
        ventana = new JFrame();
        ventana.setTitle("CARROS");
        ventana.setSize(800, 200);

        ventana.add(marca);
        ventana.add(placa);
        ventana.add(ingresar);
        ventana.add(cancelar);
        ventana.add(tomarfoto);
        //  ventana.add(panelf);
        ventana.add(la1);
        ventana.add(la2);

        ventana.setLayout(null);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
    }

    public ingresarcarros() {
        creartextfield();
        crearbotones();
        //crearpanelf();
        crearlabels();
        crearventana();
    }

    public static void main(String[] arg) {
        ingresarcarros carro1 = new ingresarcarros();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            //evento de guardar todo, foto e información
            creareventodetomarfoto();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void creareventodetomarfoto() {
        //metodo par atomar la foto en tiempo real
    }
}
