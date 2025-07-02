package model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

//    @Test
//    void deveAdicionarEConsultarTreinos() {
//        Aluno aluno = new Aluno("Milena", "milena@email.com");
//
//        aluno.adicionarTreino("Treino de pernas");
//        aluno.adicionarTreino("Treino de peito");
//
//        List<String> treinos = aluno.consultarTreinos();
//
//        assertEquals(2, treinos.size());
//        assertTrue(treinos.contains("Treino de pernas"));
//        assertTrue(treinos.contains("Treino de peito"));
//    }
//
//    @Test
//    void deveRegistrarComunicacaoComProfessor() {
//        Aluno aluno = new Aluno("Milena", "milena@email.com");
//
//        aluno.enviarMensagem("Preciso trocar meu treino de segunda.");
//        aluno.enviarMensagem("Dúvida sobre agachamento.");
//
//        List<String> mensagens = aluno.consultarMensagens();
//
//        assertEquals(2, mensagens.size());
//        assertEquals("Preciso trocar meu treino de segunda.", mensagens.get(0));
//    }
//
//    @Test
//    void deveAgendarEConsultarAvaliacoes() {
//        Aluno aluno = new Aluno("Milena", "milena@email.com");
//
//        aluno.agendarAvaliacao("2025-07-01");
//        aluno.agendarAvaliacao("2025-08-01");
//
//        List<String> avaliacoes = aluno.consultarAvaliacoes();
//
//        assertEquals(2, avaliacoes.size());
//        assertTrue(avaliacoes.contains("2025-07-01"));
//        assertTrue(avaliacoes.contains("2025-08-01"));
//    }
//
//    @Test
//    void naoDeveAdicionarTreinoNuloOuVazio() {
//        Aluno aluno = new Aluno("Milena", "milena@email.com");
//
//        aluno.adicionarTreino(null);
//        aluno.adicionarTreino("");
//
//        assertEquals(0, aluno.consultarTreinos().size());
//    }
//
//    @Test
//    void naoDeveEnviarMensagemNulaOuVazia() {
//        Aluno aluno = new Aluno("Milena", "milena@email.com");
//
//        aluno.enviarMensagem(null);
//        aluno.enviarMensagem("  ");
//
//        assertEquals(0, aluno.consultarMensagens().size());
//    }
//}
// Testes funcionais existentes (do seu código)
@Test
void deveAdicionarEConsultarTreinos() { // Corresponde a "Adicionar Treino Válido" e "Adicionar Múltiplos Treinos"
    Aluno aluno = new Aluno("Milena", "milena@email.com");
    aluno.adicionarTreino("Treino de pernas");
    aluno.adicionarTreino("Treino de peito");
    List<String> treinos = aluno.consultarTreinos();
    assertEquals(2, treinos.size());
    assertTrue(treinos.contains("Treino de pernas"));
    assertTrue(treinos.contains("Treino de peito"));
}

    @Test
    void deveRegistrarComunicacaoComProfessor() { // Corresponde a "Enviar Mensagem Válida"
        Aluno aluno = new Aluno("Milena", "milena@email.com");
        aluno.enviarMensagem("Preciso trocar meu treino de segunda.");
        aluno.enviarMensagem("Dúvida sobre agachamento.");
        List<String> mensagens = aluno.consultarMensagens();
        assertEquals(2, mensagens.size());
        assertEquals("Preciso trocar meu treino de segunda.", mensagens.get(0));
    }

    @Test
    void deveAgendarEConsultarAvaliacoes() { // Corresponde a "Agendar Avaliação Válida"
        Aluno aluno = new Aluno("Milena", "milena@email.com");
        aluno.agendarAvaliacao("2025-07-01");
        aluno.agendarAvaliacao("2025-08-01");
        List<String> avaliacoes = aluno.consultarAvaliacoes();
        assertEquals(2, avaliacoes.size());
        assertTrue(avaliacoes.contains("2025-07-01"));
        assertTrue(avaliacoes.contains("2025-08-01"));
    }

    // Novos testes funcionais
    @Test
    void deveRetornarListaDeTreinosVaziaQuandoNenhumTreinoAdicionado() { // Corresponde a "Consultar Treinos Vazios"
        Aluno aluno = new Aluno("João", "joao@email.com");
        List<String> treinos = aluno.consultarTreinos();
        assertTrue(treinos.isEmpty());
        assertEquals(0, treinos.size());
    }

    @Test
    void deveRetornarListaDeMensagensVaziaQuandoNenhumMensagemEnviada() {
        Aluno aluno = new Aluno("Maria", "maria@email.com");
        List<String> mensagens = aluno.consultarMensagens();
        assertTrue(mensagens.isEmpty());
        assertEquals(0, mensagens.size());
    }

    @Test
    void deveRetornarListaDeAvaliacoesVaziaQuandoNenhumAvaliacaoAgendada() {
        Aluno aluno = new Aluno("Pedro", "pedro@email.com");
        List<String> avaliacoes = aluno.consultarAvaliacoes();
        assertTrue(avaliacoes.isEmpty());
        assertEquals(0, avaliacoes.size());
    }

    // Novo teste funcional para múltiplas adições
    @Test
    void deveManterOrdemDosTreinosAdicionados() {
        Aluno aluno = new Aluno("Carlos", "carlos@email.com");
        aluno.adicionarTreino("Treino A");
        aluno.adicionarTreino("Treino B");
        aluno.adicionarTreino("Treino C");
        List<String> treinos = aluno.consultarTreinos();
        assertEquals(3, treinos.size());
        assertEquals("Treino A", treinos.get(0));
        assertEquals("Treino B", treinos.get(1));
        assertEquals("Treino C", treinos.get(2));
    }


