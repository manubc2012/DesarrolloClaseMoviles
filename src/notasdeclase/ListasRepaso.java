package notasdeclase;

import java.util.ArrayList;
import java.util.Scanner;

public class ListasRepaso {
    public static void main(String[] args) {
        ArrayList<String> usuario =new ArrayList<String>();

        String id = "1";
        usuario.add(id);
        String nombre ="Pepita";
        usuario.add(nombre);
        String coreo ="pepita@mail.com";
        usuario.add(coreo);
        String pass="1234";
        usuario.add(pass);
        //System.out.println("tamaño "+usuario.size());
        //System.out.println("nombre "+ usuario.get(1));
        //para actualizar un elemento de la lista
        //usuario.set(3, "4567");
        //para eliminar
        // usuario.remove(2);
        //buscar elemntos
        //int j=usuario.indexOf("Pepita");
        //System.out.println(j);
        //revisar si el array está vacio
        //System.out.println(usuario.isEmpty());
        System.out.println();
        for (int i=0; i< usuario.size(); i++){
            System.out.println("El dato " + i + " es: " +usuario.get(i));
        }

        ArrayList<String> singers =new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        int j=0;
        while (j<10){
            System.out.println("Ingrese el nombre del cantante "+ (j+1));
            String singer = sc.nextLine();
            singers.add(singer);
            j++;
        }

        for (String singers2:singers){
            System.out.println("Singer " + singers2);
        }

        for(int x=0; x< singers.size(); x++){
            System.out.println(  "El cantante "+(x+1)+" es " + singers.get(x));
        }
    }
}