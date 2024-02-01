package myTaskJavaPackage;

public class Loop {
    public static void main(String[] args) {
        int a = 50;

        for(int v = 10; v<=a; v++ ) {
            System.out.println(v);
        }

        System.out.println("--------------------------------------");

        int v = 10;
        while(v<=a) {
            System.out.println(v);
            v++;
        }
    }
}
