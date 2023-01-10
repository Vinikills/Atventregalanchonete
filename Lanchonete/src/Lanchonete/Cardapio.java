package Lanchonete;

import java.util.Scanner;

public class Cardapio {
	
	public static void main(String[]args) {

	    int cod=0,quant=0,veri=0;
	    float valor,total,valorTotal=0;
	    Scanner leia = new Scanner(System.in);
//-----------------------------Lanches------------------------------------------	    
	    do {
	    System.out.println("\n\t\tMenu lanches");
	    System.out.println("\n1-XBurguer = $15,00");
	    System.out.println("\n2-Xsalada = $17,00");
	    System.out.println("\n3-Xbacon = $18,00");
	    System.out.println("\n4-Smash Burguer = $10,00");
	    System.out.println("\n5-Xtudo = $22,00");
	    System.out.println("\n0-Não vou querer");

	    System.out.println("\n Digite o codigo da sua compra");

	    cod = leia.nextInt();
	    if (cod >= 1 && cod<= 5){
		    System.out.println("\n Digite a quantidade desse produto");
		    quant = leia.nextInt();
		    }
		    else
		    	 System.out.println("Obrigado");
	    switch(cod){
    	case 1:
    		total = quant*15;
    		valorTotal = total + valorTotal;
    		System.out.printf("Você comprou "+quant+" X Burguer(s)");
    		break;
    	case 2:
    		total = quant*17;
    		valorTotal = total + valorTotal;
    		System.out.printf("Você comprou "+quant+" X Salada(s)");
    		break;
    	case 3:
    		total = quant*18;
    		valorTotal = total + valorTotal;
    		System.out.printf("Você comprou "+quant+" X Bacon(s)");
    		break;
    	case 4:
    		total = quant*10;
    		valorTotal = total + valorTotal;
    		System.out.printf("Você comprou "+quant+" Smash Burguer(s)");
    		break;
    	case 5:
    		total = quant*22;
    		valorTotal = total + valorTotal;
    		System.out.printf("Você comprou "+quant+" X Tudo");
    		break;
	    }
	    System.out.println("\nDeseja Continuar 1 para sim, 2 para não");
	    veri = leia.nextInt();
	    }
	    while(veri == 1);
//-----------------------------Bebidas----------------------------------------------
	    do {
	    System.out.println("\n\t\t Bebidas");
	    System.out.println("\n1-Coca = $5,00");
	    System.out.println("\n2-Fanta Laranja = $5,00");
	    System.out.println("\n3-Fanta uva = $5,00");
	    System.out.println("\n4-Guarana = $5,00");
	    System.out.println("\n5-Suco = $6,00");
	    System.out.println("\n0-Não vou querer");
	    System.out.println("\n Digite o codigo da sua compra");
	    cod = leia.nextInt();
	    if (cod >= 1 && cod<= 5){
	    System.out.println("\n Digite a quantidade desse produto");
	    quant = leia.nextInt();
	    }
	    else
	    	 System.out.println("Obrigado");
	switch(cod) {
	case 1:
		total = quant*5;
		valorTotal = total + valorTotal;
		System.out.printf("Você comprou "+quant+" Coca(s)");
		break;
	case 2:
		total = quant*5;
		valorTotal = total + valorTotal;
		System.out.printf("Você comprou "+quant+" Fanta Laranja(s)");
		break;
	case 3:
		total = quant*5;
		valorTotal = total + valorTotal;
		System.out.printf("Você comprou "+quant+" Fanta Uva(s)");
		break;
	case 4:
		total = quant*5;
		valorTotal = total + valorTotal;
		System.out.printf("Você comprou "+quant+" Guaraná(s)");
		break;
	case 5:
		total = quant*6;
		valorTotal = total + valorTotal;
		System.out.printf("Você comprou "+quant+" Suco(s)");	
		break;
	case 0:
		 System.out.println("...");
	}
	System.out.println("\nDeseja Continuar 1 para sim, 2 para não");
    veri = leia.nextInt();
	}
	while(veri==1);
	//-------------------------SOBREMESAS--------------------------------------
	    do {
	    System.out.println("\n\t\t Sobremesas");
	    System.out.println("\n1-Pudim = $7,00");
	    System.out.println("\n2-Brownie = $10,00");
	    System.out.println("\n3-Sorvete = $8,00");
	    System.out.println("\n0-Não vou querer");
	    System.out.println("\n Digite o codigo da sua compra");
	    cod = leia.nextInt();
	    if (cod >= 1 && cod<= 5){
		    System.out.println("\n Digite a quantidade desse produto");
		    quant = leia.nextInt();
		    }
		    else
		    	 System.out.println("Obrigado");
	    switch(cod){
	    	case 1:
	    		total = quant*7;
	    		valorTotal = total + valorTotal;
	    		System.out.printf("Você comprou "+quant+" Pudim(s)");
	    		break;
	    	case 2:
	    		total = quant*10;
	    		valorTotal = total + valorTotal;
	    		System.out.printf("Você comprou "+quant+" Brownie(s)");
	    		break;
	    	case 3:
	    		total = quant*8;
	    		valorTotal = total + valorTotal;
	    		System.out.printf("Você comprou "+quant+" Sorvete(s)");
	    		break;
	    	case 0:
	   		 System.out.println("...");
	    	
	    }
	    System.out.println("\nDeseja Continuar 1 para sim, 2 para não");
	    veri = leia.nextInt();
		}
		while(veri==1);
	    System.out.printf("O Valor total dos itens foi $%.2f",valorTotal);
	}

}



