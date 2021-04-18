package lab6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Governo {

    private int idadeVacinacao;

    private Set<String> profissoesVacincao;

    private Set<String> comorbidadesVacinacao;

    private Map<Integer, Pessoa> filaVacinacao;

    public Governo(int idadeVacinacao) {
        this.idadeVacinacao = idadeVacinacao;
        this.profissoesVacincao = new HashSet<>();
        this.comorbidadesVacinacao = new HashSet<>();
        this.filaVacinacao = new HashMap<>();
    }

    public void cadastraPessoa(String nome, int idade, int cpf, int numeroCartao, String email, String endereco, int telefone, String profissao) {
        filaVacinacao.put(cpf,new Pessoa(nome, idade, cpf, numeroCartao, email, endereco, telefone, profissao));
    }

    public void editaNome(int cpf, String novoValor) {
        filaVacinacao.get(cpf).setNome(novoValor);
    }

    public void editaIdade(int cpf, int novoValor) {
        filaVacinacao.get(cpf).setIdade(novoValor);
    }

    public void editaNumeroCartao(int cpf, int novoValor) {
        filaVacinacao.get(cpf).setNumeroCartao(novoValor);
    }

    public void editaEmail(int cpf, String novoValor) {
        filaVacinacao.get(cpf).setEmail(novoValor);
    }

    public void editaEndereco(int cpf, String novoValor) {
        filaVacinacao.get(cpf).setEndereco(novoValor);
    }

    public void editaTelefone(int cpf, int novoValor) {
        filaVacinacao.get(cpf).setTelefone(novoValor);
    }

    public void editaProfissao(int cpf, String novoValor) {
        filaVacinacao.get(cpf).setProfissao(novoValor);
    }

    public void adicionaComorbidade(int cpf, String novaComorbidade) {
        filaVacinacao.get(cpf).adicionaComorbidades(novaComorbidade);
    }

    public void atualizaSituacao() {
        for (Pessoa pessoa : filaVacinacao.values()) {
            habilita(pessoa);
            pessoa.atualizaSituacao();
        }
    }

    public String mostraPessoa(int cpf) {
        return filaVacinacao.get(cpf).toString();
    }

    public void adicionaProfissao(String profissao) {
        profissoesVacincao.add(profissao);
    }

    public void adicionaComorbidade(String comorbidade) {
        comorbidadesVacinacao.add(comorbidade);
    }

    public void setIdadeVacinacao(int idadeVacinacao) {
        this.idadeVacinacao = idadeVacinacao;
    }

    private void habilita(Pessoa pessoa) {
        if (!pessoa.getHabilitada()) {
            if (pessoa.getIdade() >= idadeVacinacao){
                pessoa.habilita();
                return;
            }
            if (profissoesVacincao.contains(pessoa.getProfissao())) {
                pessoa.habilita();
                return;
            }
            for (String comorbidade : pessoa.getComorbidades()) {
                if (comorbidadesVacinacao.contains(comorbidade)) {
                    pessoa.habilita();
                    return;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Idade minima para vacinacao: " + idadeVacinacao + '\n' +
                "Profissoes prioritarias para vacincao: " + profissoesVacincao +'\n' +
                "Comorbidades prioritarias para vacincao: "  + comorbidadesVacinacao;
    }
}
