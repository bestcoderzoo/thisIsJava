public class FromIntToDouble {
    public static void main(String[] args) {
        int num1 = 123456780;
        int num2 = 123456780;

        double num3 = num2;
        num2 = (int) num3;
        int result = num1 - num2;
        System.out.println(result);

        // Double의 기수가 52비트이므로 32bit인 int의 값을 손실 없이 변환할 수 있다.
        
        //연산식에서의 자동 타입 변환

        int intValue2 = 10;
        double doubleValue2 = 5.5;
        double result = intValue2 + doubleValue; //double 값으로 변환
        // resultdp 15.5가 저장됨.
        
    }
}
