public class ByteExample {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        //byte var6 = 128; // 컴파일 에러 byte일 경우 -128 최소값부터 시작해서 127최대값을 넘으면 다시 -128부터 시작하게 된다. 
        // 엉터리값 = 쓰레기값. 
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

    }
}
