package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class TesteMochila {
    public static void main(String[] args) {
        //mochila
        MochilaDeCostas minhaMochilaDeCostas = new MochilaDeCostas("preta",5,2);
        MochilaDeRodinha minhaMochilaDeRodinha = new MochilaDeRodinha("preta",5,2);
        minhaMochilaDeRodinha.podeGuardar(100);
        minhaMochilaDeCostas.podeGuardar(20);
        minhaMochilaDeCostas.exibirTipo();
    }
}
