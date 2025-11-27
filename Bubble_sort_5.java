public class Bubble_sort_5{
    public static void bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println();
            for(Object k:arr){
                System.out.print(k+" ");
            }
        }
    }    
    public static void main(String[] args) {
        int arr[]={3,6,7,9,5,8,0,1,2,4};
        System.out.println("before sort..");
        for(int j: arr){
            System.out.print(j+" ");
        }
        bubblesort(arr);
        System.out.println();
        System.out.println("after sort..");
            for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
//Before Sort
//3 7 4 5 9 1 2 8 
//7 4 5 9 3 2 8 1 
//7 5 9 4 3 8 2 1 
//7 9 5 4 8 3 2 1 
//9 7 5 8 4 3 2 1
//9 7 8 5 4 3 2 1 
//7 9 5 4 8 3 2 1
//9 7 5 8 4 3 2 1
//9 7 8 5 4 3 2 1
//9 7 8 5 4 3 2 1
//9 8 7 5 4 3 2 1
//9 8 7 5 4 3 2 1
//9 8 7 5 4 3 2 1
//After Sort
//9 8 7 5 4 3 2 1