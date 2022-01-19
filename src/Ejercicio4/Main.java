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
        System.out.println("Impuesto 1: $" + rebaja1 + ", equivalente al 24.5% del premio total.");
        System.out.println("Impuesto 2: $" + rebaja2 + ", equivalente al 15% del premio total.");
        System.out.println("Impuesto 3: $" + rebaja3 + ", equivalente al 3% del premio total.");
        System.out.println("/ln");
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
