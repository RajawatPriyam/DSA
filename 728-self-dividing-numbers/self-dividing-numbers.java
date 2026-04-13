class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            int temp = i;
            boolean self = true;

            while(temp > 0){
                int last = temp%10;
                if(last == 0 || i % last != 0){
                    self = false;
                    break;
                }
                temp /= 10;
            }
            if(self) list.add(i);
        }
        return list;
    }
}