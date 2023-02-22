public class fibonacci {
    static int fibonum(int n){
        //base work
        if(n<=1){
            return n;
        }
        return fibonum(n-1)+fibonum(n-2);
        // fibonum(n-1);
        // fibonum(n-2);
        // return fibonum(n-1)+fibonum(n-2);
    }
    public static void main(String args[]){
        int n=9;
        System.out.println(fibonum(n));
        for(int i=0;i<=n;i++){
            System.out.print(fibonum(i)+" ");
        }
    }
}
