package model;

import java.util.ArrayList;
import java.util.List;

    public class Aluno {
        private String nome;
        private List<String> treinos = new ArrayList<>();
        private List<String> mensagens = new ArrayList<>();

        public Aluno(String nome) {
            this.nome = nome;
        }

        public void adicionarTreino(String treino) {
            treinos.add(treino);
        }

        public List<String> consultarTreinos() {
            return treinos;
        }

        public void enviarMensagem(String mensagem) {
            mensagens.add(mensagem);
        }

        public List<String> consultarMensagens() {
            return mensagens;
        }
    }


