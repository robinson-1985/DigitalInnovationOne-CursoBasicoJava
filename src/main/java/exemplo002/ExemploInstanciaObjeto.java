package exemplo002;

import exemplo001.Pessoa;

public class ExemploInstanciaObjeto {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Robinson");

        System.out.println(pessoa.getNome());
    }
}
