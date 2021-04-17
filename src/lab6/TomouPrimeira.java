package lab6;

public class TomouPrimeira implements Situacao {

    private int dias;

    @Override
    public void atualiza(Pessoa pessoa) {
        if (dias >= 20) {
            pessoa.setSituacao(new HabilitadaSegundaDose());
        } else {
            dias += 7;
        }
    }
}
