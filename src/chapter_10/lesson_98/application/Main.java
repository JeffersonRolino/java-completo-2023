package chapter_10.lesson_98.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Instanciando a lista
        List<String> names = new ArrayList<>();

        //*************************************************************************
        // ADICIONANDO ELEMENTOS
        //*************************************************************************

        // Adicionando elementos na lista
        names.add("Mary");
        names.add("Alex");
        names.add("Bob");
        names.add("Anna");
        names.add("John");
        names.add("Allison");
        names.add("Mark");
        names.add("Alice");

        // Adicionando em posição específica
        names.add(2, "Sophie");

        // Verificando tamanho da lista
        System.out.println("Tamanho da lista: " + names.size());


        //*************************************************************************
        // REMOVENDO ELEMENTOS
        //*************************************************************************

        // Removendo elemento da lista pelo Valor
        names.remove("Anna");

        // Removendo elemento da lista por Posição
        names.remove(1);

        // Removendo elementos por Predicado
        names.removeIf(name -> name.charAt(0) == 'M');


        //*************************************************************************
        // BUSCANDO ELEMENTOS
        //*************************************************************************

        // Encontrando o index de um elemento
        System.out.println("Index of Bob: " + names.indexOf("Bob"));
        // Retorno de um elemento que não está na lista
        System.out.println("Index of Anna: " + names.indexOf("Anna"));

        // Filtrando uma lista com Streams and Filter
        List<String> filteredNames = names.stream().filter(name -> name.charAt(0) == 'A').toList();

        // Encontrando primeiro elemento da lista com um Predicado
        String firstNameOccurrence = names.stream().filter(name -> name.charAt(0) == 'A').findFirst().orElse(null);



        for(String name : filteredNames){
            System.out.println(name);
        }

        System.out.println("\nPrimeiro nome com 'A' da lista: " + firstNameOccurrence);

    }
}
