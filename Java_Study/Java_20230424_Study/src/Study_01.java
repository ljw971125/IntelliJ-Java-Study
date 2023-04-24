public class Study_01 {
    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25)); //AND(논리곱) 두 비트 모두 1일 경우 1
        System.out.println("45 | 25 = " + (45 | 25)); //OR(논리합) 두 비트중 하나만 1이면 1
        System.out.println("45 ^ 25 = " + (45 ^ 25)); //XOR(베타적 논리합) 하나는1 하나는0일 경우 1
        System.out.println("~45 = "+ (~45)); // NOT(논리 부정) 보수(반대)
    }
}
