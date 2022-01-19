package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int dias; // Aquí se almacenará el valor en dias ingresado
        int precio = 2;  //Valor del precio, lo almacenamos para una mejor fluidez
        int total; //Aqui se almacenará el total generado para una mejor administracion del programa

        System.out.println("Hola, se ha realizado el cierre de campaña.");
        System.out.print("Ingresa los dias que duro la campaña: "); //Pedimos los dias
        dias = lec.nextInt(); //Los guardamos con el scanner
        total = (precio*dias); //Realizamos la operacion para generar el precio
        System.out.println("El total generado fue de: $" + total); //Mostramos el precio
    }
}
