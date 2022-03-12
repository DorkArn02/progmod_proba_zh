import java.util.ArrayList;

public class Matrix {

    /**
     * Counts the null columns in the matrix
     * @param matrix two-dimensional array
     * @return an arraylist with the position of elements
     */
    public static ArrayList<Integer> indexesOfNullColumns(int[][] matrix) {
        ArrayList<Integer> a = new ArrayList<>();

        for(int cols = 0; cols < matrix[0].length; cols++){
            boolean isNull = true;
            int index = 0;
            for(int rows = 0; rows < matrix.length; rows++){
                if(matrix[rows][cols] != 0) isNull = false;
                index = cols;
            }
            if(isNull) a.add(cols);
        }

        return a;
    }

    public static int[] indexOfMaximum(int[][] matrix) {

        ArrayList<Integer> helper = new ArrayList<>();

        int max = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                   helper.add(j);
                }
            }
        }

        int[] ret = new int[helper.size()];

        for (int i = 0; i < helper.size(); i++) {
            ret[i] = helper.get(i);
        }

        return ret;
    }
}
