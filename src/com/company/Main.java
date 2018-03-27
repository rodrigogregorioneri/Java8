package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        Pessoa user1 = new Pessoa("Priscila Oliveira", 20,1.5f);
        Pessoa user2 = new Pessoa("Rodrigo Neri", 23,2.3f);
        Pessoa user3 = new Pessoa("Jose Carlos", 30,1.6f);
        List<Pessoa> pessoas = Arrays.asList(user1, user2, user3);
        pessoas.forEach(u -> System.out.println(u.getNome()
                .concat("Idade: \n"+String.valueOf(u.getIdade())
                .concat(String.valueOf(" Altura: \n"+u.getAltura())))));
    }
}

class Pessoa{

    private String nome;

    private int idade;

    private float altura;

    public Pessoa(String nome, int idade, float altura ){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
