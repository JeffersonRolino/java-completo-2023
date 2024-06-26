package chapter_19.lesson_243.application;

import chapter_19.lesson_243.entities.Client;

public class Main {
    public static void main(String[] args) {
        String a = "Maria";
        String b = "Alex";

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Client client1 = new Client("Maria", "maria@gmail.com");
        Client client2 = new Client("Alex", "alex@gmail.com");

        Client client3 = new Client("Maria", "maria@gmail.com");

        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client3.hashCode());

        System.out.println(client1.equals(client2));

        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");

        // true: Pois os HashCode gerado será igual
        System.out.println(client1.equals(client3));

        // false: Pois os objetos alocados no Heap são diferentes
        System.out.println(client1 == client3);

        // true: O compilador trata literais de modo especial.
        System.out.println(s1 == s2);

        // false: O s3 foi alocado no Heap ao utilizar o new
        System.out.println(s1 == s3);
    }
}
