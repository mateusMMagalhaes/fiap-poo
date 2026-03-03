package br.com.fiapride.model;

public class Mochila {
    public String cor;
    public int tamanhoLitros;
    public boolean ziper;

    public Mochila(String cor, int tamanhoLitros) {
        this.cor = cor;
        this.tamanhoLitros = tamanhoLitros;
        this.ziper = false;
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
        if(this.ziper){
            this.ziper = false;
            System.out.println("A mochila foi fechada!");
            return;
        }
        System.out.println("A mochila ja esta fechada!");

    }
    public void podeGuardar(){
        if(this.ziper){
            System.out.println("Pode guardar mochila Aberta!");
        }
        else{
            System.out.println("Por favor abra a mochila para guardar algo!");
        }
    }
}
