package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		method1();
		
		System.out.println("Fim do programa");
		
		
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");//armazenamento dentro do vetor as palavras digitadas  
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch(ArrayIndexOutOfBoundsException e){// para posição maior que o vetor
			System.out.println("Posição Inválida");
			e.printStackTrace();//rastreamento do stack 
			sc.hasNext();//para esperar eu digitar
		}
		catch(InputMismatchException e){// para posição maior que o vetor
			System.out.println("Posição Errada");
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
	}

}
