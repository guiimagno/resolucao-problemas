public class QuestaoComDica extends QuestaoSimples {
    private String dica;

    public QuestaoComDica(String enunciado, String resposta, String dica) {
        super(enunciado, resposta);
        this.dica = dica;
    }

    public String aplicarQuestao() {
        return "P: " + super.enunciado + "\n (dica)" + dica;
    }
}
