class array_sum{
    public static void main(String args[]){
        int[] arr={3,5,6,8,7,4,3,6,2};
        int sumEven=0;
        int sumOdd=0;
        for (int i=0;i <arr.length ; i++) {
            //System.out.println(arr[i]);
            if(arr[i]%2==0){
               sumEven= sumEven + arr[i];
            }else{
                sumOdd=sumOdd + arr[i];
            }
            
        }
            System.out.println("Sum of Even Numbers: " + sumEven);
            System.out.println("Sum of Odd Numbers: " + sumOdd);
    }
        
    }
