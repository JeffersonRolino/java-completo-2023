package chapter_04.lesson_24;

public class Main {
    public static void main(String[] args) {
        int x, y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        //Exemplo 3: Cálculo da área de um trapézio
        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);

        //Exemplo 4: Valores truncados
        int i, j;
        double resultado;

        i = 5;
        j = 2;

        // O valor sairá errado, o próprio IntelliJ já está avisando...
        // integer division in floating-point context...
        resultado = (double) i / j;
        System.out.println(resultado);

        //Exemplo 5: Casting
        double number_1;
        int number_2;

        number_1 = 5.0;
        number_2 = (int)number_1;

        System.out.println(number_2);
    }
}
