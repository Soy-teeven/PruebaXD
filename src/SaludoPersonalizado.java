import java.util.Scanner;

public class SaludoPersonalizado {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in) // para leer la entrada del usuario
        ) {
            System.out.print("¿Cómo te llamas? ");
            String nombre = scanner.nextLine(); // lee el nombre
            System.out.println("¡Hola, " + nombre + "! Bienvenido a Java con NetBeans.");
            // cerramos el scanner
        }
    }
}
