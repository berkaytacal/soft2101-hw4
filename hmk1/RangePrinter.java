import java.util.Scanner;

public class RangePrinter {
    public static void printRange(int a, int b) {
        int start = Math.min(a, b) + 1;
        int end = Math.max(a, b);

        for (int i = start; i < end; i++) {
    if (i % 2 == 0) {
        System.out.println(i);
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        printRange(x, y);
    }
}

