public class FromIntToFloat {
    public static void main(String[] args) {
       //정수 타입을 실수 타입으로 변환할 때 정밀도 손실을 피한다.
       int num1 = 123456780;
       int num2 = 123456780;

       float num3 = num2;
       System.out.println(num2);
       num2 = (int) num3;
       System.out.println("num2:" + num2);

        int result = num1 - num2;
        System.out.println(result);
    }
}
