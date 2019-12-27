import java.util.Scanner;

public class SumarNumeros{

    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int suma;

        System.out.print("Teclee el primer entero: ");
        num1 = entrada.nextInt();
        System.out.print("Teclee el segundo entero: ");
        num2 = entrada.nextInt();

        suma = num1 + num2;
        System.out.printf("La suma es %d%n", suma);
    }
}