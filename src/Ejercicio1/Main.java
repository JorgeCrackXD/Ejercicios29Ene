package Ejercicio1;

public class Main {
    public static void main(String[] args) {
       /* String apellido = Gomez;
        int edad = "35";
        boolean = "false";
        String sueldo = 45857.90
        double nombre = "Julián"; */

        //HAY ERRORES ES CINCO LÍNEAS, EN LA NÚMERO 6, debido a que es tipo int y se pusieron comillas.
        //En la línea 5 debido a que el nombre Gomez no está dentro de comillas "".
        //En la numero 7, ya que no hay ninguna variable de tipo boleano, y se pusieron comillas en el resultado.
        //En la línea 8, debido a que no se hace el cierre de línea con ;, mas aparte está como String, y debería ser double.
        //En la línea 9, ya que es valor tipo double (decimal) y se escribió un dato tipo String.

        //CODIGO CORREGIDO:

        String apellido = "Gomez";
        int edad = 35;
        boolean desicion = false;
        double sueldo = 45857.90;
        String nombre = "Julián";
    }
}
