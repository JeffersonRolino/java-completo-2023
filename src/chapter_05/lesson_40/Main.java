package chapter_05.lesson_40;

public class Main {
    public static void main(String[] args) {
        double price = 400.00;

        //Declarando fora do if statement para garantir o escopo...
        double discount;

        if(price < 200.00) {
            discount = price * 0.1;
        }
        else { //Garantindo inicialização da variável
            discount = 0;
        }

        // Erro: Cannot find symbol variable discount
        // pois a variável está fora de escopo...
        System.out.println(discount);
    }
}