// Testes unitários existentes (do seu código)
@Test
void naoDeveAdicionarTreinoNuloOuVazio() { // Corresponde a "Adicionar Treino Nulo"
    Aluno aluno = new Aluno("Milena", "milena@email.com");
    aluno.adicionarTreino(null);
    aluno.adicionarTreino("");
    assertEquals(0, aluno.consultarTreinos().size());
}

@Test
void naoDeveEnviarMensagemNulaOuVazia() { // Corresponde a "Enviar Mensagem Vazia"
    Aluno aluno = new Aluno("Milena", "milena@email.com");
    aluno.enviarMensagem(null);
    aluno.enviarMensagem("  ");
    assertEquals(0, aluno.consultarMensagens().size());
}

// Novos testes unitários para atingir 5 testes unitários únicos
@Test
void construtorDeveInicializarNomeEEmailCorretamente() { // Corresponde a "Construtor Aluno"
    String nomeEsperado = "Fernando";
    String emailEsperado = "fernando@email.com";
    Aluno aluno = new Aluno(nomeEsperado, emailEsperado);
    assertEquals(nomeEsperado, aluno.getNome());
    assertEquals(emailEsperado, aluno.getEmail());
}

@Test
void naoDeveAgendarAvaliacaoNulaOuVazia() { // Corresponde a "Agendar Avaliação Nula"
    Aluno aluno = new Aluno("Ricardo", "ricardo@email.com");
    aluno.agendarAvaliacao(null);
    aluno.agendarAvaliacao("   ");
    assertEquals(0, aluno.consultarAvaliacoes().size());
}

@Test
void gettersDevemRetornarValoresCorretos() { // Corresponde a "Getters de Nome e Email"
    String nome = "Ana";
    String email = "ana@email.com";
    Aluno aluno = new Aluno(nome, email);
    assertEquals(nome, aluno.getNome());
    assertEquals(email, aluno.getEmail());
   }

// Testes de Desempenho
private static final long MAX_ALLOWED_TIME_MS_TREINOS = 100; // 100 milissegundos
private static final long MAX_ALLOWED_TIME_MS_MESSAGES = 100; // 100 milissegundos
private static final long MAX_ALLOWED_TIME_MS_AVALIACOES = 50; // 50 milissegundos
private static final long MAX_ALLOWED_TIME_MS_CONSULTA_TREINOS = 50; // 50 milissegundos
private static final long MAX_ALLOWED_TIME_MS_CREATE_ALUNOS = 200; // 200 milissegundos


@Test
void desempenhoAdicionarMilTreinos() { // Corresponde a "Adicionar Mil Treinos"
    Aluno aluno = new Aluno("Performance Test", "perf@email.com");
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 1000; i++) {
        aluno.adicionarTreino("Treino " + i);
    }
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    assertTrue(duration < MAX_ALLOWED_TIME_MS_TREINOS, "Adicionar 1000 treinos demorou " + duration + "ms, esperado menos de " + MAX_ALLOWED_TIME_MS_TREINOS + "ms");
    assertEquals(1000, aluno.consultarTreinos().size());
}

@Test
void desempenhoConsultarMilTreinos() { // Corresponde a "Consultar Mil Treinos"
    Aluno aluno = new Aluno("Performance Test Consult", "perf_consult@email.com");
    for (int i = 0; i < 1000; i++) {
        aluno.adicionarTreino("Treino " + i);
    }
    long startTime = System.currentTimeMillis();
    List<String> treinos = aluno.consultarTreinos();
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    assertTrue(duration < MAX_ALLOWED_TIME_MS_CONSULTA_TREINOS, "Consultar 1000 treinos demorou " + duration + "ms, esperado menos de " + MAX_ALLOWED_TIME_MS_CONSULTA_TREINOS + "ms");
    assertEquals(1000, treinos.size());
}

@Test
void desempenhoEnviarCentenasDeMensagens() { // Corresponde a "Enviar Centenas de Mensagens"
    Aluno aluno = new Aluno("Msg Performance", "msg@email.com");
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 500; i++) {
        aluno.enviarMensagem("Mensagem " + i);
    }
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    assertTrue(duration < MAX_ALLOWED_TIME_MS_MESSAGES, "Enviar 500 mensagens demorou " + duration + "ms, esperado menos de " + MAX_ALLOWED_TIME_MS_MESSAGES + "ms");
    assertEquals(500, aluno.consultarMensagens().size());
}

@Test
void desempenhoAgendarDezenasDeAvaliacoes() { // Corresponde a "Agendar Dezenas de Avaliações"
    Aluno aluno = new Aluno("Avaliacao Performance", "aval@email.com");
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 100; i++) {
        aluno.agendarAvaliacao("2025-10-" + String.format("%02d", i + 1));
    }
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    assertTrue(duration < MAX_ALLOWED_TIME_MS_AVALIACOES, "Agendar 100 avaliações demorou " + duration + "ms, esperado menos de " + MAX_ALLOWED_TIME_MS_AVALIACOES + "ms");
    assertEquals(100, aluno.consultarAvaliacoes().size());
}

@Test
void desempenhoCriacaoDeMultiplosAlunos() { // Corresponde a "Criação de Múltiplos Alunos"
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < 1000; i++) {
        new Aluno("Aluno " + i, "aluno" + i + "@email.com");
    }
    long endTime = System.currentTimeMillis();
    long duration = endTime - startTime;
    assertTrue(duration < MAX_ALLOWED_TIME_MS_CREATE_ALUNOS, "Criar 1000 objetos Aluno demorou " + duration + "ms, esperado menos de " + MAX_ALLOWED_TIME_MS_CREATE_ALUNOS + "ms");
}}