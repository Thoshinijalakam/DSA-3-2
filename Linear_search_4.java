public class Linear_search_4{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=7;
        System.out.println(linearsearch(arr,target));
    }
    public static int linearsearch(int[] arr,int target){
        int i=0;
        while(i<arr.length){
            if(arr[i]==target){
                return i;
            }
            i++;
        }
        return -1;
    }
}