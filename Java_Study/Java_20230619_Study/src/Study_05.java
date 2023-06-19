public class Study_05 {
    public static void main(String[] args) {
        while(true){
            int a = (int)(Math.random()*6)+1;
            int b = (int)(Math.random()*6)+1;
            System.out.println("("+a+","+b+")");
            int sum = a+b;
            if(sum == 5){
                break;
            }
        }
        System.out.println("종료");
    }
}
