public class PromotionExample {
    public static void main(String[] args) {
        //Promotion : 자동타입전환
        //byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
        byte byteValue = 10;
        int intValue = byteValue; //자동 타입 변환이 일어난다.

        //char는 2byte의 크기를 가지지만, char의 범위는 0~65535이므로 음수가 저장될 수 없다.
        //byte타입을 char 타입으로 자동 변환시킬 수 없다.
        byte byteValue2 = 65;
        char charValue = byteValue2; //Error
        char charDate = (char)byteData; // 강제 타입 변환 o

        
    }
}
