import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/

	}
	Scanner leitor = new Scanner(System.in);
	int idade;
	int contador=0;
	int qtd=0;
	double media = 0;
	while (contador <qtd) {
		System.out.println("Por favor, informe a idade do" + contador + "aluno");
		idade = leitor.nextInt();
		contador = contador + 1;
		media = media + idade;
	}
	media = media / 10;
	System.out.println("A media de idades dos alunos da escola �" + media + "anos");

}
