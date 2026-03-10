package br.com.fiapride.model;

public class Mochila {
    private String cor;
    private int tamanhoLitros;
    private boolean ziper;

    public Mochila(String cor, int tamanhoLitros) {
        this.setCor(cor);
        this.setTamanho(tamanhoLitros);
        this.setZiper(false);
    }

    public String getCor() {
        return this.cor;
    }
    private void setCor(String cor) {
        this.cor = cor.toUpperCase();
    }

    public int getTamanho() {
        return this.tamanhoLitros;
    }
    private void setTamanho(int tamanhoLitros) {
        if(tamanhoLitros<0){
            System.out.println("Por favor coloque um valor acima de 0");
            return;
        }
        this.tamanhoLitros = tamanhoLitros;
    }

    public boolean getZiper() {
        return this.ziper;
    }

    private void setZiper(boolean ziper) {
        this.ziper = ziper;
    }


    public void abrir(){
        if(this.ziper){
            System.out.println("A mochila ja esta aberta!");
            return;
        }
        this.ziper = true;
        System.out.println("A mochila foi aberta!");

    }
    public void fechar(){
        if(this.getZiper()){
            setZiper(false);
            System.out.println("A mochila foi fechada!");
            return;
        }
        System.out.println("A mochila ja esta fechada!");

    }
    public void podeGuardar(){
        if(this.getZiper()){
            System.out.println("Pode guardar mochila Aberta!");
        }
        else{
            System.out.println("Por favor abra a mochila para guardar algo!");
        }
    }
}
