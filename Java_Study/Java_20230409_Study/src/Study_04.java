public class Study_04 {
    public static void main(String[] args) {
        int intValue = 44032; 
        char charValue = (char) intValue; //강제 형변환으로 char타입으로 바뀌면서 44032의 유니코드인 '가'가 출력됨 
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue; //int형으로 바뀌면서 소수가 정수로 바뀜
        System.out.println(intValue);
    }
}
