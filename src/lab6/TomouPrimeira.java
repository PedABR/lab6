package lab6;

public class TomouPrimeira implements Situacao {

    private int dias;

    @Override
    public void atualiza(Pessoa pessoa) {
        if (dias >= 20) {
            pessoa.setSituacao(new HabilitadaSegundaDose());
        } else {
            dias += 10;
        }
    }

    @Override
    public String toString() {
        return "Tomou primeira dose";
    }
}
