package paoo_fatec_ipi_tarde_decorator_exerc;

import java.util.Random;

public class Teste {
	
	private static FigurasGeometricas g = null;
	
	public static void main(String[] args) {
		
		Random numeroAleat = new Random();
		int opcaoAleat = numeroAleat.nextInt(4);
		
		switch (opcaoAleat) {
		case 0:
			System.out.println("Opcao: 0");
			sorteiaFigura();
			break;
		case 1:
			System.out.println("Opcao: 1");
			Random numeroAleatDecorator = new Random();
			int opcaoAleatDecorator = 1 + numeroAleatDecorator.nextInt(2);
			sorteiaDecorador(opcaoAleatDecorator);
			break;
		case 2:
			System.out.println("Opcao: 2");
			sorteiaFigura();
			sorteiaCorLinha();
			sorteiaCorPreenchimento();
			break;
		default:
			break;
		}
	}
	
	public static void sorteiaFigura() {
		Random numeroAleatFigura = new Random();
		int opcaoAleatFigura = 1 + numeroAleatFigura.nextInt(3);

		switch (opcaoAleatFigura) {
		case 1:
			g = new Quadrado();
			System.out.println(g.getDescription());
			break;
		case 2:
			g = new Circulo();
			System.out.println(g.getDescription());
			break;
		case 3:
			g = new Retangulo();
			System.out.println(g.getDescription());
		}
	}

	public static void sorteiaCorLinha() {
		Random numeroAleatCorLinha = new Random();
		int opcaoAleatCorLinha = 1 + numeroAleatCorLinha.nextInt(4);

		switch(opcaoAleatCorLinha) {
		case 1:
			g = new CorLinhaVerde(g);
			System.out.println(g.getDescription());
			break;
		case 2:
			g = new CorLinhaVermelha(g);
			System.out.println(g.getDescription());
			break;
		case 3:
			g = new CorLinhaAzul(g);
			System.out.println(g.getDescription());
			break;
		case 4:
			g = new CorLinhaRoxa(g);
			System.out.println(g.getDescription());
			break;
		}
	}
	
	public static void sorteiaCorPreenchimento() {
		Random sorteioCorPreenchimento = new Random();
		int opcSorteioCorPreenchimento = 1 + sorteioCorPreenchimento.nextInt(4);
		
		switch(opcSorteioCorPreenchimento) {
		case 1:
			g = new CorPreenchimentoAzul(g);
			System.out.println(g.getDescription());
			break;
		case 2:
			g = new CorPreenchimentoPrata(g);
			System.out.println(g.getDescription());
			break;
		case 3:
			g = new CorPreenchimentoPreta(g);
			System.out.println(g.getDescription());
			break;
		case 4:
			g = new CorPreenchimentoAmarela(g);
			System.out.println(g.getDescription());
			break;
		}
	}
	
	public static void sorteiaDecorador(int opcaoDecorator) {
		sorteiaFigura();
		if(opcaoDecorator == 1) {
			sorteiaCorLinha();
		}
		else {
			sorteiaCorPreenchimento();
		}	
	}
}
