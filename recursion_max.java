public class recursion_max{
    public static void main(String[] args) {
        int arr[]={2,3,5,9,7,10};
        System.out.println(maxValue(arr,0));
    }
    public static int maxValue(int[]arr,int i){
        if(i==arr.length-1)return arr[i];
        return Math.max(arr[i],maxValue(arr,i+1));
    }

}