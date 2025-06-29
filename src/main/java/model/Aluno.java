package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String email;
    private List<String> treinos = new ArrayList<>();
    private List<String> mensagens = new ArrayList<>();
    private List<String> avaliacoes = new ArrayList<>();

    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void adicionarTreino(String treino) {
        if (treino != null && !treino.isBlank()) {
            treinos.add(treino);
        }
    }

    public List<String> consultarTreinos() {
        return new ArrayList<>(treinos);
    }

    public void enviarMensagem(String mensagem) {
        if (mensagem != null && !mensagem.isBlank()) {
            mensagens.add(mensagem);
        }
    }

    public List<String> consultarMensagens() {
        return new ArrayList<>(mensagens);
    }

    public void agendarAvaliacao(String data) {
        if (data != null && !data.isBlank()) {
            avaliacoes.add(data);
        }
    }

    public List<String> consultarAvaliacoes() {
        return new ArrayList<>(avaliacoes);
    }
}
