/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author kelia
 */
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

        panel.setBackground(Color.white);
        this.getContentPane().add(panel);//Agregamos el panel a la ventana


    }
}
