import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 * @author Emilio de Oliveira
 *
 */
public class Principal {
	Aluno aluno = new Aluno();
	Turma turma = new Turma();
	static ArrayList<Aluno> listaAlunos = new ArrayList<>();
	static ArrayList<Turma> listaTurma = new ArrayList<>();
	static ArrayList<Avaliacao> avaliacoes = new ArrayList<>();	
	static ArrayList<Chamada> chamadas = new ArrayList<>();

	public static void main(String[] args) {
		inicializaAlunos();
		inicializaTurmas();
		while (true) {
			switch (Interfaces.readString(menu()).charAt(0)) {
			case '1':
				listaAlunos.add(new Aluno());
				break;
			case '2':
				listaTurma.add(new Turma());
				break;
			case '3':
				listarAlunos();
				break;
			case '4':
				listarTurmas();
				break;
			case '5':
				realizarChamada();
				break;
			case '6':
				adicionarAvaliacao();
				break;
			case '7':
				System.exit(0);
				break;
			}
		}		
	}

	// Insere valores no arraylist dos alunos, conforme solicitado no enunciado.
	private static void inicializaAlunos() {
		listaAlunos.add(new Aluno("Ana Martins"));
		listaAlunos.add(new Aluno("Bruno Castro"));
		listaAlunos.add(new Aluno("Carlos Albuquerque"));
		listaAlunos.add(new Aluno("Daniele Silva"));
		listaAlunos.add(new Aluno("Wilson Martins"));
	}

	// Insere valores no arraylist das turmas.
	private static void inicializaTurmas() {
		listaTurma.add(new Turma("Algoritmos II"));		
	}

	private static void adicionarAvaliacao() {		
		double n1 = 0, n2 = 0, n3 = 0;
		int cod = Interfaces.readInteger("Digite a matricula do aluno: ");
		int codVerificado = verificaCodAluno(cod);
		if (codVerificado != -1) {
			n1 = Interfaces.readDouble("Digite a nota da avaliação 1: ");
			n2 = Interfaces.readDouble("Digite a nota da avaliação 2: ");
			n3 = Interfaces.readDouble("Digite a nota da avaliação 3: ");
		} else {
			System.out.println("Erro");
		}
		avaliacoes.add(new Avaliacao(cod, n1, n2, n3));
	}

	private static void realizarChamada() {
		String data = Interfaces.getDateTime();
		int cont = 0;
		int verificaPresenca = 0;
		listarTurmas();
		int cTurma = Interfaces.readInteger("Digite o código da turma: ");
		
		System.out.print("Chamada da turma de "+listaTurma.get(cTurma).getDisciplina()+" do dia de "+data+":\n");
		for(Aluno s: listaAlunos){			
			System.out.print(listaAlunos.get(cont).getNomeAluno()+". ");
			char pres = Interfaces.readChar("Presente? [S/N]: ");
			pres = Character.toUpperCase(pres);
			if (pres == 'S') {
				verificaPresenca = 0;
				chamadas.add(new Chamada(data, cont, cTurma, verificaPresenca));
			} else if (pres == 'N'){
				verificaPresenca = 1;
				chamadas.add(new Chamada(data, cont, cTurma, verificaPresenca));
			} else {
				System.out.println("Opção inválida!");				
			}
			cont++;			
		}
		mostrarPresenca(data, cTurma);
	}

	private static void listarAlunos() {
		for(Aluno s: listaAlunos){
			System.out.println(s);
		}
	}

	private static void listarTurmas() {
		for(Turma s: listaTurma){
			System.out.println(s);
		}
	}

	private static int verificaCodAluno(int a){
		int c = 0;
		for(int i=0; i < listaAlunos.size(); i++) {
			if(listaAlunos.get(i).getNumMatricula() == a)
				c = i;
			else 
				c = -1;
		}
		return c;
	}
	
	// Esse método percorre o array da chamada e verifica o ID do aluno, pegando informação de nome e presença no arraylist das chamadas.
	private static void mostrarPresenca(String d, int t) {
		int checaPresenca = 0;
		System.out.println("Chamada do dia "+d+	"\nDisciplina: "+listaTurma.get(t).getDisciplina()+"\n----------");
		for(int i=0; i < chamadas.size(); i++){			
			checaPresenca = chamadas.get(i).getPresenca();			
			System.out.print(listaAlunos.get(i).getNomeAluno()+": ");
			switch (checaPresenca) {
			case 0:			
				System.out.println("presente");
				break;
			case 1:
				System.out.println("ausente");				
				break;		
			}
		}
	}

	private static String menu() {
		String menu = "";
		menu += "\nSistema escolar:";
		menu += "\n  1 - Cadastrar aluno.";
		menu += "\n  2 - Cadastrar turma.";
		menu += "\n  3 - Listar alunos.";
		menu += "\n  4 - Listar turmas.";
		menu += "\n  5 - Realizar chamada.";
		menu += "\n  6 - Adicionar avaliação.";
		menu += "\n  7 - Sair.";
		menu += "\nEscolha: ";
		return menu;
	}
}