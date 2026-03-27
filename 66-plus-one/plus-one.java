class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length -1;
        int carry = 1;
        ArrayList<Integer> res = new ArrayList<>();
        while( i >= 0 || carry > 0){
            int sum = carry;

            if(i >= 0)sum += digits[i--];
            carry = sum/10;

            res.add(sum%10);
        }
        Collections.reverse(res);
        int[] arr = new int[res.size()];
        for(i = 0; i < arr.length; i ++){
            arr[i] = res.get(i);
        }
        return arr;
    }
}