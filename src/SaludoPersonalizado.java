import java.util.Scanner;

public class SaludoPersonalizado {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Pedimos el nombre
            System.out.print("¿Cómo te llamas? ");
            String nombre = scanner.nextLine();

            // Pedimos la edad
            System.out.print("¿Cuántos años tienes? ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            // Mostramos un saludo
            System.out.println("\n¡Hola, " + nombre + "! Bienvenido a Java con NetBeans.");
            System.out.println("Veo que tienes " + edad + " años.");

            // Llamamos a la nueva función
            evaluarEdad(edad);
        }
    }

    // Nueva función que da un mensaje según la edad
    public static void evaluarEdad(int edad) {
        if (edad < 12) {
            System.out.println("¡Eres todo un joven explorador del código! 🚀");
        } else if (edad < 20) {
            System.out.println("¡Qué buena edad para programar y aprender cosas nuevas! 😎");
        } else if (edad < 40) {
            System.out.println("¡Con esa energía seguro haces grandes proyectos! 💻");
        } else {
            System.out.println("¡Nunca es tarde para aprender algo nuevo! 👏");
        }
    }
}
