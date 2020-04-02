package Aplicacao;

import CamadaXadrez.JogoXadrez;
import TabuleiroJogo.Tabuleiro;

public class main_xadrez {

	public static void main(String[] args) {
		JogoXadrez jogoXadrez = new JogoXadrez();
		UI.printTabuleiro(jogoXadrez.getPecas());
	}

}
