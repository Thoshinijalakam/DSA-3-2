class array_target1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 3;

        int[] result = processArray(arr, target);

        // printing
        System.out.print("[");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
            if(i < result.length-1) System.out.print(",");
        }
        System.out.println("]");
    }

    public static int[] processArray(int arr[], int target){
        int n = arr.length;
        int[] res = new int[n];

        int index = 0;

        // Step 1 & 2: reverse last target elements
        for(int i = n-1; i >= n-target; i--){
            res[index++] = arr[i];
        }

        // Step 3: add the remaining elements
        for(int i = 0; i < n-target; i++){
            res[index++] = arr[i];
        }

        return res;
    }
}


//int arr[]={1,2,3,4,5,6,7};
//target=3
//expected output:-[7,6,5,1,2,3,4]