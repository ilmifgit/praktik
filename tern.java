package chikl;

public class tern {
    public static void main(String[] args) {
        boolean grm0 = true;
        boolean grm1 = true;
        boolean grm2 = true;
        boolean grm3 = false;

        int count = 0;

        count += grm0 ? 1:0;
        count += grm1 ? 1:0;
        count += grm2 ? 1:0;
        count += grm3 ? 1:0;
        System.out.println(count);
    }
}
