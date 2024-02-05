package br.com.germat.Enums;

public enum Curso {

    CORACAO("Projeto Cor Ação"),
    TECLADO("Teclado"),
    VIOLAO("Violão"),
    PROGRAMACAO("Programação"),
    APRENDIZ("Aprendiz"),
    OFICINAS("Oficinas");

    private String curso;
    private Curso(String curso) {
        this.curso = curso;
    }
}
