package izi;

public class Continue {
    public static void main(String[] args) {
        int[] res ={3, 5, 6, 7, 8, 0};
        for(int dev : res){
            System.out.println(dev);
            if(dev ==6){
                continue;
            }
            System.out.println("work");
        }
    }
}
