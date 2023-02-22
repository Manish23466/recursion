public class factorial {
    static int fact(int n){
        //base case
        if(n==0){
            return 1;
        }
        //recursive case or small problem
        int facto=fact(n-1);
        //self work
        return facto*n;
    }
    public static void main(String args[]){
        System.out.println(fact(5));
    }
}
