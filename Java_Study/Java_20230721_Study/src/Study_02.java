public class Study_02 {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println( strArray[0] == strArray[1]); // true
        System.out.println( strArray[0] == strArray[2]); // false(서로 다른 객체를 참조하기 때문에),주소가 다름
        System.out.println( strArray[0].equals(strArray[2])); // true(문자열 비교)
    }
}
