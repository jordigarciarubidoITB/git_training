import java.util.Arrays;
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Indica cuants caracters voldras al array");
	int numStrings = scanner.nextInt();
	System.out.println("-----------------------------");
	String cadena[] = new String[numStrings];

	for(int i=0; i < cadena.length; i++){
		System.out.println("Introdueix el caracter:");
		cadena[i] = scanner.next();
	}
	System.out.println(Arrays.toString(cadena));
	}
}
