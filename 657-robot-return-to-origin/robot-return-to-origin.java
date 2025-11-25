class Solution {
    public boolean judgeCircle(String moves) {
        int ver = 0; int hor = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U') ver++;
            else if(moves.charAt(i) == 'D') ver--;

            if(moves.charAt(i) == 'L') hor++;
            else if(moves.charAt(i) == 'R') hor--;
        }
        return (hor == 0 && ver == 0);
    }
}