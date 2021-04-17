package lab6;

public class HabilitadaSegundaDose implements Situacao {

    @Override
    public void atualiza(Pessoa pessoa) {
        pessoa.setSituacao(new Vacinada());
    }

    @Override
    public String toString() {
        return "Habilitada para segunda dose";
    }
}
