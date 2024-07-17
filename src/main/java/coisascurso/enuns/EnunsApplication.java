package coisascurso.enuns;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnunsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnunsApplication.class, args);
	}

	public class UFsBrasil {

		public enum UF {
			AC("Acre", "Norte"),
			AL("Alagoas", "Nordeste"),
			AP("Amapá", "Norte"),
			AM("Amazonas", "Norte"),
			BA("Bahia", "Nordeste"),
			CE("Ceará", "Nordeste"),
			DF("Distrito Federal", "Centro-Oeste"),
			ES("Espírito Santo", "Sudeste"),
			GO("Goiás", "Centro-Oeste"),
			MA("Maranhão", "Nordeste"),
			MT("Mato Grosso", "Centro-Oeste"),
			MS("Mato Grosso do Sul", "Centro-Oeste"),
			MG("Minas Gerais", "Sudeste"),
			PA("Pará", "Norte"),
			PB("Paraíba", "Nordeste"),
			PR("Paraná", "Sul"),
			PE("Pernambuco", "Nordeste"),
			PI("Piauí", "Nordeste"),
			RJ("Rio de Janeiro", "Sudeste"),
			RN("Rio Grande do Norte", "Nordeste"),
			RS("Rio Grande do Sul", "Sul"),
			RO("Rondônia", "Norte"),
			RR("Roraima", "Norte"),
			SC("Santa Catarina", "Sul"),
			SP("São Paulo", "Sudeste"),
			SE("Sergipe", "Nordeste"),
			TO("Tocantins", "Norte");
	
			private String nomePorExtenso;
			private String regiao;
	
			UF(String nomePorExtenso, String regiao) {
				this.nomePorExtenso = nomePorExtenso;
				this.regiao = regiao;
			}
	
			public String getNomePorExtenso() {
				return nomePorExtenso;
			}
	
			public String getRegiao() {
				return regiao;
			}
		}
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	
			System.out.println("Escolha uma UF do Brasil:");
			for (UF uf : UF.values()) {
				System.out.println(uf.name());
			}
			String ufEscolhida = scanner.nextLine().toUpperCase();
			try {
				UF uf = UF.valueOf(ufEscolhida);
				System.out.println("Nome por extenso: " + uf.getNomePorExtenso());
			} catch (IllegalArgumentException e) {
				System.out.println("UF inválida.");
			}
	
			System.out.println("\nInforme uma região (Norte, Nordeste, Centro-Oeste, Sudeste, Sul):");
			String regiaoEscolhida = scanner.nextLine();
			System.out.println("Estados na região " + regiaoEscolhida + ":");
			boolean regiaoValida = false;
			for (UF uf : UF.values()) {
				if (uf.getRegiao().equalsIgnoreCase(regiaoEscolhida)) {
					System.out.println(uf.getNomePorExtenso());
					regiaoValida = true;
				}
			}
			if (!regiaoValida) {
				System.out.println("Região inválida.");
			}
	
			scanner.close();

}

	}

}
