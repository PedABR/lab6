package lab6;

import java.util.HashSet;
import java.util.Set;

public class Pessoa {

    private String nome;

    private int idade;

    private int cpf;

    private int numeroCartao;

    private String email;

    public String endereco;

    private int telefone;

    private String profissao;

    private Set<String> comorbidades;

    private boolean habilitada;

    private Situacao situacao;

    public Pessoa(String nome, int idade, int cpf, int numeroCartao, String email, String endereco, int telefone, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.numeroCartao = numeroCartao;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
        this.profissao = profissao;
        this.comorbidades = new HashSet<>();
        this.habilitada = false;
        this.situacao = new NaoHabilitada();
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public void atualizaSituacao() {
        situacao.atualiza(this);
    }

    public void habilita() {
        habilitada = true;
    }

    public boolean getHabilitada() {
        return habilitada;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void adicionaComorbidades(String comorbidade) {
        this.comorbidades.add(comorbidade);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + '\n' +
                "Idade: " + idade + '\n' +
                "Cpf: " + cpf + '\n' +
                "NumeroCartao: " + numeroCartao + '\n' +
                "Email: " + email + '\n' +
                "Endereco: " + endereco + '\n' +
                "Telefone: " + telefone + '\n' +
                "Profissao: " + profissao + '\n' +
                "Comorbidades: " + comorbidades + '\n' +
                "Situacao: " + situacao;
    }
}
