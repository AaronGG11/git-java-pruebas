import java.util.*;

public class Ejemplo{
    public static void main(String[] args) {
        ArrayList <String> list1= new ArrayList();  
        LinkedList <String> list2 = new LinkedList();  
        Vector <String> list3 = new Vector();  
        Stack <String> list4 = new Stack(); 
        
        PriorityQueue <String> queue = new  PriorityQueue <String> (); 
        Deque<String> deque = new ArrayDeque<String>();

        HashSet<String> set1=new HashSet<String>(); 
        LinkedHashSet<String> set2=new LinkedHashSet<String>(); 
        TreeSet <String> set3 = new  TreeSet <String> (); 

        Map<Integer,String> map=new HashMap<Integer,String>();  

        /* ////////////////////////// ARRAYLIST
        list1.add("aaron");
        list1.add("joel");
        list1.add("saul");
        list1.add("jonathan");

        Iterator itr = list1.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
        */

        /* ////////////////////////// LINKEDLIST -> Lista doblemente enlazada 
        list2.add ( "Ravi" );  
        list2.add ( "Vijay" );  
        list2.add ( "Ravi" );  
        list2.add ( "Ajay" );  
        Iterator <String> itr = list2.iterator();  
        while (itr.hasNext ()) {  
            System.out.println(itr.next ());  
        } 
        */ 
        
        /* ////////////////////////// VECTOR
        // VECTOR -> utiliza una matriz dinámica para almacenar los elementos de datos. 
        // Es similar a ArrayList. Sin embargo, está sincronizado y contiene muchos 
        // métodos que no forman parte del marco de la Colección.

        list3.add ( "Ayush" );  
        list3.add ( "Amit" );  
        list3.add ( "Ashish" );  
        list3.add ( "Garima" );  
        Iterator <String> itr = list3.iterator ();  
        while (itr.hasNext ()) {  
            System.out.println (itr.next ());  
        }  
        */

        /* ////////////////////////// PILA
        // PILA -> es la subclase de Vector. Implementa la estructura de datos de último 
        // en entrar, primero en salir, es decir, Pila. La pila contiene todos los métodos 
        // de la clase Vector y también proporciona sus métodos como boolean push (), 
        // boolean peek (), boolean push (object o), que define sus propiedades.  
        list4.push("Garvit" );  
        list4.push("Amit");  
        list4.push("Ashish");  
        list4.push("Garima");  
        list4.pop();  
        Iterator <String> itr = list4.iterator ();  
        while (itr.hasNext ()) {  
            System.out.println (itr.next ());  
        }
        */

        ////////////////////////// QUEUE
        // Hay varias clases como PriorityQueue, Deque y ArrayDeque que
        // implementa la interfaz Queue.
        /* ////////////////////////// PRIORITY QUEUE
        queue.add ( "Amit Sharma" );  
        queue.add ( "Vijay Raj" );  
        queue.add ( "JaiShankar" );  
        queue.add ( "Raj" );  
        System.out.println ( "head:" + queue.element ());  
        System.out.println ( "head:" + queue.peek ());  
        System.out.println ( "iterando los elementos de la cola:" );  
        Iterator itr = queue.iterator ();  
        while (itr.hasNext ()) {  
            System.out.println (itr.next ());  
        } 
        */
        
        /* ////////////////////////// DEQUE
        // A diferencia de la cola, podemos agregar o eliminar los elementos de ambos extremos.
        // ArrayDeque es más rápido que ArrayList y Stack y no tiene restricciones de capacidad.  
        deque.add("Gautam"); 
        deque.add("Karan");  
        deque.add("Ajay");  
        deque.addFirst("start"); 
        deque.addLast("end");
        //Traversing elements  
        for (String str : deque) {  
            System.out.println(str);  
        }
        */ 

        // SET -> Representa el conjunto desordenado de elementos que no nos permite 
        // almacenar los elementos duplicados. Podemos almacenar como máximo un 
        // valor nulo en Set. Set está implementado por HashSet, LinkedHashSet y TreeSet.

        /* ////////////////////////// HASH SET
        // La clase HashSet implementa Set Interface. Representa la colección 
        // que utiliza una tabla hash para el almacenamiento. Hashing se utiliza 
        // para almacenar los elementos en el HashSet. Contiene artículos únicos.
         
        set1.add("Ravi");  
        set1.add("Vijay");  
        set1.add("Ravi");  
        set1.add("Ajay");  
        //Traversing elements  
        Iterator<String> itr=set1.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        }  
        */

        /*  ////////////////////////// LINKED HASH SET 
        // Extiende la clase HashSet e implementa la interfaz Set. 
        // Al igual que HashSet, también contiene elementos únicos. 
        // Mantiene el orden de inserción y permite elementos nulos. 
        set2.add("Ravi");  
        set2.add("Vijay");  
        set2.add("Ravi");  
        set2.add("Ajay");  
        Iterator<String> itr=set2.iterator();  
        while(itr.hasNext()){  
            System.out.println(itr.next());  
        } 
         */

        /*  ////////////////////////// TREE SET 
            // TreeSet implementa la interfaz Set que usa un árbol para el almacenamiento. 
            // Al igual que HashSet, TreeSet también contiene elementos únicos. 
            // Sin embargo, el tiempo de acceso y recuperación de TreeSet es bastante rápido. 
            // Los elementos en TreeSet almacenados en orden ascendente.
         
        set3.add ( "Ravi" );  
        set3.add ( "Vijay" );  
        set3.add ( "Ravi" );  
        set3.add ( "Ajay" );  
        // elementos de desplazamiento  
        Iterator <String> itr = set3.iterator ();  
        while (itr.hasNext ()) {  
            System.out.println (itr.next ());  
        }
        */

         ////////////////////////// MAP
        // HashMap	HashMap es la implementación de Map, pero no mantiene ningún orden.
        // LinkedHashMap	LinkedHashMap es la implementación de Map. Hereda la clase HashMap.
            // Mantiene el orden de inserción.
        // TreeMap	TreeMap es la implementación de Map y SortedMap. Mantiene el orden ascendente.
        //map.put(100,"Amit");    
        //map.put(101,"Vijay");    
        //map.put(102,"Rahul");
        //System.out.println(map.hashCode());


        



    }
}