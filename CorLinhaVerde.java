package paoo_fatec_ipi_tarde_decorator_exerc;

public class CorLinhaVerde extends CorLinhaDecorator{
	
	public CorLinhaVerde (FigurasGeometricas g) {
		super(g);
	}
	
	@Override
	public String desenhar() {
		// TODO Auto-generated method stub
		return getFigurasGeometricas() == null ? "Cor Linha Verde" : "Cor Linha Verde" + getFigurasGeometricas().desenhar();
	}
	

}
