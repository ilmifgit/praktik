package chikl;

public class whileinfo {
    public static void main(String[] args) {
        int count = 1;
         while (count < 10){
            count++;
             System.out.println(count);

        }

        System.out.println("the end ");

         while (true){
             count++;
             System.out.println(count);
             if(count==20){
                 break;
             }
         }
    }
}
