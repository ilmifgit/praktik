package izi;

public class MyString {
    public static void main(String[] args) {
        String text = "hell";
        System.out.println(text);
        String text2 = "hell";
        System.out.println(text2);
        System.out.println(text==text2);

        String t1 = new String("hell");
        String t2 = new String("hell");
        System.out.println(t1==t2);
        System.out.println(t1.equals(t2));
        System.out.println("fgh\nghjkl");
        System.out.println("vghjk\tfghjk");

    }
}
