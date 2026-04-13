class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            String s = Integer.toString(i);
            boolean self = true;
            for(int j = 0; j < s.length(); j++){
                if((s.charAt(j)- '0') == 0 ){
                    self = false;
                    break;
                }
                else if((i % (s.charAt(j) - '0') != 0)){
                    self = false;
                    break;
                }
                else{
                    continue;
                }
            }
            if(self) list.add(i);
        }
        return list;
    }
}