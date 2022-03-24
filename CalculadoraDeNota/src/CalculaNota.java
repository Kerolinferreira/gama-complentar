import java.util.Scanner;

public class CalculaNota {
public static void main (String[]args) {
	Scanner teclado = new Scanner(System.in);
	double nota1, nota2, resultado;
System.out.println("Digite a primeira nota:");
	nota1 = teclado.nextDouble();
	System.out.println("Digite a segunda nota:");
	nota2 = teclado.nextDouble();
			resultado = nota1 + nota2 /2;
	System.out.println("A média final entre as duas notas é:"+resultado);

teclado.close();
}
}