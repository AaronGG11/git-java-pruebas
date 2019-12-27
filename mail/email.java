import java.util.Scanner;

public class email{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String correo = new String();

        System.out.print("Teclee su correo: ");
        correo = entrada.next();

        if(!correo.isEmpty()){
            if(correo.contains("@")){
                if(!correo.startsWith("@") && !correo.endsWith("@")){
                    int contador = 0;
                    for(int i=0; i<correo.length(); i++){
                        if(correo.charAt(i) == '@')
                            contador += 1;
                    }
                    if(contador == 1){
                        if(correo.contains(".")){
                            if(!correo.startsWith(".") && !correo.endsWith(".")){
                                if(!correo.contains("..")){
                                    if(!(correo.contains("@.") || correo.contains(".@"))){
                                        if(!correo.contains(" ")){
                                            String dominio = correo.substring(correo.lastIndexOf("@")+1, correo.lastIndexOf("."));
                                            if(dominio.length() >= 2 && dominio.length() <= 10){
                                                System.out.println("Direccion de correo electronico valida");
                                            }else{
                                                System.out.println("Dominio invalido");
                                            }
                                        }else{
                                            System.out.println("Hay espacios");
                                        }
                                    }else{
                                        System.out.println("Posicion de arroba y punto incorrecta");
                                    }
                                }else{
                                    System.out.println("Dos puntos juntos");
                                }
                            }else{
                                System.out.println("Posicion de los puntos incorrecta");
                            }
                        }else{
                            System.out.println("No hay puntos");
                        }
                    }else{
                        System.out.println("Hay mas de una arroba");
                    }
                }else{
                    System.out.println("Posicion de arroba incorrecta");
                }
            }else{
                System.out.println("No hay arroba");
            }
        }else{
            System.out.println("No escribio");
        }
    }
}