import java.util.Scanner;

public class PromoPeli {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe la edad del usuario:");
		int edad = in.nextInt();
		String edadString="";
		//Hasta aquí se pide al usuario que ingrese un dato por teclado
		if (edad < 5) {
			System.out.printf("Descuento de 60%, precio:"+ 140*.4);
        } else if (edad >= 60) {
        	System.out.printf("Descuento de 60%, precio:"+ 140*.45);
        } else {
        	System.out.printf("Precio normal, precio:"+ 140);
        } 
		in.close();
}
}

