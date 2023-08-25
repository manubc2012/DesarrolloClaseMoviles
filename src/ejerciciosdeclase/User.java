package ejerciciosdeclase;

import java.util.Scanner;
import java.util.ArrayList;

public class User {
    static ArrayList<String>usuario=new ArrayList<String>();
    static Scanner sc= new Scanner(System.in);
    static boolean salir=false;
    public static void main(String[] args) {
        System.out.println("Para iniciar ingrese 0");
        int inicio= sc.nextInt();
        if (inicio==0){
            menu();
        }else{
            salir=true;
            System.out.println("Va a salir del sistema");
        }
    }

    public static void menu(){
        do{
            System.out.println("Eliga una opción \n 1.Agregar datos \n 2.Imprimir datos \n 3.Salir");
            int opc= sc.nextInt();
            switch (opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    salir=true;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while (salir!=true);
    }
}
