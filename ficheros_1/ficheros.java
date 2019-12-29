
import java.io.*;
import java.util.*;

public class ficheros{
    static Scanner entrada = new Scanner(System.in);

    public static void Menu(){
        System.out.println("MENU");
        System.out.println("[1]. Leer");
        System.out.println("[2]. Escribir");
        System.out.println("[3]. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    public static void Lector(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        System.out.println("\nLeyendo ... -------------------------------------------------------------");
        while((cadena = b.readLine())!=null) {
            System.out.println(cadena);
        }
        System.out.println("-------------------------------------------------------------- Process OK\n");
        b.close();
    }

    public static void Escritor(String ruta) throws FileNotFoundException, IOException {
        File archivo = new File(ruta);
        BufferedWriter bw;
        String string_to_add = new String();

        System.out.print("Teclee la cadena a escribir: ");
        string_to_add = entrada.nextLine();
        string_to_add = entrada.nextLine();

        if(archivo.exists()) 
            System.out.println("Archivo actualizado");
        else 
            System.out.println("Archivo creado");
            
        bw = new BufferedWriter(new FileWriter(archivo,true));
        bw.write(string_to_add);
        bw.write("\n"); // Para añadir un salto de linea en cada entrada 
        System.out.println("Process OK\n");
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        Integer control;
        String file_name = new String();

        //System.out.print("Teclee el nombre de su archivo, [incluya extencion]: ");
        //file_name = entrada.next();
        file_name = "output.txt";

        do { 
            Menu();
            control = entrada.nextInt();
            switch(control){
                case 1: Lector(file_name); break;
                case 2: Escritor(file_name); break;
                default: System.out.println("Saliendo ...\n"); break;
            }
        } while (control == 1 || control == 2);
    }
}
