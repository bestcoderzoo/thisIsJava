public class CheckValueBeforeCasting {
    public static void main(String[] args) {
        int i = 128; // byte 최대값 over.

        if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
            System.out.println("byte 타입으로 변환할 수 없습니다.");
            System.out.println("값을 다시 확인해 주세요.");
        } else {
            byte b = (byte) i;
            System.out.println(b);
        }

        // 자바는 코드에서 데이터 값을 검사하기 위해 boolean과 char 타입을 제외하고 모든 기본 타입에
        // 대해 최대값(max)과 최소값(min)을 다음과 같이 상수로 제공하고 있다.

        
    }
}
