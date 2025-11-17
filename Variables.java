package izi;

public class Variables {
    public static void main(String[] args) {
        int countHeart = 1;
        System.out.println(countHeart);
        countHeart = 3;
        double x = 3.1;
        System.out.println(countHeart + " " + x);
        // lol chek
        boolean trueChek = true;
        boolean falseChek = false;

        // byte = 8 bit
        byte max = 127;
        byte min = -128;

        // short = 2 byte = 16 bit
        short maxShort = 32_767;
        short minShort = -32_768;

        // int = 4 byte
        int maxInt = 2_142_483_647;
        int minInt = -2_142_483_646;

        // long = 8 byte
        long maxLong = 9_223_372_036_854_775_807l;
        long minLong = -9_223_372_036_854_775_806l;

        // 64 bit
        double xd = 1.234730740837866;
        // 32 bit
        float dx = 1.23387348737036869f;

        System.out.println(xd);
        System.out.println(dx);

        // char символ
        char letter = 'z';
        System.out.println(letter);
        char letterTwo = 'z' + 1; //смю таблица кодировок
        System.out.println(letterTwo);
        char tab = '\t';
        char sleh = '\\';
        System.out.println(tab);
        System.out.println(sleh);
int gh = 2;
        switch (gh){
            case 1 -> System.out.println();
            case 2 -> System.out.println();
            default -> System.out.println();
        }
    }
}
