class sumofnnum {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        //recursive case or small problem
        int num=sum(n-1);
        //self work
        return num+n;
    }
    public static void main(String args[]){
        System.out.println(sum(5));

    }
}