package lab6;

public class NaoHabilitada implements Situacao {

    @Override
    public void atualiza(Pessoa pessoa) {
        if (pessoa.getHabilitada()) {
            pessoa.setSituacao(new HabilidadaPrimeiraDose());
        }
    }

    @Override
    public String toString() {
        return "Nao habilitada";
    }
}
