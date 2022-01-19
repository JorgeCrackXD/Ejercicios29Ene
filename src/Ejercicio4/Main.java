package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lec = new Scanner(System.in);
        double total = 23563.899d; //Total del premio
        //Definimos el porcentual de cada impuesto
        double imp1 = 0.245d;
        double imp2 = 0.15d;
        double imp3 = 0.03d;
        double imptot = (imp1 + imp2 + imp3); //Generamos el impuesto total
        //Realizamos la generacion de impuestos
        double rebaja1= (total*imp1);
        double rebaja2= (total*imp2);
        double rebaja3= (total*imp3);
        double rebajatot = (rebaja1+ rebaja2 + rebaja3); //Generamos el total de dinero en rebaja

        System.out.println("BIENVENIDO");
        System.out.println("El premio total es de: $" + total);
        System.out.println("E independientemente del premio que usted tenga, se le cobran los siguientes impuestos:");
        System.out.printf("Impuesto 1: $%.2f equivalente al 24.5\u0025% del premio total. \n", rebaja1);
        //En printf, para imprimir el simbolo % y no recibir errores, escribir en cambio \u0025%
        System.out.printf("Impuesto 2: $%.2f equivalente al 15\u0025% del premio total. \n", rebaja2);
        System.out.printf("Impuesto 3: $%.2f equivalente al 3\u0025% ciento del premio total. \n", rebaja3);
        System.out.print("Ingrese el monto que gano usted: $");
        int ganado = lec.nextInt();

        //Sacamos el total que se rebajara

        double ganadoreal = (ganado-rebajatot);
        if(ganadoreal > 0)
        {
            System.out.println("Su premio real es de: $" + ganadoreal + ", debido a que se le descontaron: $" + rebajatot + ", en base a impuestos.");
            System.out.println("FELICIDADEEEEEES");
        }
        else
        {
            System.out.println("Lo sentimos, no ganaste nada debido a los impuestos :(");
        }


    }
}
