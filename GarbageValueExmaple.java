public class GarbageValueExmaple {
    public static void main(String[] args) {
        byte var1 = 125;
        int var2 = 125;

        for(int i=0; i<5; i++){
            var1++;

            var2++;

            System.out.println("var1:" + var1 + "\t" + "var2:" + var2);
            // byte 값의 최소 최대 범위가 넘어 가면 최소값으로 시작하게 되므로 엉터리값이 형성됨.
        }
    }
}
