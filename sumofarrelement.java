public class sumofarrelement {
    static int sumofarray(int arr[],int index){
        //base case
        if(index==arr.length){
            return 0;
        }
        //recursive work
        int sumadd=sumofarray(arr, index+1);
        //self work
        return sumadd+arr[index];
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println(sumofarray(arr, 0));
    }
}
