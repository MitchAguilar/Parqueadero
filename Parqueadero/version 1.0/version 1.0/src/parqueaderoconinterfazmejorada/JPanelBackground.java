package parqueaderoconinterfazmejorada;


import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelBackground extends JFrame {
    public Image imagendefondo;
    public URL fondo;
    
    
    public JPanelBackground(){
        this.setVisible(true);
        this.setBounds(0, 0, 400, 400);
        this.setLocationRelativeTo(null);
        
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
    
}
