package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class TesteMochila {
    public static void main(String[] args) {
        //mochila
        Mochila minhaMochila = new Mochila("preta", 5);
        System.out.println("Minha mochila é: " + minhaMochila.getCor());
        System.out.println("Minha mochila tem: " + minhaMochila.getTamanho() + " Litros");
        System.out.println("Minha mochila esta: " + (minhaMochila.getZiper() ? "Aberto" : "Fechado"));
        minhaMochila.abrir();
        System.out.println("Minha mochila esta: " + (minhaMochila.getZiper() ? "Aberto" : "Fechado"));
        minhaMochila.podeGuardar();
        minhaMochila.fechar();
        System.out.println("Minha mochila esta: " + (minhaMochila.getZiper() ? "Aberto" : "Fechado"));
        minhaMochila.podeGuardar();
    }
}
