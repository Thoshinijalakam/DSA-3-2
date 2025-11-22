class array_target{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=10;
        target(arr,target);
    }
    public static void target(int arr[],int target){
        boolean status=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j]==target){
                    status=true;
                    System.out.println(arr[i]+"+"+arr[j]+"="+target);

                }
            }
        }
        if(!status){
            System.out.println("Target not found:");
        }
    }
}
//int arr[]={3,45,6,8,7,4,3,6,2,5};
//target=10
//expected output:=
//[3,7]