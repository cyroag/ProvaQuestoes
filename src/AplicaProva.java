import java.util.Scanner;
public class AplicaProva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String texto1, texto2, texto3;
		double nota = 0;
		
		QuestaoSimples questoes[] = new QuestaoSimples[3];
		
		questoes[0] = new QuestaoSimples("Quem descobriu o Brasil","Pedro Alvares Cabral");
		questoes[1] = new QuestaoMultiplaEscolha("Quem descobriu a America","Cristovao Colombo","Pero Vaz de Caminha","Cristovao Colombo","Pedro Alvares Cabral","Dom Pedro");
		questoes[2] = new QuestaoComDica("Qual arvore deu origem ao nome do nosso país","Pau Brasil","P_u Br___l");
		
		for (QuestaoSimples q : questoes) {
			System.out.println(q);
		}
		
		System.out.println("\nResposta da questão 1:");
		texto1 = teclado.nextLine();
		
		if(questoes[0].corrigir(texto1)) {
			System.out.println("Parabéns! Resposta correta.");
			nota++;
		}
		else{
			System.out.println("Resposta errada.");
		}
		
		System.out.println("\nResposta da questão 2:");
		texto2 = teclado.nextLine();
		
		if(questoes[1].corrigir(texto2)) {
			System.out.println("Parabéns! Resposta correta.");
			nota++;
		}
		else{
			System.out.println("Resposta errada.");
		}
		
		System.out.println("\nResposta da questão 3:");
		texto3 = teclado.nextLine();
		
		if(questoes[2].corrigir(texto3)) {
			System.out.println("Parabéns! Resposta correta.");
			nota++;
		}
		else{
			System.out.println("Resposta errada.");
		}
		
		System.out.println("\n\nNota final: "+((nota/3)*10));
				
		teclado.close();
		
	}

}
