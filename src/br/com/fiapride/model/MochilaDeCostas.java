package br.com.fiapride.model;

public class MochilaDeCostas extends Mochila {

    private int QtdAlcas;

    public MochilaDeCostas(String cor,int tamanhoLitros, int qtdAlcas) {
        super(cor, tamanhoLitros);

        setQtdAlcas(QtdAlcas);
    }
    @Override
    public void exibirTipo() {
        System.out.println("Sou uma mochila de costas!");
    }
    public int getQtdAlcas() {
        return this.QtdAlcas;
    }

    private void setQtdAlcas(int QtdAlcas) {
        this.QtdAlcas = QtdAlcas;
    }
    @Override
    public void podeGuardar(int pesoKG){
        if(this.getZiper()){
            System.out.println("Pode guardar mochila Aberta!");
        }
        else{
            System.out.println("Por favor abra a mochila para guardar algo!");
        }
        if(pesoKG<20){
            System.out.println("Pode guardar a mochila aguenta!");
        }
        else{
            System.out.println("Por favor nao guarde a mochila vai rasgar!");
        }
    }
}
