package principal;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.print("Por favor, digite seu Nome Completo: ");
		String nomeCliente = scanner.next();

		System.out.print("Por favor, digite o número da Agência: ");
		String agencia = scanner.next();

		System.out.print("Por favor, digite o Número da Conta: ");
		int numeroConta = scanner.nextInt();

		System.out.print("Por favor, digite o Saldo: ");
		double saldoConta = scanner.nextDouble();

		System.out.println(
				"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
						+ ", conta " + numeroConta + " seu saldo " + saldoConta + " que já está disponível para saque");
	}
	

}
