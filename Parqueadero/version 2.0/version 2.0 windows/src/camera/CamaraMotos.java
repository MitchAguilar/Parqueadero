package camera;

import VentanasSegundarias.traercarro;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.Thread.UncaughtExceptionHandler;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamDiscoveryEvent;
import com.github.sarxos.webcam.WebcamDiscoveryListener;
import com.github.sarxos.webcam.WebcamEvent;
import com.github.sarxos.webcam.WebcamListener;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamPicker;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Proof of concept of how to handle webcam video stream from Java
 *
 * @author Bartosz Firyn (SarXos)
 */
public class CamaraMotos extends JFrame implements ActionListener, Runnable, WebcamListener, WindowListener, UncaughtExceptionHandler, ItemListener, WebcamDiscoveryListener {

    private static final long serialVersionUID = 1L;

    private Webcam webcam = null;
    private WebcamPanel panel = null;
    private WebcamPicker picker = null;
    private JButton boton = new JButton("Tomar Foto");
    private String boton2;

    @Override
    public void run() {

        Webcam.addDiscoveryListener(this);

        setTitle("Java Webcam Capture POC");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        addWindowListener(this);

        picker = new WebcamPicker();
        picker.addItemListener(this);

        webcam = picker.getSelectedWebcam();

        if (webcam == null) {
            System.out.println("No webcams found...");
            System.exit(1);
        }

        webcam.setViewSize(WebcamResolution.VGA.getSize());
        webcam.addWebcamListener(CamaraMotos.this);

        panel = new WebcamPanel(webcam, false);
        panel.setFPSDisplayed(true);

        add(picker, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(boton, BorderLayout.SOUTH);

        boton.addActionListener(this);
        setLocationRelativeTo(null);

        pack();
        setVisible(true);

        Thread t = new Thread() {

            @Override
            public void run() {
                panel.start();
            }
        };
        t.setName("example-starter");
        t.setDaemon(true);
        t.setUncaughtExceptionHandler(this);
        t.start();

        setIconImage(new ImageIcon(getClass().getResource("/Complements/icon.jpg")).getImage());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new CamaraMotos());
    }

    @Override
    public void webcamOpen(WebcamEvent we) {
        System.out.println("webcam open");
    }

    @Override
    public void webcamClosed(WebcamEvent we) {
        System.out.println("webcam closed");
    }

    @Override
    public void webcamDisposed(WebcamEvent we) {
        System.out.println("webcam disposed");
    }

    @Override
    public void webcamImageObtained(WebcamEvent we) {
        // do nothing
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
        webcam.close();
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("webcam viewer resumed");
        panel.resume();
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("webcam viewer paused");
        panel.pause();
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.err.println(String.format("Exception in thread %s", t.getName()));
        e.printStackTrace();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getItem() != webcam) {
            if (webcam != null) {

                panel.stop();

                remove(panel);

                webcam.removeWebcamListener(this);
                webcam.close();

                webcam = (Webcam) e.getItem();
                webcam.setViewSize(WebcamResolution.VGA.getSize());
                webcam.addWebcamListener(this);

                System.out.println("selected " + webcam.getName());

                panel = new WebcamPanel(webcam, false);
                panel.setFPSDisplayed(true);

                add(panel, BorderLayout.CENTER);
                pack();

                Thread t = new Thread() {

                    @Override
                    public void run() {
                        panel.start();
                    }
                };
                t.setName("example-stoper");
                t.setDaemon(true);
                t.setUncaughtExceptionHandler(this);
                t.start();
            }
        }
    }

    @Override
    public void webcamFound(WebcamDiscoveryEvent event) {
        if (picker != null) {
            picker.addItem(event.getWebcam());
        }
    }

    @Override
    public void webcamGone(WebcamDiscoveryEvent event) {
        if (picker != null) {
            picker.removeItem(event.getWebcam());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            // get image
            String numero2 = "C:\\MITCHCODE\\PARQUEADERO\\BaseDeDatos\\MOTOS\\motos.txt";

            File archivo2 = new File(numero2);

            try {
                BufferedReader leer2 = new BufferedReader(new FileReader(archivo2));
                //StringBuffer buffer = new StringBuffer();

                for (int i = 0; i <= 1; i++) {
                    boton2 = leer2.readLine();

                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(traercarro.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(traercarro.class.getName()).log(Level.SEVERE, null, ex);
            }

            BufferedImage image = webcam.getImage();

            try {
                // save image to PNG file
                ImageIO.write(image, "jpg", new File("C:\\MITCHCODE\\PARQUEADERO\\BaseDeDatos\\MOTOS\\PICTURES\\moto" + boton2 + ".jpg"));
            } catch (IOException ex) {
                Logger.getLogger(CamaraMotos.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(100);
                dispose();
            } catch (InterruptedException ex) {
                Logger.getLogger(CamaraMotos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
