package paoo_fatec_ipi_tarde_decorator_exerc;

public class CorLinhaRoxa extends CorLinhaDecorator{
	
	public CorLinhaRoxa (FigurasGeometricas g) {
		super(g);
	}
	
	@Override
	public String desenhar() {
		// TODO Auto-generated method stub
		return getFigurasGeometricas() == null ? "Cor Linha Roxa" : "Cor Linha Roxa" + getFigurasGeometricas().desenhar();
	}
	

}
