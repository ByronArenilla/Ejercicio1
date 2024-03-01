
package actividad.pkg1;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        
        // Pido la edad de Juan
        Scanner entrada = new Scanner(System.in);

        // Pedir al usuario la edad de Juan
        System.out.print("Ingrese la edad de Juan: ");
        int edadJuan = entrada.nextInt();

        // Calculo la ead de Alberto, Ana y la Mamá
        int edadAlberto = (2 * edadJuan) / 3;
        int edadAna = (4 * edadJuan) / 3;
        int edadMama = edadJuan + edadAlberto + edadAna;

        // Mostrar las edades calculadas
        System.out.println("Edad de Alberto: " + edadAlberto);
        System.out.println("Edad de Juan: " + edadJuan);
        System.out.println("Edad de Ana: " + edadAna);
        System.out.println("Edad de la madre: " + edadMama);

    }
}

