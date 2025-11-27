public class Insertion_sort{
    public static void insertion(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int min=arr[i];
            int j=i-1;
            for(j=i-1;j>=0 && arr[j]>min;j--){
                arr[j+1]=arr[j];       
            }
            arr[j+1]=min;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,89,3,1,8,0};
        for(int j:arr){
            System.out.print(j+" ");
        }
        insertion(arr);
        System.out.println();
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}