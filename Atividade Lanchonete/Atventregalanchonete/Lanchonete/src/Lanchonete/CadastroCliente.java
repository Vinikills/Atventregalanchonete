package Lanchonete;
import java.util.Scanner;

public class CadastroCliente {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		Cliente client2 = new Cliente("Kimberly","Rua dos PR, 774", 11969696969L);
		Cliente client3 = new Cliente("Tommy Lee","Rua dos Pé de Jaca", 11987654321L);
		Cliente client1 = new Cliente(null, null, 0);
		System.out.println("Insira o nome do cliente: ");
		client1.setNome(leia.nextLine());
		
		System.out.println("Insira o endereço do cliente: ");
		client1.setEndereco(leia.nextLine());
		System.out.println("Insira o telefone do cliente: ");
		client1.setTelefone(leia.nextLong());
		System.out.println("Cadastro Efetuado!!!\nNome do cliente: "+client1.getNome()+"\nEndereço: "+client1.getEndereco()+"\nTelefone: "+client1.getTelefone());
		client2.ImprimirCliente();
		client3.ImprimirCliente();
	}

	
}


