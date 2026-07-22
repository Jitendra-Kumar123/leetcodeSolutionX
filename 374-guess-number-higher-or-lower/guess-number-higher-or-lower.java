/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1, h=n;
        while(l<=h){
            int guessNo = l+(h-l)/2;
            int val = guess(guessNo);
            if(val == 0){
                return guessNo;
            }
            else if(val == -1){
                h = guessNo - 1;
            }
            else{
                l = guessNo + 1;
            }
        }
        return -1;
    }
}