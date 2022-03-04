package qa.guru;

public class JavaTypes {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.testMethod();
    }
}
class TestClass {
    byte tByte; // 8 bit -- min value -128 and max value 127
    short tShort; // 16 bit -- min value -32,768 and max value 32,767
    int tInt; // 32 bit -- min value -2^31 and max value (2^31)-1
    long tLong; // 64 bit -- min value -2^63 and max value (2^63)-1

    float tFloat; // 32 bit
    double tDouble; // 64 bit

    boolean tBoolean; // true or false
    char tChar; // 16 bit -- min value '\u0000' (or 0) and max value '\uffff' (or 65,535)

    void testMethod() {
        tByte = 120;
        System.out.println((byte) (tByte + tByte));

        tInt = 100;
        tChar = '$';
        System.out.println(tInt + tChar);

        tChar = '-';
        System.out.println(tChar);
        System.out.println((int) tChar);
        System.out.println((short) tChar);
        System.out.println((double) tChar);

        tShort = 32_767;
        tChar = '%';
        System.out.println(tShort<tChar);

        tChar = 'z';
        tChar++;
        System.out.println(tChar);

        tLong = 555L;
        tFloat = 555.0000000000000055555555F;
        tDouble = 555.000000000000009999991D;
        System.out.println(tLong == tFloat);
        System.out.println(tLong == tDouble);
        System.out.println(tFloat == tDouble);
        System.out.println(tFloat > tDouble);

        tBoolean = true;
        System.out.println(true != (tFloat > tDouble));
    }

}