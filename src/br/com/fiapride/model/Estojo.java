package br.com.fiapride.model;

public class Estojo {
    private String cor;
    private int capacidade;
    private boolean aberto;

    public Estojo(String cor, int capacidade) {
        this.setCor(cor);
        this.setCapacidade(capacidade);
        this.setAberto(false);
    }

    public String getCor() {
        return this.cor;
    }

    private void setCor(String material) {
        this.cor = cor.toUpperCase();
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    private void setCapacidade(int capacidade) {
        if (capacidade < 0) {
            System.out.println("Por favor coloque uma capacidade acima de 0");
            return;
        }
        this.capacidade = capacidade;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void Abrir() {
        if (this.aberto) {
            System.out.println("O estojo já está aberto!");
            return;
        }
        this.aberto = true;
        System.out.println("O estojo foi aberto!");
    }

    public void Fechar() {
        if (this.getAberto()) {
            setAberto(false);
            System.out.println("O estojo foi fechado!");
            return;
        }
        System.out.println("O estojo já está fechado!");
    }

    public void podeGuardar() {
        if (this.getAberto()) {
            System.out.println("Pode guardar itens no estojo!");
        } else {
            System.out.println("Por favor abra o estojo para guardar algo!");
        }
    }
}