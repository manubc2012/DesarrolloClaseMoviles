package ejerciciosdeclase;

import java.util.Scanner;
import java.util.ArrayList;

public class User {
 static ArrayList<Persona> personas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        do {
            System.out.println("Seleccione una opción: \n1. Agregar datos \n2. Imprimir datos \n3. Salir");
            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Correo: ");
                    String correo = sc.nextLine();

                    personas.add(new Persona(nombre, edad, correo));
                    break;
                case 2:
                    System.out.println("Datos de personas:");
                    for (Persona persona : personas) {
                        System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + , Integer.toString(edad) + ", Correo: " + persona.getCorreo());
                    }
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (continuar);

        sc.close();
    }
}
