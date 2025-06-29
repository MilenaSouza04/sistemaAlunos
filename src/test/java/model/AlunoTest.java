package model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveAdicionarEConsultarTreinos() {
        Aluno aluno = new Aluno("Milena", "milena@email.com");

        aluno.adicionarTreino("Treino de pernas");
        aluno.adicionarTreino("Treino de peito");

        List<String> treinos = aluno.consultarTreinos();

        assertEquals(2, treinos.size());
        assertTrue(treinos.contains("Treino de pernas"));
        assertTrue(treinos.contains("Treino de peito"));
    }

    @Test
    void deveRegistrarComunicacaoComProfessor() {
        Aluno aluno = new Aluno("Milena", "milena@email.com");

        aluno.enviarMensagem("Preciso trocar meu treino de segunda.");
        aluno.enviarMensagem("Dúvida sobre agachamento.");

        List<String> mensagens = aluno.consultarMensagens();

        assertEquals(2, mensagens.size());
        assertEquals("Preciso trocar meu treino de segunda.", mensagens.get(0));
    }

    @Test
    void deveAgendarEConsultarAvaliacoes() {
        Aluno aluno = new Aluno("Milena", "milena@email.com");

        aluno.agendarAvaliacao("2025-07-01");
        aluno.agendarAvaliacao("2025-08-01");

        List<String> avaliacoes = aluno.consultarAvaliacoes();

        assertEquals(2, avaliacoes.size());
        assertTrue(avaliacoes.contains("2025-07-01"));
        assertTrue(avaliacoes.contains("2025-08-01"));
    }

    @Test
    void naoDeveAdicionarTreinoNuloOuVazio() {
        Aluno aluno = new Aluno("Milena", "milena@email.com");

        aluno.adicionarTreino(null);
        aluno.adicionarTreino("");

        assertEquals(0, aluno.consultarTreinos().size());
    }

    @Test
    void naoDeveEnviarMensagemNulaOuVazia() {
        Aluno aluno = new Aluno("Milena", "milena@email.com");

        aluno.enviarMensagem(null);
        aluno.enviarMensagem("  ");

        assertEquals(0, aluno.consultarMensagens().size());
    }
}
