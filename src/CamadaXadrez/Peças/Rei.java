package CamadaXadrez.Pe�as;

import CamadaXadrez.Cor;
import CamadaXadrez.PecaXadrez;
import TabuleiroJogo.Tabuleiro;

public class Rei extends PecaXadrez{

	public Rei(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "RE";
	}

}
