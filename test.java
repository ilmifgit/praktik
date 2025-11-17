package chikl;

public class test {
    public static void main(String[] args) {
        int outer = 2;
        int innerCount = 0;
        System.out.println(outer + "outer");
        while (outer > 0){
            int inner = 3;
            System.out.println(inner + "inner");
            while (inner > 0){
                innerCount++;
                inner--;
                System.out.println(inner + "inner");
                System.out.println(innerCount + "innerCount");
            }
            outer--;
        }
        System.out.println(innerCount);
    }
}
