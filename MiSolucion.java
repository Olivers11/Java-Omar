// Tarea 2 ejercicio 1
import java.util.Scanner;

class Ejemplo{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
         int num = entrada.nextInt();
         int contador = 1; 
        while(contador<=num){
            System.out.println(contador);
            contador++;
    
        }
    
    }
}

// Tarea 2 ejercicio 2
import java.util.Scanner;

class Ejemplo{

    public static void main(String[] args){
        int num = 0;
        while(num>=0){
            Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
         num = entrada.nextInt();
        }
    
    }
}

// Tarea 2 ejercicio 3

import java.util.Scanner;

class Ejemplo {

    public static void main(String[] args) {
        int num = 0;
        int sum = 0;
        while (true) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese un numero: ");
            num = entrada.nextInt();

            if (num < 0) {
                break;
            } else {
                sum = sum + num;
            }

        }
        System.out.println("la suma es: " + sum);

    }
}


//Tarea 2 ejercicio 4
import java.util.Scanner;

class Ejemplo{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
         int num = entrada.nextInt();
         System.out.println("Ingrese otro numero: ");
         int numd = entrada.nextInt(); 
        while(num<=numd){
            System.out.println(num);
            num++;
    
        }
    
    }
}
