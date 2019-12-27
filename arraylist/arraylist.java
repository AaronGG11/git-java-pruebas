import java.util.ArrayList;

public class arraylist{
    public static void main(String[] args) {
        ArrayList <String> nombres = new ArrayList<String>();
        nombres.add("Aaron");
        nombres.add("Saul");
        nombres.add("Jonathan");
        nombres.add("Joel");
        nombres.add("Miguel");
        nombres.add("Rodolfo");
        nombres.add("Ehecatzin");
        nombres.add("Daniel");
        nombres.add("Ricardo");
        nombres.add("Michel");
        nombres.add("Elsa");
        nombres.add("Elizabeth");
        nombres.add("Luisa");
        nombres.add("Paty");
        nombres.add("Maria");

        // System.out.println("Tamaño: " + nombres.size());
        // System.out.println("Elemento: " + nombres.get(2));
        // System.out.println("Contiene 'Aaron'? : " + nombres.contains("Aaron"));
        // System.out.println("Indice 'Aaron'? : " + nombres.indexOf("Paty"));

        // ArrayList <String> apellidos = (ArrayList) nombres.clone();
        
        // for(String p: nombres){
        //     System.out.println(p);
        // }

        // Expresion lambda
        nombres.forEach((final String nombre)-> System.out.println(nombre));
    }
}   