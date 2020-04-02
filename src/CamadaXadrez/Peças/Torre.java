package CamadaXadrez.Peças;

import CamadaXadrez.Cor;
import CamadaXadrez.PecaXadrez;
import TabuleiroJogo.Tabuleiro;

public class Torre extends PecaXadrez{

	public Torre(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}
	
}
