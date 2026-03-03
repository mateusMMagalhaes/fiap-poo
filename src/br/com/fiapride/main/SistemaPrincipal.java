package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.*;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro();
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.0;

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro();
        passageiro2.nome = "Carlos Souza";
        passageiro2.saldo = 12.50;

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);

        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
        Mochila minhaMochila = new Mochila("preta", 5);
        System.out.println("Minha mochila é: " + minhaMochila.cor);
        System.out.println("Minha mochila tem: " + minhaMochila.tamanhoLitros + " Litros");
        System.out.println("Minha mochila esta: " + (minhaMochila.ziper ? "Aberto" : "Fechado"));
        minhaMochila.abrir();
        System.out.println("Minha mochila esta: " + (minhaMochila.ziper ? "Aberto" : "Fechado"));
        minhaMochila.podeGuardar();
        minhaMochila.fechar();
        System.out.println("Minha mochila esta: " + (minhaMochila.ziper ? "Aberto" : "Fechado"));
        minhaMochila.podeGuardar();
    }
}