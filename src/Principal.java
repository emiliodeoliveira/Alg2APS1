import java.util.Scanner;

/**
 * 
 * @author Emilio de Oliveira
 *
 */

/* Tarefas:
Crie uma classe Aluno, que contém os dados Nome e Matrícula.
Crie uma classe Avaliação, que contém uma nota (utilize notas numéricas, com ponto decimal) e uma data.
Crie uma classe Aula, que contém uma data, e um campo para descrever que atividades foram executadas nesse dia.
Crie uma classe Turma, que contém uma disciplina e um conjunto de Alunos.
Crie uma aplicação crie automaticamente uma turma com 5 alunos, e permita ao usuário realizar chamadas, adicionar avaliações (até 3), 
e verificar a média dos alunos.
 */
public class Principal {
	static Aluno vAluno[] = new Aluno[100];
	static Turma vTurma[] = new Turma[10];
	static Avaliacao vAvaliacao[] = new Avaliacao[20];

	public static void main(String[] args) {	

		while (true) {
			switch (Interfaces.readString(menu()).charAt(0)) {
			case '1':
				cadastraAluno();
				break;
			case '2':
				cadastrarTurmas();
				break;
			case '3':
				realizarChamada();
				break;
			case '4':
				adicionarAvaliacao();
				break;
			case '5':
				System.exit(0);
				break;
			}
		}		
	}

	private static void adicionarAvaliacao() {
		int cont = 0;
		for (int b = 0; b < vAvaliacao.length; b++) {
			if (vAvaliacao[b] == null && cont < 3) {
				vAvaliacao[b] = new Avaliacao();
				cont++;
				return;
			} else {
				System.out.println("Ocorreu um erro!");
			}
		}

	}

	private static void realizarChamada() {
		// TODO Auto-generated method stub

	}

	private static void cadastrarTurmas() {
		// TODO Auto-generated method stub

	}

	private static void listarAlunos() {
		if (vAluno[0] != null) {			
			for (int a = 0; a < vAluno.length; a++) {
				if (vAluno[a] != null) {
					System.out.println(a+". "+vAluno[a]);
				}
			}			
		}	else {
			System.out.println("A lista de alunos está vazia!");
		}
	}

	private static void listarTurmas() {
		if (vTurma[0] != null) {			
			for (int a = 0; a < vTurma.length; a++) {
				if (vTurma[a] != null) {
					System.out.println(a+". "+vTurma[a]);
				}
			}			
		}	else {
			System.out.println("A lista de turma está vazio!");
		}
	}

	private static void cadastraAluno() {
		for (int b = 0; b < vAluno.length; b++) {
			if (vAluno[b] == null) {
				vAluno[b] = new Aluno();
				System.out.println("Aluno cadastrado: \n"+vAluno[b]);
				return;
			}
		}
	}

	private static String menu() {
		String menu = "";
		menu += "\nSistema escolar:";
		menu += "\n  1 - Cadastrar aluno.";
		menu += "\n  2 - Cadastrar turma.";
		menu += "\n  3 - Realizar chamada.";
		menu += "\n  4 - Adicionar avaliação.";
		menu += "\n  5 - Sair.";
		menu += "\nEscolha: ";
		return menu;
	}
}