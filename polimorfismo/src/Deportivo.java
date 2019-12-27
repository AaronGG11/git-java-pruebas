

public class Deportivo extends auto{
    public int numeromarchas; 
    public Deportivo (){
        numeromarchas = 7; 
        velocidad_maxima = 270;
    } 

    public int acelearAuto(){
        velocidad += 10;
        return velocidad;
    }

    @Override
    public void showData(){
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Numero de puertas: : " + numero_de_puertas);
        System.out.println("Velocidad maxima: " + velocidad_maxima);
        System.out.println("Numero de marchas: " + numeromarchas);
    }

    
}