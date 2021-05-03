package condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = (first > second && first > third) ? first : ((second > third ? second : third));
        
        return result;
    }
}