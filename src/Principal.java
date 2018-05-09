import java.util.Scanner;

/**
 * 
 * @author Emilio de Oliveira
 *
 */

/* Tarefas:
Crie uma classe Aluno, que cont�m os dados Nome e Matr�cula.
Crie uma classe Avalia��o, que cont�m uma nota (utilize notas num�ricas, com ponto decimal) e uma data.
Crie uma classe Aula, que cont�m uma data, e um campo para descrever que atividades foram executadas nesse dia.
Crie uma classe Turma, que cont�m uma disciplina e um conjunto de Alunos.
Crie uma aplica��o crie automaticamente uma turma com 5 alunos, e permita ao usu�rio realizar chamadas, adicionar avalia��es (at� 3), 
e verificar a m�dia dos alunos.
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
			System.out.println("A lista de alunos est� vazia!");
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
			System.out.println("A lista de turma est� vazio!");
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
		menu += "\n  4 - Adicionar avalia��o.";
		menu += "\n  5 - Sair.";
		menu += "\nEscolha: ";
		return menu;
	}
}