import java.util.Scanner;

public class PromoPeli {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

         double precio = calcularPrecioBoleto(edad);

            if (precio == -1) {
            System.out.println("Lo siento, no se puede calcular el precio del boleto.");
        } else {
            System.out.println("El precio del boleto es de " + precio + " Euros.");
        }
        scanner.close();
    }

    public static double calcularPrecioBoleto(int edad) {
        double precioNormal = 7.0;

        if (edad < 5) {
            return precioNormal * 0.4;
        } else if (edad >= 60) {
           
            return precioNormal * 0.45;
        } else {
           
            return precioNormal;
        }
    }
}
	        scanner.close();
	    }

	    public static double calcularPrecioBoleto(int edad) {
	        double precioNormal = 7.0;

	        if (edad < 5) {
	      
	            return precioNormal * 0.4;
	        } else if (edad >= 60) {
	            	            return precioNormal * 0.45;
	        } else {
	           	            return precioNormal;
	        }
	    }
	}
