public class IncresingNo {
    public static void increasingNo(int n){

        if (n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        increasingNo(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        increasingNo(n);
    }
}
