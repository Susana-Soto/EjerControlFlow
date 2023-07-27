import java.util.Scanner;

public class ComisionVenta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cifra de ventas: ");
        double ventas = scanner.nextDouble();
                
        if (ventas < 1000) {
			System.out.printf("No aplica comisión. Sigue esforzandote.");
        } else if (ventas >= 1000 && ventas<=4999) {
        	System.out.printf("La comisión es de:"+ ventas*0.10);
        } else if (ventas >= 5000 && ventas<=9999) {
        	System.out.printf("La comisión es de:"+ ventas*0.20);
        } else if (ventas >= 10000) {
    	System.out.printf("La comisión es de:"+ ventas*0.30);
        } else {
        	System.out.printf("Error");
        } 
    }
}