package homework1;

public class Operators2 {
    public static void main(String[] gggg){
        int a = 5;
        int b = 2;
        int c = 8;
        int d = 20;
        int e = 68;
        int f = 22;
        int g = 12;
        int z = 3;
        int m = 119;
        int o = 7;
        int t = 6;
        boolean n = true;
        boolean p = false;

        System.out.println(a + b / c); // деление в приоритете, результат 5
        System.out.println((a + b) / c); // сначала выполняется то, что в скобках, результат  0
        System.out.println((a + b++) / c); // (a + b++) = 7 в данном случае, тк b больше не используется, результат 0
        System.out.println((a + b++) / --c); // --с = 7, результат 1
        System.out.println((a * b >> b++)/ --c); // выражение в скобках равно 2, результат 0
        System.out.println((a + o > d ? e : f * b >> b++) / c); // в скобках выполняем (f * b >> b++) = 11, финальный результат 1
        
        System.out.println(t - b > z && g * g <= m); // t,b,z,g,m – целые числа, но результат сравнения – логические значения - false
        System.out.println(n && p); // результат AND - false
    }
}