//package Lanchonete;
//
//import java.util.Scanner;
//
//public class Cardapio {
//	
//	public static void main(String[]args) {
//		String lanche[] = new String [10];
//		int quantLanche[] = new int [10];
//	    int cod=0,quant,veri=1,veri2=0,x=0;
//	    float valor,total,valorTotal=0;
//	    Scanner leia = new Scanner(System.in);
//////-----------------------------Lanches------------------------------------------
//	    
//	    for(x=0;veri==1;x++) {
//	    do {
//	    System.out.println("\n\t\tMenu lanches");
//	    System.out.println("\n1-XBurguer = $15,00");
//	    System.out.println("\n2-Xsalada = $17,00");
//	    System.out.println("\n3-Xbacon = $18,00");
//	    System.out.println("\n4-Smash Burguer = $10,00");
//	    System.out.println("\n5-Xtudo = $22,00");
//	    System.out.println("\n0-Não vou querer");
//
//	    System.out.println("\n Digite o codigo da sua compra");
//
//	    cod = leia.nextInt();
//	    if (cod >= 1 && cod<= 5){
//		    System.out.println("\n Digite a quantidade desse produto");
//		    quantLanche[x] = leia.nextInt();
//		    }
//		    else
//		    	 System.out.println("Obrigado");
//	    switch(cod){
//    	case 1:
//    		total = quantLanche[x]*15;
//    		valorTotal = total + valorTotal;
//    		lanche[x] = "X Burguer";
//    		System.out.printf("Você comprou "+quantLanche[x]+" X Burguer(s) e vai pagar $%.2f",valorTotal);
//    		break;
//    	case 2:
//    		total = quantLanche[x]*17;
//    		valorTotal = total + valorTotal;
//    		lanche[x] = "X Salada";
//    		System.out.printf("Você comprou "+quantLanche[x]+" X Salada(s) e vai pagar $%.2f",valorTotal);
//    		break;
//    	case 3:
//    		total = quantLanche[x]*18;
//    		valorTotal = total + valorTotal;
//    		lanche[x] = "X Bacon";
//    		System.out.printf("Você comprou "+quantLanche[x]+" X Bacon(s) e vai pagar $%.2f",valorTotal);
//    		break;
//    	case 4:
//    		total = quantLanche[x]*10;
//    		valorTotal = total + valorTotal;
//    		lanche[x] = "X Smash Burguer";
//    		System.out.printf("Você comprou "+quantLanche[x]+" Smash Burguer(s) e vai pagar $%.2f",valorTotal);
//    		break;
//    	case 5:
//    		total = quantLanche[x]*22;
//    		valorTotal = total + valorTotal;
//    		lanche[x] = "X Tudo";
//    		System.out.printf("Você comprou "+quantLanche[x]+" X Tudo e vai pagar $%.2f",valorTotal);
//    		break;
//	    }
//	    System.out.println("\nDeseja Continuar 1 para sim, 2 para não");
//	    veri = leia.nextInt();
//	    }
//	    while(veri == 1);
//	    }
//	    veri2 = x;
//	    for (x=0;x!=veri2;x++) {
//	    	System.out.println("Você pediu "+quantLanche[x]+lanche[x]);
//	    }
//	    
////-----------------------------Bebidas----------------------------------------------
////	    do {
////	    System.out.println("\n\t\t Bebidas");
////	    System.out.println("\n1-Coca = $5,00");
////	    System.out.println("\n2-Fanta Laranja = $5,00");
////	    System.out.println("\n3-Fanta uva = $5,00");
////	    System.out.println("\n4-Guarana = $5,00");
////	    System.out.println("\n5-Suco = $6,00");
////	    System.out.println("\n0-Não vou querer");
////	    System.out.println("\n Digite o codigo da sua compra");
////	    cod = leia.nextInt();
////	    if (cod >= 1 && cod<= 5){
////	    System.out.println("\n Digite a quantidade desse produto");
////	    quant = leia.nextInt();
////	    }
////	    else
////	    	 System.out.println("Obrigado");
////	switch(cod) {
////	case 1:
////		total = quant*5;
////		valorTotal = total + valorTotal;
////		System.out.printf("Você comprou "+quant+" Coca(s) e vai pagar $%.2f",valorTotal);
////		break;
////	case 2:
////		total = quant*5;
////		valorTotal = total + valorTotal;
////		System.out.printf("Você comprou "+quant+" Fanta Laranja(s) e vai pagar $%.2f",valorTotal);
////		break;
////	case 3:
////		total = quant*5;
////		valorTotal = total + valorTotal;
////		System.out.printf("Você comprou "+quant+" Fanta Uva(s) e vai pagar $%.2f",valorTotal);
////		break;
////	case 4:
////		total = quant*5;
////		valorTotal = total + valorTotal;
////		System.out.printf("Você comprou "+quant+" Guaraná(s) e vai pagar $%.2f",valorTotal);
////		break;
////	case 5:
////		total = quant*6;
////		valorTotal = total + valorTotal;
////		System.out.printf("Você comprou "+quant+" Suco(s) e vai pagar $%.2f",valorTotal);	
////		break;
////	case 0:
////		 System.out.println("...");
////	}
////	System.out.println("\nDeseja Continuar 1 para sim, 2 para não");
////    veri = leia.nextInt();
////	}
////	while(veri==1);
////	//-------------------------SOBREMESAS--------------------------------------
////	    do {
////	    System.out.println("\n\t\t Sobremesas");
////	    System.out.println("\n1-Pudim = $7,00");
////	    System.out.println("\n2-Brownie = $10,00");
////	    System.out.println("\n3-Sorvete = $8,00");
////	    System.out.println("\n0-Não vou querer");
////	    System.out.println("\n Digite o codigo da sua compra");
////	    cod = leia.nextInt();
////	    if (cod >= 1 && cod<= 3){
////		    System.out.println("\n Digite a quantidade desse produto");
////		    quant = leia.nextInt();
////		    }
////		    else
////		    	 System.out.println("Obrigado");
////	    switch(cod){
////	    	case 1:
////	    		total = quant*7;
////	    		valorTotal = total + valorTotal;
////	    		System.out.printf("Você comprou "+quant+" Pudim(s) e vai pagar $%.2f",valorTotal);
////	    		break;
////	    	case 2:
////	    		total = quant*10;
////	    		valorTotal = total + valorTotal;
////	    		System.out.printf("Você comprou "+quant+" Brownie(s) e vai pagar $%.2f",valorTotal);
////	    		break;
////	    	case 3:
////	    		total = quant*8;
////	    		valorTotal = total + valorTotal;
////	    		System.out.printf("Você comprou "+quant+" Sorvete(s) e vai pagar $%.2f",valorTotal);
////	    		break;
////	    	case 0:
////	   		 System.out.println("...");
////	    	
////	    }
////	    System.out.println("\nDeseja Continuar 1 para sim, 2 para não");
////	    veri = leia.nextInt();
////		}
////		while(veri==1);
////	    System.out.printf("Voce pediu""O Valor total dos itens foi $%.2f",valorTotal);
//	}
//
//}
//
//
