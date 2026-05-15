package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.*;

public class SistemaPrincipal {

    public static void main(String[] args) {
        System.out.println("--- FIAPRIDE: Teste de Frota ---");

        // 1. Instanciando os objetos específicos
        Carro uberX = new Carro("ABC-1234", "Chevrolet Onix", 4);
        Moto mottu = new Moto("ABC-9999", "Caloi City", true);

        // 2. O TESTE: Um Carro consegue acessar getPlaca() da mãe?
        // Sim! Note que nós não escrevemos getPlaca() dentro da classe Carro. Ele herdou!
        System.out.println("Carro modelo: " + uberX.getModelo() + " | Placa: " + uberX.getPlaca());
        System.out.println("Vagas para passageiros: " + uberX.getCapacidadePassageiros());

        System.out.println("\nMoto modelo: " + mottu.getModelo() + " | Placa: " + mottu.getPlaca());

        // Se a moto é elétrica, ela avisa:
        if (mottu.isEletrica()) {
            System.out.println("Atenção: Esta moto é elétrica e atinge maiores velocidades!");
        }
        System.out.println("--- FIAPRIDE: Inicializando Sistema ---");

        // 1. Criamos os "atores" independentes primeiro
        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
        Veiculo carroDoJoao = new Veiculo("ABC-1234", "Toyota Corolla");

        // 2. Criamos a Viagem, conectando (associando) os objetos!
        // Passamos a variável 'ana' e a variável 'carroDoJoao' como parâmetros.
        // Saldo ana = 0;
        Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, carroDoJoao);

        // 3. Testando se os objetos conversam
        viagemDaAna.exibirResumo();

        // 4. Prova da Passagem por Referência:
        // Se a Ana colocar saldo na conta dela DEPOIS que a viagem foi criada...
        ana.adicionarSaldo(50.0);

        // A viagem "enxerga" esse saldo novo?
        System.out.println("Saldo da Ana consultado ATRAVÉS da Viagem: R$ " + viagemDaAna.getSolicitante().getSaldo());
    }
}