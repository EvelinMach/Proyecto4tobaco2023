
package poomenu2;
import java.util.Scanner;

public class Poomenu2 {

    public static void main(String[] args) {
        int op =0;
        Scanner entrada= new Scanner(System.in);
        while(op!=4){
            System.out.println("----------------MENU----------------------");
            System.out.println("1. Crear profesor");
            System.out.println("2. Ver profesores");
            System.out.println("3. Ver profesor");
            System.out.println("4. Salir");
            System.out.println("Ingrese el numero de opcion");
            op = entrada.nextInt();
            if(op==1){
                System.out.println("-----------Nuevo profesor--------------");
            }else if(op ==2){
                System.out.println("-----------Los datos son---------------");
            }else if(op ==3){
                System.out.println("Programa finaliado");
            }else{
                System.out.println("Opcion incorrecta");
            }
        }
    }
    
}
