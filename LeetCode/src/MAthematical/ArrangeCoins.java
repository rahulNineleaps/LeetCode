package MAthematical;

public class ArrangeCoins {
    public int arrangeCoins(int n) {
        
        
        int total=n;
        for (int i=1;i<=n;i++){
            total-=i;
            if (total<=i) return i;
        }
        return n;
    }
}
/* lets arrange 9 coins 
 * $
 * $$
 * $$$
 * $$$ --> so only three stairs were complete hence answer would be 3 
 *  */
