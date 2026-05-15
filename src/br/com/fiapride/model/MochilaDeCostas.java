package br.com.fiapride.model;

public class MochilaDeCostas extends Mochila {

    private int QtdAlcas;

    public MochilaDeCostas(String cor,int tamanhoLitros, int qtdAlcas) {
        super(cor, tamanhoLitros);

        setQtdAlcas(QtdAlcas);
    }
    public int getQtdAlcas() {
        return this.QtdAlcas;
    }

    private void setQtdAlcas(int QtdAlcas) {
        this.QtdAlcas = QtdAlcas;
    }
}
