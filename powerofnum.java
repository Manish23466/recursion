public class powerofnum {
    static int power(int p,int q){
        //base case
        if(q==0){
            return 1;
        }
        //recursive work
        int sum=power(p, q-1);
        //self work
        return sum*p;
        
    }
    public static void main(String args[]){
        System.out.println(power(2, 3));
    }
}
