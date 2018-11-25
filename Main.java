
package torres;

import java.util.Scanner;

public class Main{
    
	public static void main(String[] args) {
            
           DescargaRecursiva d = new DescargaRecursiva();
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Numero de contenedores: ");
           int numeroContenedor = sc.nextInt();        

        for(int i=1 ; i <= numeroContenedor ;i++){
            
            System.out.println("\n"+"Peso contenedor N° "+ i +" :");	
            int peso= sc.nextInt();
       /*     System.out.println("\n"+"Origen contenedor N° "+ i +" :");	
            Origen= sc.next();
      	     System.out.println("\n"+"Origen contenedor N° "+ i +" :");	
            Origen= sc.next(); */
            System.out.print("contenedor N°: "+i);
            d.Agregar(peso,"pene","pene2",i); //agregamos al lote
        }    
        d.burbuja();
        d.Hanoi(numeroContenedor, d.cesar,d.cesaraux,d.cesarfinal); // ordenamiento inicial  //wea por probar

    }
        
}