package imc;
//imc
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual teu peso: ");
		double peso = sc.nextDouble();
		System.out.println("Qual tua altura: ");
		double altura = sc.nextDouble();
		double calc = (altura * altura)/peso;
		//identificação da gordura corporal
		if(calc < 18.5) {
				System.out.println("Abaixo do peso");
		}
		else if(calc >= 18.5 && calc <= 24.9) {
			System.out.println("Peso normal");
		}
		else if(calc >= 25.0 && calc <= 29.9) {
			System.out.println("Excesso de peso");
		}
		else if(calc >= 30.0 && calc <= 34.9) {
			System.out.println("Obesidade classe 1");
		}
		else if(calc >= 35.0 && calc <= 39.9) {
			System.out.println("Obesidade classe 2");
		}
		else if(calc > 40.0) {
			System.out.println("Arrasta pra cima papai");
		}
	}
	

}
