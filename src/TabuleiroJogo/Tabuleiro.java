package TabuleiroJogo;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;

	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroException("Erro ao criar o tabuleiro: � neceess�rio haver uma linha e uma coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linha, int coluna) {
		if (!ExistePosicao(linha, coluna)) {
			throw new TabuleiroException("N�o h� essa posi��o no tabuleiro");
		}
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao) {
		if (!ExistePosicao(posicao)) {
			throw new TabuleiroException("N�o h� essa posi��o no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void LugarPeca(Peca peca, Posicao posicao) {
		if (aquiHaPeca(posicao)) {
			throw new TabuleiroException("Essa posi��o ja est� ocupada" + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}

	private boolean ExistePosicao(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}

	public boolean ExistePosicao(Posicao posicao) {
		return ExistePosicao(posicao.getLinha(), posicao.getColuna());
	}

	public boolean aquiHaPeca(Posicao posicao) {
		if (!ExistePosicao(posicao)) {
			throw new TabuleiroException("N�o h� essa posi��o no tabuleiro");
		}
		return peca(posicao) != null;
	}
}
