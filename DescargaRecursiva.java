package torres;
import java.util.ArrayList;

public class DescargaRecursiva  {
    ArrayList<Contenedor> cesar = new ArrayList<Contenedor>();
    ArrayList<Contenedor> cesaraux = new ArrayList<Contenedor>();
    ArrayList<Contenedor> cesarfinal = new ArrayList<Contenedor>();


    public void Agregar (int peso, String origen, String prioridad,int numeroContenedor) {
        
        cesar.add(new Contenedor(peso,origen,prioridad)); 
        System.out.println(". el peso es: "+peso+"kg. el origen es: "+origen+". prioridad:"+ prioridad+".");

    }
       public void burbuja(){

        for(int i = 0; i < cesar.size() - 1; i++){

            for(int j = 0; j < cesar.size() - 1; j++){

                if (cesar.get(j).peso < cesar.get(j + 1).peso){

                    Contenedor tmp = cesar.get(j+1);

                    cesar.set(j+1,cesar.get(j));

                    cesar.set(j,tmp);
                }
            }
        }
    
      for(int i = 0;i < cesar.size(); i++){
            cesar.get(i).Setnumero(i+1);
            System.out.print(cesar.get(i).peso+" wea "+cesar.get(i).numeroContenedor+"\n");
        }
    }    

    public void Hanoi(int numeroContenedor, ArrayList<Contenedor> cesar, ArrayList<Contenedor> cesaraux, ArrayList<Contenedor> cesarfinal){
        
        if(numeroContenedor==1){
          //  System.out.println("mover contenedor ["+numeroContenedor+"]"+" de " + origen + " a " + destino);
        
        moverTo(cesar,cesarfinal);


        }else{
            Hanoi(numeroContenedor-1, cesar, cesarfinal, cesaraux);

            //    System.out.println("mover contenedor "+"["+ numeroContenedor +"]"+" de "+ origen + " a " + destino);
            moverTo(cesar,cesarfinal);

            Hanoi(numeroContenedor-1, cesaraux, cesar, cesarfinal);
           }
        
    }
    public void moverTo(ArrayList<Contenedor> cesar, ArrayList<Contenedor> cesaraux){
        int aux = cesar.size();
        cesaraux.add(cesar.get(aux-1));
        cesar.remove(aux-1);

        mostrar();


    }

    public void mostrar(){
        System.out.println("------------");

        for(int i=0; i<cesar.size();i++){
            System.out.print(+cesar.get(i).numeroContenedor+" ");

        }
        System.out.print("\n");
        for(int i=0; i<cesaraux.size();i++){
            System.out.print(+cesaraux.get(i).numeroContenedor+" ");
        }
        System.out.print("\n");
        for(int i=0; i<cesarfinal.size();i++){
            System.out.print(+cesarfinal.get(i).numeroContenedor+" ");
        }
        System.out.print("\n");
    } 


}
 