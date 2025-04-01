import java.util.ArrayList;
import java.util.List;

public class PrintSpiralMatrix {
     public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int total = row * col;
        int count = 0;

        // Initializing the indexes
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row - 1;
        int endingCol = col - 1;

        while (count < total) {
            // starting row
            for (int index = startingCol; index <= endingCol && count < total; index++) {
                ans.add(matrix[startingRow][index]);
                count++;
            }
            startingRow++;

            // ending col
            for (int index = startingRow; index <= endingRow && count < total; index++) {
                ans.add(matrix[index][endingCol]);
                count++;
            }
            endingCol--;

            // ending row
            for (int index = endingCol; index >= startingCol && count < total; index--) {
                ans.add(matrix[endingRow][index]);
                count++;
            }
            endingRow--;

            // starting col
            for (int index = endingRow; index >= startingRow && count < total; index--) {
                ans.add(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}
