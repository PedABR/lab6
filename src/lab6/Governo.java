package lab6;

import java.util.Set;

public class Governo {

    private int idadeVacinacao;

    private Set<String> profissoesVacincao;

    private Set<String> comorbidadesVacinacao;

    public Governo(int idadeVacinacao, Set<String> profissoesVacincao, Set<String> comorbidadesVacinacao) {
        this.idadeVacinacao = idadeVacinacao;
        this.profissoesVacincao = profissoesVacincao;
        this.comorbidadesVacinacao = comorbidadesVacinacao;
    }

    public boolean habilita(Pessoa pessoa) {
        if (pessoa.getIdade() >= idadeVacinacao) return true;
        if (profissoesVacincao.contains(pessoa.getProfissao())) return true;
        for (String comorbidade : pessoa.getComorbidades()) {
            if (comorbidadesVacinacao.contains(comorbidade)) return true;
        }
        return false;
    }
}
