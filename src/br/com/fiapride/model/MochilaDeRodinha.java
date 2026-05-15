package br.com.fiapride.model;

public class MochilaDeRodinha extends Mochila {

    private int QtdRodas;

    public MochilaDeRodinha(String cor, int tamanhoLitros, int qtdRodas) {
        super(cor, tamanhoLitros);

        setQtdRodas(getQtdRodas());
    }

    public int getQtdRodas() {
        return this.QtdRodas;
    }

    private void setQtdRodas(int QtdRodas) {
        this.QtdRodas = QtdRodas;
    }
}