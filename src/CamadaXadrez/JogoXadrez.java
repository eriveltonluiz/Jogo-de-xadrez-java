package CamadaXadrez;

import CamadaXadrez.Peças.Rei;
import CamadaXadrez.Peças.Torre;
import TabuleiroJogo.Posicao;
import TabuleiroJogo.Tabuleiro;

public class JogoXadrez {
	private Tabuleiro tabuleiro;
	
	public JogoXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarJogo();
	}
	
	public PecaXadrez[][] getPecas(){
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i = 0;i<tabuleiro.getLinhas();i++) {
			for(int j = 0;j<tabuleiro.getColunas();j++) {
				mat[i][j] = (PecaXadrez)tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
	
	private void iniciarJogo() {
		tabuleiro.LugarPeca(new Torre(tabuleiro, Cor.WHITE), new Posicao(2, 1));		
		tabuleiro.LugarPeca(new Rei(tabuleiro, Cor.BLACK), new Posicao(2, 1));
		tabuleiro.LugarPeca(new Rei(tabuleiro, Cor.WHITE), new Posicao(3, 1));
	}
}
