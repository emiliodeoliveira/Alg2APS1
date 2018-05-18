
public class Turma {
	private int codTurma = 0;
	private String disciplina;

	public Turma() {
		this.codTurma = codTurma + 1;
		disciplina = Console.readString("Digite o nome da disciplina: ");
	}

	public Turma(String d) {
		this.disciplina = d;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Código: " + codTurma + ", Disciplina: " + disciplina +"";
	}
	
}
