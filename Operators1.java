package homework1;

public class Operators1 {
    public static void main(String[] ggg){
        int a = 42;
        int b = 15;
        int c = 2;
        int d = -42;
        int e = -15;
        int f = 1;

        System.out.println(~a); //00101010 результат 11010101
        System.out.println(~b); //00001111 результат 11110000
        System.out.println(~d); //11010110 результат 00101001
        System.out.println(~e); //11110001 результат 00001110

        System.out.println(a & b); //00101010 & 00001111 результат 00001010
        System.out.println(d & e); //11010110 & 11110001 результат 11010000

        System.out.println(a | b); //00101010 | 00001111 результат 00101111
        System.out.println(d | e); //11010110 | 11110001 результат 11110111

        System.out.println(a ^ b); //00101010 ^ 00001111 результат 00100101
        System.out.println(d ^ e); //11010110 ^ 11110001 результат 00100111

        System.out.println(a << c); //00101010 результат 10101000
        System.out.println(b << c); //00001111 результат 00111100
        System.out.println(d << c); //11010110 результат 101011000
        System.out.println(e << c); //11110001 результат 11000100

        System.out.println(a >> c); //00101010 результат 00001010
        System.out.println(b >> c); //00001111 результат 00000011
        System.out.println(d >> c); //11010110 результат 11110101
        System.out.println(e >> c); //11110001 результат 11111100

        System.out.println(a >>> c); //00101010 результат 00001010
        System.out.println(b >>> c); //00001111 результат 00000011
        System.out.println(d >>> 28); //11111111  11111111  11111111 11010110 результат 00001111
        System.out.println(e >>> 26); //11111111  11111111  11111111 11110001 результат 00111111

        System.out.println(a &= b); //00101010 & 00001111 результат 00001010
        System.out.println(d &= e); //11010110 & 11110001 результат 11010000

        System.out.println(a |= b); //00001010 | 00001111 результат 00001111
        System.out.println(d |= e); //11010000 | 11110001 результат 11110001

        System.out.println(a >>>= c); //00001111 результат 00000011
        System.out.println(b >>>= c); //00001111 результат 00000011
        System.out.println(d >>>= 28); //11111111  11111111  11111111 11110001 результат 00001111
        System.out.println(e >>>= 26); //11111111  11111111  11111111 11110001 результат 00111111

        System.out.println(a <<= c); //00000011 результат 00001100
        System.out.println(b <<= c); //00000011 результат 00001100
        System.out.println(d <<= 1); //00001111 результат 00011110
        System.out.println(e <<= 1); //00111111 результат 01111110

        System.out.println(a ^= c); //00001100 ^ 00000010 результат 00001110
        System.out.println(b ^= c); //00001100 ^ 00000010 результат 00001110
        System.out.println(d ^= c); //00011110 ^ 00000010 результат 00011100
        System.out.println(e ^= c); //01111110 ^ 00000010 результат 01111100

        System.out.println(a >>= c); //00001110 результат 00000011
        System.out.println(b >>= c); //00001110 результат 00000011
        System.out.println(d >>= c); //00011100 результат 00000111
        System.out.println(e >>= c); //01111100 результат 00011111




    }
}
