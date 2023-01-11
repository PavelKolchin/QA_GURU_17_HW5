
public class Practic {

    public static void main (String [] args) {

        byte a = 127;
        short b = 260;
        int c = 1386;
        long d = 1234567890;
        float e = 1235.55f;
        double f = 1482.5;
        boolean g;

        System.out.println("byte*short - "+(a*b));
        System.out.println("int+long - "+(c+d));
        System.out.println("float+double - "+(e+f));
        System.out.println("double/byte - "+(f/a));
        System.out.println("short % byte - "+(b%a));
        System.out.println("double-int - "+ (f-c));
        System.out.println("переполнение byte - "+(byte)(a+5));

        g=c<a;
        if (g==true) {
            System.out.println("c<a it's true");
        } else {
            System.out.println("c<a it's false");
        }
    }
}
