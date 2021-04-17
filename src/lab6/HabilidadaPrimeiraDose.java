package lab6;

public class HabilidadaPrimeiraDose implements Situacao {

    @Override
    public void atualiza(Pessoa pessoa) {
        pessoa.setSituacao(new TomouPrimeira());
    }
}
