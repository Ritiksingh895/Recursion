
public class decreasing{
    public static void decreasingNo(int n){

        if (n==1){
            System.out.println("1");
            return;
        }
        System.out.println(n+" ");
        decreasingNo(n-1);

    }
    public static void main(String[] args) {
        int n=10;
        decreasingNo(n);
    }

}