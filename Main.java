
package torres;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

           DescargaRecursiva d = new DescargaRecursiva();
           Scanner sc = new Scanner(System.in);

           System.out.println("Numero de contenedores: ");
           int numeroContenedor = sc.nextInt();

           d.Hanoi(numeroContenedor, 1, 2, 3);
//Ventana
           Ventana v1 = new Ventana();
           v1.setVisible(true);

//jjhj
    }

}
