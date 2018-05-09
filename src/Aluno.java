
public class Aluno {
	private String nomeAluno;
	private int numMatricula;
	Avaliacao avaliacao;	

	public Aluno() {
		nomeAluno = Interfaces.readString("Digite o nome do aluno: ");
		numMatricula = Interfaces.readInteger("Digite o número da matricula");
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

	@Override
	public String toString() {
		return "[Nome: " + nomeAluno + ", Matricula: " + numMatricula + "]";
	}	
}
