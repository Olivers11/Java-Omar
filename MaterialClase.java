import java.util.Scanner;

//El Archivo debe nombrarse con el mismo nombre que la clase 'Ejemplo'
class Ejemplo{

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // diferente(!=), igual(==), menor(<), mayor(>), menor_igual(<=)
        String cadena = "NOMBRE";
        cadena = cadena.toLowerCase();
        if(cadena.charAt(0) == 'n'){
            System.out.println("Cadena valida");
        }else{
            System.out.println("Cadena Invalida");
        }

        //Leer una cadena, si la cadena tiene mas de 8 caracteres imprimira
        // 'cadena valida' de lo contrario, imprimira 'cadena invalida'
    }
}
