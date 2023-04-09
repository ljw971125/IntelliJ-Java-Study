public class Study_03 {
    public static void main(String[] args) {
        //작은 크기를 가지는 타입이 큰 크기를 가지는 타입으로 자동타입변환 됨
        byte byteValue = 10;
        int intValue = byteValue;  //int  <-  byte
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;  //int  <-  char
        System.out.println("가의 유니코드=" + intValue);

        intValue = 500;
        long longValue = intValue;  //long  <-  int
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue; //double  <-  int
        System.out.println(doubleValue);
    }
}
