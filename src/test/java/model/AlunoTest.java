package model;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

    class AlunoTest {

        @Test
        void deveAdicionarEConsultarTreinos() {
            Aluno aluno = new Aluno("Milena");

            aluno.adicionarTreino("Treino de pernas");
            aluno.adicionarTreino("Treino de peito");

            List<String> treinos = aluno.consultarTreinos();

            assertEquals(2, treinos.size());
            assertTrue(treinos.contains("Treino de pernas"));
            assertTrue(treinos.contains("Treino de peito"));
        }

        @Test
        void deveRegistrarComunicacaoComProfessor() {
            Aluno aluno = new Aluno("Milena");

            aluno.enviarMensagem("Preciso trocar meu treino de segunda.");
            aluno.enviarMensagem("Dúvida sobre agachamento.");

            List<String> mensagens = aluno.consultarMensagens();

            assertEquals(2, mensagens.size());
            assertEquals("Preciso trocar meu treino de segunda.", mensagens.get(0));
        }
    }

