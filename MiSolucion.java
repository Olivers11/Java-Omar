// Tarea1 ejercicio1
import java.util.Scanner;

class Ejemplo{

    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese el primer numero: ");
       int num1 = entrada.nextInt();
       System.out.print("Ingrese el segundo numero: ");
       int num2 = entrada.nextInt();
      int resta = num1-num2;

      System.out.println("La resta de ambos numeros es: "+resta);
    }  
}

//Tarea1 ejercicio2
import java.util.Scanner;

class Ejemplo{

    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese su nombre: ");
       String nombre = entrada.nextLine();
       System.out.print("Ingrese su apellido: ");
       String apellido = entrada.nextLine();
       
       if(nombre.length()< 6 && apellido.length()< 5 ){
            System.out.println("NO");
       }else{
            System.out.println("SI");

       }

      
    }  
}

//Tarea 1 Ejercicio3

import java.util.Scanner;

class Ejemplo{

    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese un numero: ");
       int num = entrada.nextInt();
        int resultado = num % 2;
       if(resultado == 0){

            System.out.println("El numero es par");
       }else{


            System.out.println("El numero es impar");
       }
    

      
    }  
}

//Tarea 1 Ejercicio 4

import java.util.Scanner;

class Ejemplo{

    public static void main(String[] args){
       Scanner entrada = new Scanner(System.in);
       System.out.print("Ingrese su edad: ");
       int edad = entrada.nextInt();

       if(edad>=18){
        System.out.println("Es mayor de edad");
       }else{

        System.out.println("Es menor de edad");
       }
      
    }
}
