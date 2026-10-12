import java.util.Scanner;
public class FifteenthTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.print("1");
        } else if (n2 > n1) {
            System.out.print("2");
        } else {
            System.out.print("0");
        }
    }
}