
public class Avaliacao {
	private double notaAluno;
	private double nota1; double nota2; double nota3;

	public Avaliacao() {
		nota1 = Interfaces.readDouble("Digite a nota da avalia��o 1: ");
		nota2 = Interfaces.readDouble("Digite a nota da avalia��o 2: ");
		nota3 = Interfaces.readDouble("Digite a nota da avalia��o 3: ");		
	}
}
