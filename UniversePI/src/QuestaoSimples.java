public class QuestaoSimples {
    protected String enunciado;
    protected String resposta;

    public QuestaoSimples(String enunciado, String resposta) {
        this.enunciado = enunciado;
        this.resposta = resposta;
    }

    public String aplicarQuestao() {
        return "P: " + enunciado;
    }

    public boolean corrigir(String resposta) {
        return this.resposta.equals(resposta);
    }

}