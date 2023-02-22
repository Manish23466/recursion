public class sumofnno {
    static int sum(int n){
        //base case
        if(n%10==0){
            return 0;
        }
        //recursive work
        int num=sum(n/10);
        //self work
        return num+n%10;

    }
    public static void main(String args[]){
        System.out.println(sum(12345));

    }
}
