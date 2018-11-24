
package torres;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    public Ventana(){
        this.setSize(1000, 550); //Tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Torre de Hanoi");//Titulo de la ventana
        //setLocation(0,0);
        //setBounds(0, 0, 1000, 500);
        setLocationRelativeTo(null);//Establecemos la ventana en el centro de la Pantalla
        //this.getContentPane().setBackground(Color.white);//Color para la ventana
        iniciarComponentes();

    }

    private void iniciarComponentes(){
        JPanel panel = new JPanel();//Creacion del Panel

        panel.setLayout(null);//Desactivando diseño por defecto
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);//Agregamos el panel a la ventana

        JLabel etiqueta = new JLabel(" ");

        etiqueta.setOpaque(true);

        etiqueta.setForeground(Color.green);//Establecemos color de la letra

        etiqueta.setBackground(Color.red);//Establecemos color de fondo de la etiqueta
        etiqueta.setBounds(100, 400, 200, 100);//Tamaño y pocicion de la etiqueta
        panel.add(etiqueta);

    }
}
