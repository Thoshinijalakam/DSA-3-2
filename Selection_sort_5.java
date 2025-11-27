public class Selection_sort_5{
    public static void selection(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String args[]){
        int arr[] ={6,7,9,4,3,2,1,0,8,5};
        System.out.println("Before sort.");
            for(int i:arr){
                System.out.println(i+" ");
            }
        selection(arr);
        System.out.println("After sort.");
        for(int i:arr){
            System.out.println(i+" ");
        }
    }
}