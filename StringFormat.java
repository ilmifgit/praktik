package izi;

public class StringFormat {
    public static void main(String[] args) {
        String name = "bastard";
        int age = 20;
        String phrese = String.format("name: %s . age: %d", name, age);
        System.out.println(phrese);
        /*
        %s	Строка
        %d	Целое число
        %f	Число с плавающей точкой
        %n	Перенос строки (кроссплатформенный)
        %x	Целое число в шестнадцатеричном виде
        %t	Форматирование даты/времени
         */
        System.out.printf("name: %s . age: %d", name, age);
    }
}
