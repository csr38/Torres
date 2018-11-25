package torres;

import java.util.Scanner;

public class Contenedor {
	int peso;
	String origen;
	String prioridad; 
    int numeroContenedor;
        
	public Contenedor(int peso, String origen, String prioridad){
            this.peso=peso;
            this.origen=origen;
            this.prioridad=prioridad;
        }
    public void Setnumero(int numeroContenedor){
        this.numeroContenedor=numeroContenedor;
    }

    }