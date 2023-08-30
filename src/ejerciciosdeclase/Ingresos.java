package ejerciciosdeclase;

import java.util.ArrayList;
import java.util.Scanner;

public class Ingresos {
    static Scanner sc= new Scanner(System.in);
    static ArrayList<Double> ingreso = new ArrayList<Double>();
    static ArrayList<Double> egreso = new ArrayList<Double>();
    static double balanceFinal=0;
    static double sumaIngresos=0;
    static double sumaEgresos=0;
    public static void main(String[] args) {
        menu();
    }

    static void menu(){
        boolean salir=false;

        do {
            System.out.println("Ingrese \n 1.Poner ingreso \n 2.Poner egreso \n 3.Ver balance \n 4.Salir");
            int opc =sc.nextInt();
            switch (opc){
                case 1:
                    Ingreso();
                    for (Double x: ingreso){
                        System.out.println("Sus ingresos son " + x);
                    }
                    sumaIngresos=Suma(ingreso);
                    System.out.println("La suma de los ingresos es " + sumaIngresos);
                    break;
                case 2:
                    Egreso();
                    for (Double j: egreso){
                        System.out.println("Sus egresos son " + j);
                    }
                    sumaEgresos=Suma(egreso);
                    System.out.println("La suma de los egresos es " + sumaEgresos);
                    break;
                case 3:
                    balanceFinal=sumaIngresos-sumaEgresos;
                    System.out.println("Su balance actual es de " + balanceFinal);
                    break;
                case 4:
                    System.out.println("Usted va a salir del sistema");
                    salir=true;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        }while (salir!=true);
    }

    static void Ingreso(){
        System.out.println("De cuanto fue su ingreso");
        double ingresos= sc.nextDouble();
        ingreso.add(ingresos);
    }

    static void Egreso(){
        System.out.println("De caunto fue su egreso");
        double egresos= sc.nextDouble();
        egreso.add(egresos);
    }

    static double Suma(ArrayList<Double>Sumas){
        double resultado=0;
        for (int i=0; i< Sumas.size(); i++){
            resultado+=Sumas.get(i);
        }
        return resultado;
    }
}
