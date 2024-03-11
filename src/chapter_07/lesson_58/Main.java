package chapter_07.lesson_58;

public class Main {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG  ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i01 = original.indexOf("bc");
        int i02 = original.lastIndexOf("bc");

        System.out.println("Original: \t\t\t*" + original + "*");
        System.out.println("toLowerCase: \t\t*" + s01 + "*");
        System.out.println();

        System.out.println("Original: \t\t\t*" + original + "*");
        System.out.println("toUpperCase: \t\t*" + s02 + "*");
        System.out.println();

        System.out.println("Original: \t\t\t*" + original + "*");
        System.out.println("Trim: \t\t\t\t*" + s03 + "*");
        System.out.println();

        System.out.println("Original: \t\t\t*" + original + "*");
        System.out.println("Substring(2): \t\t*" + s04 + "*");
        System.out.println();

        System.out.println("Original: \t\t\t*" + original + "*");
        System.out.println("Substring(2, 9): \t*" + s05 + "*");
        System.out.println();

        System.out.println("Original: \t\t\t*" + original + "*");
        System.out.println("Replace(a, x): \t\t*" + s06 + "*");
        System.out.println();

        System.out.println("Original: \t\t\t*" + original + "*");
        System.out.println("Replace(abc, xy): \t*" + s07 + "*");
        System.out.println();

        System.out.println("Original: \t\t\t*" + original + "*");
        System.out.println("indexOf(bc): \t\t* " + i01 + " *");
        System.out.println();

        System.out.println("Original: \t\t\t*" + original + "*");
        System.out.println("lastIndexOf(bc): \t* " + i02 + " *");
        System.out.println();
    }
}
