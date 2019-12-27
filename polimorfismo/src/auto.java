
public class auto{

    protected int velocidad;
    protected int numero_de_puertas;
    protected int velocidad_maxima;

    public auto(){
        velocidad = 0;
        numero_de_puertas = 5;
        velocidad_maxima = 180;
    }

    public void showData(){
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Numero de puertas: : " + numero_de_puertas);
        System.out.println("Velocidad maxima: " + velocidad_maxima);
    }

    public void cambiarPuertas(){
        numero_de_puertas = 10;
    }

    public void cambiarPuertas(int num){
        numero_de_puertas = num;
    }
}


