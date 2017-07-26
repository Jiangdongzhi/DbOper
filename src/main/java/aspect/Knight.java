package aspect;

/**
 * Created by dorianns on 15/5/24.
 */
public class Knight implements Chess {
    public void draw(int row, int col) {
        System.out.println("Draw Knight at " + row + ":" + col);
    }
}
