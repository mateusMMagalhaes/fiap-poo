package br.com.fiapride.model;

public class MochilaDeRodinha extends Mochila {

    private int QtdRodas;

    public MochilaDeRodinha(String cor, int tamanhoLitros, int qtdRodas) {
        super(cor, tamanhoLitros);

        setQtdRodas(getQtdRodas());
    }
    @Override
    public void exibirTipo() {
        System.out.println("Sou uma mochila de rodinhas!");
    }

    public int getQtdRodas() {
        return this.QtdRodas;
    }

    private void setQtdRodas(int QtdRodas) {
        this.QtdRodas = QtdRodas;
    }
    @Override
    public void podeGuardar(int pesoKG) {
        if (this.getZiper()) {
            System.out.println("Pode guardar mochila Aberta!");
        } else {
            System.out.println("Por favor abra a mochila para guardar algo!");
        }
        if (pesoKG < 120) {
            System.out.println("Pode guardar a mochila aguenta!");
        } else {
            System.out.println("Por favor nao guarde a mochila vai rasgar!");
        }
    }
}