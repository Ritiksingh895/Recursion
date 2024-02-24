public class fibonacci {
    public static int Printfib(int n){
        if (n==0||n==1){
            return n;
        }
        int fnm2=Printfib(n-2);
        int fnm1=Printfib(n-1);
        int fn=Printfib(n-2)+Printfib(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n =5;
        for( int i=0;i<n;i++){
        System.out.println(Printfib(i));
        
        }
    }
}
