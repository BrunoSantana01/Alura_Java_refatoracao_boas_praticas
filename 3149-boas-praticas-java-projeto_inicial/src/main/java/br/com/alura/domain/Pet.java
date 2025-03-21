package br.com.alura.domain;

public class Pet {

    private Long id;
    private String tipo;
    private String nome;
    private String raca;
    private int idade;
    private String cor;
    private Float peso;

    Pet() {
    }

    public Pet(String tipo, String nome, String raca, int idade, String cor, Float peso) {
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    public Long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getCor() {
        return this.cor;
    }

    public Float getPeso() {
        return this.peso;
    }

    public String getTipo() {
        return this.tipo;
    }
}
