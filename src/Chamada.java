
public class Chamada {
	private String dataChamada = "";
	private int idAluno = 0;
	private int idTurma = 0;
	private int presenca = 0;
	
	public Chamada(String data, int aluno, int turma, int pres) {
		this.dataChamada = data;
		this.idAluno = aluno;
		this.idTurma = turma;
		this.presenca = pres;		
	}
	
	public String getDataChamada() {
		return dataChamada;
	}
	public void setDataChamada(String dataChamada) {
		this.dataChamada = dataChamada;
	}
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public void setPresenca(int presenca) {
		this.presenca = presenca;
	}
	
	public int getPresenca() {
		return presenca;
	}

	@Override
	public String toString() {
		return "Chamada [dataChamada=" + dataChamada + ", idAluno=" + idAluno + ", idTurma=" + idTurma + ", presenca="
				+ presenca + "]";
	}
	
	
}
