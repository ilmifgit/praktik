package izi;

import java.util.Arrays;

public class StringMetod {
    public static void main(String[] args) {
        String text = "Hello world!";
         //верх. рег
        String textUpper = text.toUpperCase();
        System.out.println(textUpper);
         //ниж. рег
        String textLower = text.toLowerCase();
        System.out.println(textLower);
         //длина
        int lenght = text.length();
        System.out.println(lenght);
         // проверка на наличии в тексте
        boolean containsHello = text.contains("Hello");
         // замена частей текста
        String replecedText = text.replaceAll("l","d");
        System.out.println(replecedText);
         // повтор текста n раз
        String repeatedText = text.repeat(10);
        System.out.println(repeatedText);
         //разбить текст на массив String
        String names = "qwerty;uiopas;fghj;klzxcvb;nm";
        String[] namesArray = names.split(";");
        System.out.println(Arrays.toString(namesArray));
         //  объединение строк (конкатенация)
        String word1 = "ni";
        String word2 = "firee";
        String res = word1 + word2;
        System.out.println(res);
         // начинается на подстроку
        boolean startWithHel = text.startsWith("Hell");
        System.out.println(startWithHel);
         // заканчивается на подстроку
        boolean endWithWorld = text.endsWith("world!");
        System.out.println(endWithWorld);
        // обрезка строки
        String firstFiveLetter = text.substring(0, 5);
        System.out.println(firstFiveLetter);

        
    }
}
