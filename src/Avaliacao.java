
public class Avaliacao {
	private int idAluno;
	private double nota1; double nota2; double nota3;

	public Avaliacao() {
		nota1 = Console.readDouble("Digite a nota da avaliação 1: ");
		nota2 = Console.readDouble("Digite a nota da avaliação 2: ");
		nota3 = Console.readDouble("Digite a nota da avaliação 3: ");
	}

	public Avaliacao(int cod, double n1, double n2, double n3) {
		this.idAluno = cod;
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;		 
		System.out.println("Matricula: " + idAluno 
				+ "\nNota 1: " + nota1
				+ "\nNota 2: " +nota2
				+ "\nNota 3: " +nota3
				);
	}	
}
