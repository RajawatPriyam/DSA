class Solution {
    public int nextGreaterElement(int n) {
        char[] arr = Integer.toString(n).toCharArray();
        int len = arr.length; int idx = -1;

        for(int i = len-2; i >= 0; i--){
            if(arr[i] < arr[i+1]){
                idx = i;
                break;
            }
        }

        if(idx == -1) return -1;
        else{
            for(int i = len-1; i >= 0; i--){
                if(arr[idx] < arr[i]){
                    char temp = arr[i];
                    arr[i] = arr[idx];
                    arr[idx] = temp;
                    break;
                }
            }
            reverse(arr, idx+1, len-1);
            
            long ans = Long.parseLong(new String(arr));

            if(ans > Integer.MAX_VALUE) return -1;
            else return (int)ans;
        }
    }
    static void reverse(char[] arr, int left, int right){
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
    }
}