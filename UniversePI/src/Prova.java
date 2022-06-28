import java.util.Scanner;

public class Prova {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        QuestaoSimples perguntas[];
        perguntas = new QuestaoSimples[5];

        perguntas[0] = new QuestaoSimples("Quem descobriu o Brasil?", "PA Cabral");
        perguntas[1] = new QuestaoME("Qual a cor do cavalo branco do Napoleao?", "a", "branco", "preto", "marrom",
                "dourado");
        perguntas[2] = new QuestaoME("Qual jogo favorito?", "c", "Mario", "Zelda", "WOW", "HOTS");
        perguntas[3] = new QuestaoComDica("Qual a linguagem do curso?", "Java", "Inicia com JA e termina com VA");
        perguntas[4] = new QuestaoSimples("Qual a formula da agua", "H2O");

        int pontos = 0;
        System.out.println("**** PROVA!!! ****");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i].aplicarQuestao());
            System.out.println("Sua resposta: ");
            String resp = sc.nextLine();

            if (perguntas[i].corrigir(resp)) {
                pontos += 2;
            }
        }

        System.out.println("Sua nota final vale = " + pontos);
    }
}
