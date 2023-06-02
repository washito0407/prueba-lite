import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        System.out.println("Menu de libros: ");
        System.out.println("1) Las mil y una noches");
        System.out.println("2) Don Quijote de la Mancha");
        System.out.println("3) Orgullo y prejuicio");
        System.out.println("4) Frankenstein o el moderno Prometeo");
        System.out.println("5) Los tres mosqueteros");
        System.out.println("Elija una opcion:  ");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            metodolib libro1 = new metodolib("Las mil y una noches", 1949,"Ramón Sopena");
            libro1.mostrar();
        }

        if (opcion == 2) {
            metodolib libro2 = new metodolib("Don Quijote de la Mancha", 1605,"Miguel Cervantes");
            libro2.mostrar();
        }

        if (opcion == 3) {
            metodolib libro3 = new metodolib("Orgullo y prejuicio", 1813,"Jane Austen");
            libro3.mostrar();
        }

        if (opcion == 4) {
            metodolib libro4 = new metodolib("Frankenstein o el moderno Prometeo", 1818,"Mary Shelley");
            libro4.mostrar();
        }

        if (opcion == 5) {
            metodolib libro5 = new metodolib("Los tres mosqueteros", 1844,"Alexandre Dumas");
            libro5.mostrar();
        }
    }
}