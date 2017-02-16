package parqueaderoconinterfazmejorada;
/*
autor: master madi "mitch"
año: 2016
version: inferior beta
*/
import VentanasSegundarias.datoscarros;
import VentanasSegundarias.datosmotos;
import VentanasSegundarias.ingresarcarros;
import VentanasSegundarias.ingresarmoto;
import VentanasSegundarias.traercarro;
import VentanasSegundarias.traermoto;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main_de_todo implements ActionListener {

    public class Imagen extends javax.swing.JPanel {

        public Imagen() {
            this.setSize(1000, 600); //se selecciona el tamaño del panel
        }

        //Se crea un método cuyo parámetro debe ser un objeto Graphics
        public void paint(Graphics grafico) {
            Dimension height = getSize();
            //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
            ImageIcon Img = new ImageIcon(getClass().getResource("/Complements/1.jpg"));

            //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
            grafico.drawImage(Img.getImage(), 0, 0, 1000, 600, null);

            setOpaque(false);
            super.paintComponent(grafico);
        }
    }

    private JFrame ventana;
    private JButton c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, close, mover, actualizar;
    private JLabel la1, la2, la3, la4;
    private JTextArea area;
    private JPanel panelp, pm1, pm2, pm3, pm4, pm5, pm6, pm7, pm8, pm9, pm10, pc1, pc2, pc3, pc4, pc5, pc6, pc7, pc8, pc9, pc10;
    int cout = 1, cout2 = 1, cout3 = 1, cout4 = 1, cout5 = 1, cout6 = 1, cout7 = 1, cout8 = 1, cout9 = 1;
    int coutm = 1, coutm2 = 1, coutm3 = 1, coutm4 = 1, coutm5 = 1, coutm6 = 1, coutm7 = 1, coutm8 = 1, coutm9 = 1, coutm10 = 1;
    public Image imagendefondo;
    public URL fondo;
    public int botonprueba;

    /*
         area de las ventanas
     */
    public void setventana(JFrame ventana) {
        this.ventana = ventana;
    }

    /*
        area de la area
     */
    public void setarea(JTextArea area) {
        this.area = area;
    }

    /*
        area del panel
     */
    public void setpanelp(JPanel panelp) {
        this.panelp = panelp;
    }

    /*
        area de los botones
        -sub carros 
     */
    public void setc1(JButton c1) {
        this.c1 = c1;
    }

    public void setc2(JButton c2) {
        this.c2 = c2;
    }

    public void setc3(JButton c3) {
        this.c3 = c3;
    }

    public void setc4(JButton c4) {
        this.c4 = c4;
    }

    public void setc5(JButton c5) {
        this.c5 = c5;
    }

    public void setc6(JButton c6) {
        this.c6 = c6;
    }

    public void setc7(JButton c7) {
        this.c7 = c7;
    }

    public void setc8(JButton c8) {
        this.c8 = c8;
    }

    public void setc9(JButton c9) {
        this.c9 = c9;
    }

    public void setc10(JButton c10) {
        this.c10 = c10;
    }

    /*
        area de los botones 
        -sub motos
     */
    public void setm1(JButton m1) {
        this.m1 = m1;
    }

    public void setm2(JButton m2) {
        this.m2 = m2;
    }

    public void setm3(JButton m3) {
        this.m3 = m3;
    }

    public void setm4(JButton m4) {
        this.m4 = m4;
    }

    public void setm5(JButton m5) {
        this.m5 = m5;
    }

    public void setm6(JButton m6) {
        this.m6 = m6;
    }

    public void setm7(JButton m7) {
        this.m7 = m7;
    }

    public void setm8(JButton m8) {
        this.m8 = m8;
    }

    public void setm9(JButton m9) {
        this.m9 = m9;
    }

    public void setm10(JButton m10) {
        this.m10 = m10;
    }

    /*
        area de los botones de función
     */
    public void setclose(JButton close) {
        this.close = close;
    }

    public void setmover(JButton mover) {
        this.mover = mover;
    }

    public void setactualizar(JButton actualizar) {
        this.actualizar = actualizar;
    }

    /*
        area de los labels
     */
    public void setla1(JLabel la1) {
        this.la1 = la1;
    }

    public void setla2(JLabel la2) {
        this.la2 = la2;
    }

    public void setla3(JLabel la3) {
        this.la3 = la3;
    }

    public void setla4(JLabel la4) {
        this.la4 = la4;
    }

    /*
        area de los metodos segundarios
    -sub motos
     */
    public void setpm1(JPanel pm1) {
        this.pm1 = pm1;
    }

    public void setpm2(JPanel pm2) {
        this.pm2 = pm2;
    }

    public void setpm3(JPanel pm3) {
        this.pm3 = pm3;
    }

    public void setpm4(JPanel pm4) {
        this.pm4 = pm4;
    }

    public void setpm5(JPanel pm5) {
        this.pm5 = pm5;
    }

    public void setpm6(JPanel pm6) {
        this.pm6 = pm6;
    }

    public void setpm7(JPanel pm7) {
        this.pm7 = pm7;
    }

    public void setpm8(JPanel pm8) {
        this.pm8 = pm8;
    }

    public void setpm9(JPanel pm9) {
        this.pm9 = pm9;
    }

    public void setpm10(JPanel pm10) {
        this.pm10 = pm10;
    }

    /*
        area de los metodos segundarios
    -sub carros
     */
    public void setpc1(JPanel pc1) {
        this.pc1 = pc1;
    }

    public void setpc2(JPanel pc2) {
        this.pc2 = pc2;
    }

    public void setpc3(JPanel pc3) {
        this.pc3 = pc3;
    }

    public void setpc4(JPanel pc4) {
        this.pc4 = pc4;
    }

    public void setpc5(JPanel pc5) {
        this.pc5 = pc5;
    }

    public void setpc6(JPanel pc6) {
        this.pc6 = pc6;
    }

    public void setpc7(JPanel pc7) {
        this.pc7 = pc7;
    }

    public void setpc8(JPanel pc8) {
        this.pc8 = pc8;
    }

    public void setpc9(JPanel pc9) {
        this.pc9 = pc9;
    }

    public void setpc10(JPanel pc10) {
        this.pc10 = pc10;
    }

    /*
        area del metodo de panel principal
     */
    public void crearpanel() {
        panelp = new JPanel();
        panelp.setBounds(10, 10, 980, 300);
        panelp.setBackground(Color.gray);
        panelp.setLayout(null);
        //panelp.add(area);

        /*
        area de los paneles segundarios
         */
        pm1 = new JPanel();
        //pm1.setLocation(20, 20);
        pm1.setBounds(20, 180, 80, 100);
        pm1.setBackground(Color.WHITE);
        panelp.add(pm1);
        //diverciòn total
        fondo = this.getClass().getResource("/Complements/1.jpg");
        imagendefondo = new ImageIcon(fondo).getImage();

        /*
        
        fondo=this.getClass().getResource("/Complements/1.jpg");
        imagendefondo=new ImageIcon(fondo).getImage();
        Container contenedoor= getContentPane();
        contenedoor.add(panel);
    }
    public JPanel panel=new JPanel(){
    public void  paintComponent(Graphics g){
        g.drawImage(imagendefondo, 0, 0, getWidth(),getHeight(),this);
    }
    };
    public static void main(String[] arg){
        JPanelBackground pan=new JPanelBackground();
    }
    
         */
        //
        pm2 = new JPanel();
        pm2.setBounds(115, 180, 80, 100);
        pm2.setBackground(Color.WHITE);
        panelp.add(pm2);

        pm3 = new JPanel();
        pm3.setBounds(210, 180, 80, 100);
        pm3.setBackground(Color.WHITE);
        panelp.add(pm3);

        pm4 = new JPanel();
        pm4.setBounds(305, 180, 80, 100);
        pm4.setBackground(Color.WHITE);
        panelp.add(pm4);

        pm5 = new JPanel();
        pm5.setBounds(400, 180, 80, 100);
        pm5.setBackground(Color.WHITE);
        panelp.add(pm5);

        pm6 = new JPanel();
        pm6.setBounds(495, 180, 80, 100);
        pm6.setBackground(Color.WHITE);
        panelp.add(pm6);

        pm7 = new JPanel();
        pm7.setBounds(590, 180, 80, 100);
        pm7.setBackground(Color.WHITE);
        panelp.add(pm7);

        pm8 = new JPanel();
        pm8.setBounds(690, 180, 80, 100);
        pm8.setBackground(Color.WHITE);
        panelp.add(pm8);

        pm9 = new JPanel();
        pm9.setBounds(785, 180, 80, 100);
        pm9.setBackground(Color.WHITE);
        panelp.add(pm9);

        pm10 = new JPanel();
        pm10.setBounds(880, 180, 80, 100);
        pm10.setBackground(Color.WHITE);
        panelp.add(pm10);

        pc1 = new JPanel();
        pc1.setBackground(Color.WHITE);
        pc1.setBounds(20, 20, 80, 100);
        panelp.add(pc1);

        pc2 = new JPanel();
        pc2.setBackground(Color.WHITE);
        pc2.setBounds(115, 20, 80, 100);
        panelp.add(pc2);

        pc3 = new JPanel();
        pc3.setBackground(Color.WHITE);
        pc3.setBounds(210, 20, 80, 100);
        panelp.add(pc3);

        pc4 = new JPanel();
        pc4.setBackground(Color.WHITE);
        pc4.setBounds(305, 20, 80, 100);
        panelp.add(pc4);

        pc5 = new JPanel();
        pc5.setBackground(Color.WHITE);
        pc5.setBounds(400, 20, 80, 100);
        panelp.add(pc5);

        pc6 = new JPanel();
        pc6.setBackground(Color.WHITE);
        pc6.setBounds(495, 20, 80, 100);
        panelp.add(pc6);

        pc7 = new JPanel();
        pc7.setBackground(Color.WHITE);
        pc7.setBounds(590, 20, 80, 100);
        panelp.add(pc7);

        pc8 = new JPanel();
        pc8.setBackground(Color.WHITE);
        pc8.setBounds(690, 20, 80, 100);
        panelp.add(pc8);

        pc9 = new JPanel();
        pc9.setBackground(Color.WHITE);
        pc9.setBounds(785, 20, 80, 100);
        panelp.add(pc9);

        pc10 = new JPanel();
        pc10.setBackground(Color.WHITE);
        pc10.setBounds(880, 20, 80, 100);
        panelp.add(pc10);

    }

    /*
        area de metodo creador de los botones
     */
    public void crearbotones() {
        //botones de los carros

        c1 = new JButton();
        c1.setText("(1)");
        c1.setBackground(Color.ORANGE);
        c1.setBounds(130, 320, 60, 60);
        c1.addActionListener(this);

        c2 = new JButton();
        c2.setText("(2)");
        c2.setBackground(Color.ORANGE);
        c2.setBounds(200, 320, 60, 60);
        c2.addActionListener(this);

        c3 = new JButton();
        c3.setText("(3)");
        c3.setBackground(Color.ORANGE);
        c3.setBounds(270, 320, 60, 60);
        c3.addActionListener(this);

        c4 = new JButton();
        c4.setText("(4)");
        c4.setBackground(Color.ORANGE);
        c4.setBounds(340, 320, 60, 60);
        c4.addActionListener(this);

        c5 = new JButton();
        c5.setText("(5)");
        c5.setBackground(Color.ORANGE);
        c5.setBounds(410, 320, 60, 60);
        c5.addActionListener(this);

        c6 = new JButton();
        c6.setText("(6)");
        c6.setBackground(Color.ORANGE);
        c6.setBounds(480, 320, 60, 60);
        c6.addActionListener(this);

        c7 = new JButton();
        c7.setText("(7)");
        c7.setBackground(Color.ORANGE);
        c7.setBounds(550, 320, 60, 60);
        c7.addActionListener(this);

        c8 = new JButton();
        c8.setText("(8)");
        c8.setBackground(Color.ORANGE);
        c8.setBounds(620, 320, 60, 60);
        c8.addActionListener(this);

        c9 = new JButton();
        c9.setText("(9)");
        c9.setBackground(Color.ORANGE);
        c9.setBounds(690, 320, 60, 60);
        c9.addActionListener(this);

        c10 = new JButton();
        c10.setText("(10)");
        c10.setBackground(Color.ORANGE);
        c10.setBounds(760, 320, 60, 60);
        c10.addActionListener(this);
        //botones de las motos

        m1 = new JButton();
        m1.setText("(1)");
        m1.setBackground(Color.magenta);
        m1.setBounds(130, 400, 60, 60);
        m1.addActionListener(this);

        m2 = new JButton();
        m2.setText("(2)");
        m2.setBackground(Color.magenta);
        m2.setBounds(200, 400, 60, 60);
        m2.addActionListener(this);

        m3 = new JButton();
        m3.setText("(3)");
        m3.setBackground(Color.magenta);
        m3.setBounds(270, 400, 60, 60);
        m3.addActionListener(this);

        m4 = new JButton();
        m4.setText("(4)");
        m4.setBackground(Color.magenta);
        m4.setBounds(340, 400, 60, 60);
        m4.addActionListener(this);

        m5 = new JButton();
        m5.setText("(5)");
        m5.setBackground(Color.magenta);
        m5.setBounds(410, 400, 60, 60);
        m5.addActionListener(this);

        m6 = new JButton();
        m6.setText("(6)");
        m6.setBackground(Color.magenta);
        m6.setBounds(480, 400, 60, 60);
        m6.addActionListener(this);

        m7 = new JButton();
        m7.setText("(7)");
        m7.setBackground(Color.magenta);
        m7.setBounds(550, 400, 60, 60);
        m7.addActionListener(this);

        m8 = new JButton();
        m8.setText("(8)");
        m8.setBackground(Color.magenta);
        m8.setBounds(620, 400, 60, 60);
        m8.addActionListener(this);

        m9 = new JButton();
        m9.setText("(9)");
        m9.setBackground(Color.magenta);
        m9.setBounds(690, 400, 60, 60);
        m9.addActionListener(this);

        m10 = new JButton();
        m10.setText("(10)");
        m10.setBackground(Color.magenta);
        m10.setBounds(760, 400, 60, 60);
        m10.addActionListener(this);
    }

    /*
        area del metodo de los botones de función
     */
    public void creabotonesdefuncion() {
        close = new JButton();
        close.setText("Close");
        close.setBackground(Color.red);
        close.setBounds(900, 540, 90, 25);
        close.addActionListener(this);

        mover = new JButton();
        mover.setText("Mover");
        mover.setBackground(Color.gray);
        mover.setBounds(860, 380, 90, 25);
        mover.addActionListener(this);

        actualizar = new JButton();
        actualizar.setText("Actualizar Vista");
        actualizar.setBackground(Color.CYAN);
        actualizar.setBounds(400, 480, 150, 25);
        actualizar.addActionListener(this);
    }

    /*
        area del metodo que realiza las funciones con los botones
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        /*
            getsource para los botones de función
         */
        if (e.getSource().equals(close)) {
            ventana.dispose();
        }
        if (e.getSource().equals(mover)) {
            //metodo para mover las posiciones

        }
        if (e.getSource().equals(actualizar)) {
            //area.setText("");
            //ParqueaderoConInterfaz par = new ParqueaderoConInterfaz();
            //area.append(par.Parqueadero());
            //pintar imagen
            
        }
        if (e.getSource().equals(c1)) {
            //carros

            int hora = 0, minuto = 0, segundo = 0;
            int hora2, minuto2, segundo2;
            cout = cout + 1;
            if (cout % 2 == 0) {
                ingresarcarros car = new ingresarcarros();
                pc1.setBackground(Color.RED);

                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "1";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                traercarro car2 = new traercarro();
                pc1.setBackground(Color.GREEN);

                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "1";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            if (cout == 1000) {
                cout = 1;
            }
        }
        if (e.getSource().equals(c2)) {
            //carros
            cout = cout + 1;
            if (cout % 2 == 0) {
                //dato.setBoton(2);
                ingresarcarros car = new ingresarcarros();
                pc2.setBackground(Color.RED);
                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "2";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                traercarro car2 = new traercarro();
                pc2.setBackground(Color.GREEN);

                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "2";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (cout == 1000) {
                cout = 1;
            }

        }
        if (e.getSource().equals(c3)) {
            //carros
            cout2 = cout2 + 1;
            if (cout2 % 2 == 0) {
                int a = 3;
                ingresarcarros car = new ingresarcarros();
                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "3";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }

                pc3.setBackground(Color.RED);
            } else {
                traercarro car2 = new traercarro();
                pc3.setBackground(Color.GREEN);

                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "3";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (cout2 == 1000) {
                cout2 = 1;
            }

        }
        if (e.getSource().equals(c4)) {
            //carros

            cout3 = cout3 + 1;
            if (cout3 % 2 == 0) {
                //dato.setBoton(4);
                ingresarcarros car = new ingresarcarros();
                pc4.setBackground(Color.RED);

                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "4";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traercarro car2 = new traercarro();
                pc4.setBackground(Color.GREEN);

                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "4";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (cout3 == 1000) {
                cout3 = 1;
            }
        }
        if (e.getSource().equals(c5)) {
            //carros
            cout4 = cout4 + 1;
            if (cout4 % 2 == 0) {
                //dato.setBoton(5);
                ingresarcarros car = new ingresarcarros();
                pc5.setBackground(Color.RED);

                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "5";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traercarro car2 = new traercarro();
                pc5.setBackground(Color.GREEN);

                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "5";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (cout4 == 1000) {
                cout4 = 1;
            }

        }
        if (e.getSource().equals(c6)) {
            //carros

            cout5 = cout5 + 1;
            if (cout5 % 2 == 0) {
                //dato.setBoton(6);
                ingresarcarros car = new ingresarcarros();
                pc6.setBackground(Color.RED);

                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "6";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traercarro car2 = new traercarro();
                pc6.setBackground(Color.GREEN);
                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "6";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (cout5 == 1000) {
                cout5 = 1;
            }

        }
        if (e.getSource().equals(c7)) {
            //carros

            cout6 = cout6 + 1;
            if (cout6 % 2 == 0) {
                //dato.setBoton(7);
                ingresarcarros car = new ingresarcarros();
                pc7.setBackground(Color.RED);
                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "7";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traercarro car2 = new traercarro();
                pc7.setBackground(Color.GREEN);
                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "7";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (cout6 == 1000) {
                cout6 = 1;
            }

        }
        if (e.getSource().equals(c8)) {
            //carros

            cout7 = cout7 + 1;
            if (cout7 % 2 == 0) {
                //dato.setBoton(8);
                ingresarcarros car = new ingresarcarros();
                pc8.setBackground(Color.RED);
                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "8";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traercarro car2 = new traercarro();
                pc8.setBackground(Color.GREEN);
                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "8";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (cout7 == 1000) {
                cout7 = 1;
            }

        }
        if (e.getSource().equals(c9)) {
            //carros

            cout8 = cout8 + 1;
            if (cout8 % 2 == 0) {
                //dato.setBoton(9);
                ingresarcarros car = new ingresarcarros();
                pc9.setBackground(Color.RED);
                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "9";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traercarro car2 = new traercarro();
                pc9.setBackground(Color.GREEN);
                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "9";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (cout8 == 1000) {
                cout8 = 1;
            }

        }
        if (e.getSource().equals(c10)) {
            //carros

            cout9 = cout9 + 1;
            if (cout9 % 2 == 0) {
                //dato.setBoton(10);
                ingresarcarros car = new ingresarcarros();
                pc10.setBackground(Color.RED);
                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "10";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traercarro car2 = new traercarro();
                pc10.setBackground(Color.GREEN);
                //datos de indice
                datoscarros dato = new datoscarros();
                String cadena = "10";
                try {
                    dato.setBotonNUmero(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (cout9 == 1000) {
                cout9 = 1;
            }
        }
        //motos parqueadero
        if (e.getSource().equals(m1)) {
            //motos
            coutm = coutm + 1;
            if (coutm % 2 == 0) {
                ingresarmoto mo = new ingresarmoto();
                pm1.setBackground(Color.RED);

                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "1";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traermoto mo2 = new traermoto();
                pm1.setBackground(Color.GREEN);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "1";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (coutm == 1000) {
                coutm = 1;
            }
        }
        if (e.getSource().equals(m2)) {
            //motos
            coutm2 = coutm2 + 1;
            if (coutm2 % 2 == 0) {
                ingresarmoto mo = new ingresarmoto();
                pm2.setBackground(Color.RED);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "2";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traermoto mo2 = new traermoto();
                pm2.setBackground(Color.GREEN);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "2";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (coutm2 == 1000) {
                coutm2 = 1;
            }
        }
        if (e.getSource().equals(m3)) {
            //motos
            coutm3 = coutm3 + 1;
            if (coutm3 % 2 == 0) {
                ingresarmoto mo = new ingresarmoto();
                pm3.setBackground(Color.RED);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "3";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traermoto mo2 = new traermoto();
                pm3.setBackground(Color.GREEN);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "3";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (coutm3 == 1000) {
                coutm3 = 1;
            }
        }
        if (e.getSource().equals(m4)) {
            //motos
            coutm4 = coutm4 + 1;
            if (coutm4 % 2 == 0) {
                ingresarmoto mo = new ingresarmoto();
                pm4.setBackground(Color.RED);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "4";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traermoto mo2 = new traermoto();
                pm4.setBackground(Color.GREEN);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "4";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (coutm4 == 1000) {
                coutm4 = 1;
            }
        }
        if (e.getSource().equals(m5)) {
            //motos
            coutm5 = coutm5 + 1;
            if (coutm5 % 2 == 0) {
                ingresarmoto mo = new ingresarmoto();
                pm5.setBackground(Color.RED);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "5";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traermoto mo2 = new traermoto();
                pm5.setBackground(Color.GREEN);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "5";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (coutm5 == 1000) {
                coutm5 = 1;
            }
        }
        if (e.getSource().equals(m6)) {
            //motos
            coutm6 = coutm6 + 1;
            if (coutm6 % 2 == 0) {
                ingresarmoto mo = new ingresarmoto();
                pm6.setBackground(Color.RED);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "6";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traermoto mo2 = new traermoto();
                pm6.setBackground(Color.GREEN);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "6";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (coutm6 == 1000) {
                coutm6 = 1;
            }
        }
        if (e.getSource().equals(m7)) {
            //motos
            coutm7 = coutm7 + 1;
            if (coutm7 % 2 == 0) {
                ingresarmoto mo = new ingresarmoto();
                pm7.setBackground(Color.RED);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "7";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traermoto mo2 = new traermoto();
                pm7.setBackground(Color.GREEN);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "7";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (coutm7 == 1000) {
                coutm7 = 1;
            }
        }
        if (e.getSource().equals(m8)) {
            //motos
            coutm8 = coutm8 + 1;
            if (coutm8 % 2 == 0) {
                ingresarmoto mo = new ingresarmoto();
                pm8.setBackground(Color.RED);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "8";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traermoto mo2 = new traermoto();
                pm8.setBackground(Color.GREEN);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "8";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (coutm8 == 1000) {
                coutm8 = 1;
            }
        }
        if (e.getSource().equals(m9)) {
            //motos
            coutm9 = coutm9 + 1;
            if (coutm9 % 2 == 0) {
                ingresarmoto mo = new ingresarmoto();
                pm9.setBackground(Color.RED);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "9";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traermoto mo2 = new traermoto();
                pm9.setBackground(Color.GREEN);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "9";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (coutm9 == 1000) {
                coutm9 = 1;
            }
        }
        if (e.getSource().equals(m10)) {
            //motos
            coutm10 = coutm10 + 1;
            if (coutm10 % 2 == 0) {
                ingresarmoto mo = new ingresarmoto();
                pm10.setBackground(Color.RED);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "10";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                traermoto mo2 = new traermoto();
                pm10.setBackground(Color.GREEN);
                //datos de indice
                datosmotos dato = new datosmotos();
                String cadena = "10";
                try {
                    dato.setBotonNUmeromotos(cadena);
                } catch (IOException ex) {
                    Logger.getLogger(Main_de_todo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (coutm10 == 1000) {
                coutm10 = 1;
            }
        }
        /*
            getsource para los botones de las motos
         */

    }

    /*
        area del metodo para los labels
     */
    public void crearlabels() {
        la1 = new JLabel();
        la1.setText("P. Motos");
        la1.setForeground(Color.black);
        la1.setBounds(10, 400, 120, 60);

        la2 = new JLabel();
        la2.setText("P. Carros");
        la2.setForeground(Color.BLACK);
        la2.setBounds(10, 320, 120, 60);

        la3 = new JLabel();

        la4 = new JLabel();
    }

    /*
        area de metodo de areade texto
     */
    public void creararea() {
        //area = new JTextArea();
        //area.setBackground(Color.WHITE);
        //area.setBounds(30, 30, 940, 260);
        //no me lo sabia
        //Font font = new Font("Dialog", Font.ITALIC, 12);
        //area.setFont(font);
        // area.add(panelp);

    }

    /*
        area del metodo de ventana 
     */
    public void crearventana() {
        ventana = new JFrame();
        ventana.setTitle("Parquedero");
        ventana.setSize(1000, 600);
        //incercción de elementos  a la ventana
        ventana.add(panelp);

        ventana.add(c1);
        ventana.add(c2);
        ventana.add(c3);
        ventana.add(c4);
        ventana.add(c5);
        ventana.add(c6);
        ventana.add(c7);
        ventana.add(c8);
        ventana.add(c9);
        ventana.add(c10);

        ventana.add(m1);
        ventana.add(m2);
        ventana.add(m3);
        ventana.add(m4);
        ventana.add(m5);
        ventana.add(m6);
        ventana.add(m7);
        ventana.add(m8);
        ventana.add(m9);
        ventana.add(m10);

        ventana.add(close);
        ventana.add(mover);
        ventana.add(actualizar);

        ventana.add(la1);
        ventana.add(la2);
        ventana.add(la3);
        ventana.add(la4);

        //ventana.add(area);
        //comandos importantes
        ventana.setLayout(null);

        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(ventana.DO_NOTHING_ON_CLOSE);

        //pintar imagen
        Imagen img = new Imagen();
        ventana.add(img);
        ventana.repaint();

        ventana.setIconImage(new ImageIcon(getClass().getResource("/Complements/icon.jpg")).getImage());

    }

    /*
        area del constructor
     */
    public Main_de_todo() {
        crearpanel();
        crearbotones();
        creabotonesdefuncion();
        crearlabels();
        //creararea();
        crearventana();
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
    }

    /*
    area del main
     */
    public static void main(String[] arg) {
        Main_de_todo ven = new Main_de_todo();
    }
}
