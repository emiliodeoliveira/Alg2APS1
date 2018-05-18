import java.util.Random;

public class Aluno {
	private String nomeAluno;
	private int numMatricula;
	Avaliacao avaliacao;	

	public Aluno() {
		numMatricula = geradorNumeroMatricula();
		nomeAluno = Console.readString("Digite o nome do aluno: ");
		System.out.println("[Nome: " + nomeAluno + ", Matricula: " + numMatricula + "]");
	}
	
	public Aluno(String a) {		
		numMatricula = geradorNumeroMatricula();
		nomeAluno = a;		
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	// Este méotod gera um código aleatório de matricula
	public static int geradorNumeroMatricula() {
		Random ran = new Random();
		int[] simbolos = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };		
		int tamanhoNum  = 6;
		int b = 0;
		for (int i = 0; i < tamanhoNum; i++) {
			int a = ran.nextInt(simbolos.length);
			b += simbolos[a];
		}
		return b;
	}

	@Override
	public String toString() {
		return "[Nome: " + nomeAluno + ", Matricula: " + numMatricula + "]";
	}	
}
