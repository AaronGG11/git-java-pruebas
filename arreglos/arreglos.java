import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class arreglos{
    public static void main(String[] args) {
        Random rnd = new Random();
        TreeSet numeros_ordenados = new TreeSet<Integer>();
        for(int i=0; i<10; i++){
            int  num_aleatorio = (int)(rnd.nextDouble()*10);
            System.out.println(num_aleatorio);
            numeros_ordenados.add(num_aleatorio);
        }

        numeros_ordenados.add(90);
        System.out.println("Cambio");
        Iterator item = numeros_ordenados.iterator();
        while(item.hasNext()){
            System.out.println(item.next());
        }
    }
}