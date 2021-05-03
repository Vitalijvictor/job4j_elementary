package condition;

public class ChessBoard {
    public static int way1(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (x1 == x2 || y1 == y2) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }
    
    private static boolean inRange(int z) {
    	return (z < 0 || z > 7); 
    } 
    
    public static int way(int x1, int y1, int x2, int y2) {

    	if (inRange(x1) || inRange(y1) || inRange(x2) || inRange(y2)) 
    		return 0;
    	int diffX = Math.abs(x1 - x2);
    	int diffY = Math.abs(y1 - y2);
    
    	if (diffX == diffY) {
    		return diffX;
    	}
    	return 0;
    }
    
    
}
