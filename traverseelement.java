public class traverseelement {
    static void traverse(int arr[],int index){
        //base case
        if(index==arr.length){
            return;
        }
        //self work
        System.out.print(arr[index]+" ");
        //recursive work
        traverse(arr, index+1);
    }

    public static void main(String args[]){
        int arr[]={2,54,6,9,8,78,45,12};
        traverse(arr, 0);
    }
}
