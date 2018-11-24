package torres;

public class DescargaRecursiva  {

    
    DescargaRecursiva() { 
    }
    public void Hanoi(int numeroContenedor, int origen,  int auxiliar, int destino){
        
        if(numeroContenedor==1)
            System.out.println("mover contenedor "+"["+numeroContenedor+"]"+" de " + origen + " a " + destino);
        else{
            Hanoi(numeroContenedor-1, origen, destino, auxiliar);
                System.out.println("mover contenedor "+"["+ numeroContenedor +"]"+" de "+ origen + " a " + destino);
            Hanoi(numeroContenedor-1, auxiliar, origen, destino);
           }
        
    }
}
