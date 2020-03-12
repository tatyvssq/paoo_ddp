package paoo_fatec_ipi_tarde_decorator_exerc;

public class CorLinhaVermelha extends CorLinhaDecorator{
	
	public CorLinhaVermelha (FigurasGeometricas g) {
		super(g);
	}
	
	@Override
	public String desenhar() {
		// TODO Auto-generated method stub
		return getFigurasGeometricas() == null ? "Cor Linha Vermelha" : "Cor Linha Vermelha" + getFigurasGeometricas().desenhar();
	}

}
