class Solution {
    public double angleClock(int hour, int minutes) {
        double hr = (hour*30) + (0.5*minutes);
        double min = 6*minutes;

        double ans = Math.abs(hr -min);

        if(ans > 180) return 360 - ans;
        return ans;
    }
}