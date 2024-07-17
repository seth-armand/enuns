package coisascurso.enuns;

import java.util.Scanner;

public class UFsAmericaSul {

    public enum UF {
        ARGENTINA("Argentina"),
        BOLIVIA("Bolívia"),
        BRAZIL("Brasil"),
        CHILE("Chile"),
        COLOMBIA("Colômbia"),
        ECUADOR("Equador"),
        GUYANA("Guiana"),
        PARAGUAY("Paraguai"),
        PERU("Peru"),
        SURINAME("Suriname"),
        URUGUAY("Uruguai"),
        VENEZUELA("Venezuela");

        private String nomePorExtenso;

        UF(String nomePorExtenso) {
            this.nomePorExtenso = nomePorExtenso;
        }

        public String getNomePorExtenso() {
            return nomePorExtenso;
        }
    }

    public enum Regiao {
        AMERICA_DO_SUL(new UF[] {UF.ARGENTINA, UF.BOLIVIA, UF.BRAZIL, UF.CHILE, UF.COLOMBIA, UF.ECUADOR, UF.GUYANA, UF.PARAGUAY, UF.PERU, UF.SURINAME, UF.URUGUAY, UF.VENEZUELA});

        private UF[] estados;

        Regiao(UF[] estados) {
            this.estados = estados;
        }

        public UF[] getEstados() {
            return estados;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Escolha uma UF da América do Sul:");
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

       
        System.out.println("\nEscolha uma região:");
        for (Regiao regiao : Regiao.values()) {
            System.out.println(regiao.name());
        }
        String regiaoEscolhida = scanner.nextLine().toUpperCase();
        try {
            Regiao regiao = Regiao.valueOf(regiaoEscolhida);
            System.out.println("Estados na região " + regiao.name() + ":");
            for (UF uf : regiao.getEstados()) {
                System.out.println(uf.getNomePorExtenso());
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Região inválida.");
        }

        scanner.close();
    }
}


