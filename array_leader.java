class array_leader{
    public static void main(String[] args) {
        int arr[]={19,10,12,6,4,3,9,4,5,3};
        int[] leaders=findLeaders(arr);
        System.out.println("[");
        for(int i=0;i<leaders.length;i++){
            System.out.println(leaders[i]);
            if(i<leaders.length-1)System.out.print(",");
        }
        System.out.println("]");
    }
    public static int findleaders(int arr[]){
        int n=arr.length;
        int max=arr[n-1];
        int[] temp=new int[n];
        int index=0;
        temp[index++] = max;
        for(int i = n-2; i >= 0; i--) {
            if(arr[i] > max){
                max = arr[i];
                temp[index++] = max;
            }
        }
    }
}