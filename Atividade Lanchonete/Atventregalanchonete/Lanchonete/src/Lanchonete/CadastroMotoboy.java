package Lanchonete;

import java.util.Scanner;

public class CadastroMotoboy extends Cliente {
	public CadastroMotoboy (String nome, long telefone) {
		super(nome,telefone);
	}

	public static void main(String[] args) {
			Scanner leia = new Scanner (System.in);
			Cliente motoboy3 = new Cliente("Erasmo", 11987456321L);
			Cliente motoboy2 = new Cliente("Zeca", 11987456541L);
			Cliente motoboy1 = new Cliente(null, 0);
			System.out.println("Insira o nome do Motoboy: ");
			motoboy1.setNome(leia.nextLine());
			System.out.println("Insira o telefone do Motoboy: ");
			motoboy1.setTelefone(leia.nextLong());
		
			motoboy1.ImprimirMotoboy();
			motoboy2.ImprimirMotoboy();
			motoboy3.ImprimirMotoboy();
	}

}
