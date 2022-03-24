import java.util.Scanner;

public class Calculadora {
public static void main (String[]args) {
	Scanner teclado = new Scanner(System.in);
	double salario, emprestimo, limite;
System.out.println("Digite o salário bruto:");	
salario = teclado.nextDouble();
System.out.println("Digite o valor que deseja emprestar");
emprestimo = teclado.nextDouble();
limite = salario * 0.3;
if (emprestimo<=limite) {
	System.out.println("Seu empréstimo foi aprovado!");
} else {
	System.out.println("O empréstimo não pode ser feito!") ;
}
teclado.close();
}
}
