package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.*;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        System.out.println("Regarga passageiro 1");
        passageiro1.adicionarSaldo(50.0);

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        System.out.println("Regarga passageiro 2");
        passageiro2.adicionarSaldo(12.5);

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);

        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(20);
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.pagarViagem(20);

        //mochila
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