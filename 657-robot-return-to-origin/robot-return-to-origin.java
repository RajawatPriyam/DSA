class Solution {
    public boolean judgeCircle(String moves) {
        int ver = 0; int hor = 0;
        for(int i = 0; i < moves.length(); i++){
            switch(moves.charAt(i)){
                case 'R' -> hor++;
                case 'L' -> hor--;
                case 'U' -> ver++;
                case 'D' -> ver--;
            }
        }
        return (hor == 0 && ver == 0);
    }
}