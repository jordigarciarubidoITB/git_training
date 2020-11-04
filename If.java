import java.util.Scanner;

public class If{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdueix la teva edat");
		int edat = scanner.nextInt();

		if(edat >= 18){
			System.out.println("Ets major d'edat!");
		}
		else{
			System.out.println("Ets menor d'edat!");
		}
	}
}
