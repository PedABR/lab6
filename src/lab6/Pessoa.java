package lab6;

import java.util.Set;

public class Pessoa {

    private String nome;

    private int idade;

    private int cpf;

    private int numeroCartao;

    private String email;

    private int telefone;

    private String profissao;

    private Set<String> comorbidades;

    private Situacao situacao;

    public Pessoa(String nome, int idade, int cpf, int numeroCartao, String email, int telefone, String profissao, Set<String> comorbidades) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.numeroCartao = numeroCartao;
        this.email = email;
        this.telefone = telefone;
        this.profissao = profissao;
        this.comorbidades = comorbidades;
        this.situacao = new NaoHabilitada();
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public void atualizaSituacao() {
        situacao.atualiza(this);
    }

    public int getIdade() {
        return idade;
    }

    public Set<String> getComorbidades() {
        return comorbidades;
    }

    public String getProfissao() {
        return profissao;
    }
}
