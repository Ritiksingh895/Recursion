import java.util.Scanner;

public class PrintSum {
    public static int Sum(int n){
        if (n==1){
            return n;
        }
       int fnm1=Sum(n-1);
       int fn=n+Sum(n-1);
       return fn;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println(Sum(n));
    }
}
