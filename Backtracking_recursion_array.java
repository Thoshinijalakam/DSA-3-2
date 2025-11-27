public class Backtracking_recursion_array{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        array(arr,2);
    }
    public static void array(int[] arr,int index){
        if(index==arr.length-1){
            return;
        }
        System.out.println(arr[index]+" ");
        array(arr,index + 1);
    }
}