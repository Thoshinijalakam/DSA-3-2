public class Binary_search_4{
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=10;
        System.out.println(binarysearch(arr,target));
    } 
    public static int binarysearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;

        }
            return -1;
    }
}