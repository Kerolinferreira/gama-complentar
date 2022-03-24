import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
int limite;
System.out.println("Digite um número");
limite = teclado.nextInt();
for (int i = 1; i <= limite; i++) {
	System.out.println(i + "");
}
teclado.close();
	}

}
