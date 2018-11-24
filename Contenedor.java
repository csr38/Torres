package torres;

import java.util.Scanner;

public class Contenedor {
	int peso;
	int origen;
        int destino;
        int auxiliar;
	int prioridad; 
        int kg;
        int numeroContenedor;
        
	public Contenedor(int peso, int origen, int prioridad){
            this.peso=peso;
            this.origen=origen;
            this.prioridad=prioridad;
        }

    Contenedor() { }
    
    public void crearContenedores(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de contenedores: ");
        numeroContenedor = sc.nextInt();
        
        for(int i=1 ; i <= numeroContenedor ;i++){
            
            System.out.println("\n"+"Peso contenedor N° "+ i +" :");	
            peso= sc.nextInt();
            System.out.println("contenedor Nº: "+i+" el peso es: "+peso+"kg\n"); }
    }

}