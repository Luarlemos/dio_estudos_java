package br.com.dio.collection.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class LinguagemFavoritaExercicio {

	public static void main(String[] args) {
		System.out.println("Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE: ");
		Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
        
        System.out.println("---------------------------------");
        System.out.println("Ordem de inserção: ");
        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Python", 1991, "Pycharm"));
            add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
            add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
        }};
        
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas1) {
        	System.out.println(linguagem);
        	}
        
        System.out.println("---------------------------------");
        System.out.println("Ordem natural(nome): ");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas1);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas2) { 
        	System.out.println(linguagem);
        	}
        
        System.out.println("---------------------------------");
        System.out.println("Ordem de IDE: ");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<>(new ComparatorIDE());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas3) {
        	System.out.println(linguagem);
        	}
        
        System.out.println("---------------------------------");
        System.out.println("Ano de criação e nome: ");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas4) {
        	System.out.println(linguagem);
        	}
        
        System.out.println("---------------------------------");
        System.out.println("Nome, ano de criação e IDE: ");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<>(new ComparatorNomeAnoCriacaoIDE());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLinguagensFavoritas5) {
        	System.out.println(linguagem);
        	}

	}

}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    public String nome;
    public Integer anoDeCriacao;
    public String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		
		return l1.ide.compareToIgnoreCase(l2.ide);
	}
	
}

class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        return l1.nome.compareToIgnoreCase(l2.nome);
	}
	
}

class ComparatorNomeAnoCriacaoIDE implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		int nome = l1.nome.compareToIgnoreCase(l2.nome);
		if (nome != 0) return nome;
		
		int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if (anoDeCriacao != 0) return anoDeCriacao;
        
        return l1.ide.compareToIgnoreCase(l2.ide);
	}
	
}
