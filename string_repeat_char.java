class string_repeat_char {
    public static void main(String[] args) {
        String str = "Hey I'm thoshini";
        char[] arr = str.toCharArray();
        System.out.println("Repeated Characters:");
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] == '0' || arr[i] == ' ') continue; // skip marked/space
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0';  // mark as counted
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + " = " + count);
            }
        }
    }
}
