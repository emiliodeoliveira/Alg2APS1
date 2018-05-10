
public class Turma {
	private String disciplina;

	public Turma() {
		disciplina = Interfaces.readString("Digite o nome da disciplina: ");		
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Turma [disciplina=" + disciplina + "]";
	}	
	
}
