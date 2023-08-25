package notasdeclase;

public class Variables {
    public static void main(String[] args) {
        String nombre;
        nombre="Pepito";
        int id=1000556668;
        //Scope o ambito de las variables corresponde a si esta puede ser alcanzada por todas las estructuras que componen la clase o si solo funciona para un

        String global= "Soy global";

        if(global.equals("Soy global")){
            System.out.println("Es una variable global");
            String local="not";
        }else{
            System.out.println("No es igual");
        }

        byte numByte=120;

        short numShort=(short)numByte;
        System.out.println(numShort);

        //Parseo se da entre String y datos numericos
        String numDouble="4.56";

        double numDecimal= Double.parseDouble(numDouble);

        System.out.println(numDecimal);
    }
}
