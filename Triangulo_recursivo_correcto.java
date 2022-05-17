import java.util.*;
public class Triangulo_recursivo_correcto {
	public static void main(String[]args) {
		trianguloRecursivo(5);
	}
	public static void trianguloRecursivo(int base){
		for(int i=0; i<base; i+=1) {
			for(int j=0; j<=i; j+=1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}