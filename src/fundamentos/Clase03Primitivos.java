
package fundamentos;

import java.util.Scanner;




public class Clase03Primitivos {
    public static void main(String[] args) {
        int numero = 30;
        //los tipos char se igualan con comilla simple
        char letra = 'A';
        // STRING ES UNA CLASE
                String texto= "Hoy es lunes";
        // BOOLEN 
        boolean respuesta = true;
        byte  bite=127 ;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        String nombre = teclado.nextLine();
        System.out.println("Su nombre es:"+nombre);
       
        
    }
    
}
