
public class Avaliacao {
	private double notaAluno;
	private int contNotas = 0;
	
	
		
	public Avaliacao() {
		setNotaAluno(Interfaces.readDouble("Digite a nota: "));
	}
	public double getNotaAluno() {
		return notaAluno;
	}
	public void setNotaAluno(double notaAluno) {
		this.notaAluno = notaAluno;
	}
	
	

}
