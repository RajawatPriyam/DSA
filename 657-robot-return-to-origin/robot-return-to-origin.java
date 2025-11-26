class Solution {
    public boolean judgeCircle(String moves) {
        int ver = 0; int hor = 0;
        for(int move : moves.toCharArray()){
            switch(move){
                case 'R' -> hor++;
                case 'L' -> hor--;
                case 'U' -> ver++;
                case 'D' -> ver--;
            }
        }
        return (hor == 0 && ver == 0);
    }
}