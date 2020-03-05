
/*1. Write a method
public int minRow(int[][] nums, int row)
that looks through each element of the chosen row and returns the smallest integer from that row.

2. Write a method
public int[] colMaxs(int[][] matrix)
that searches through each column of an array and returns an array with the largest integer from each column.

3. Write a method
public int[] allRowSums(int[][] data)
that calculates the row sum for every row and returns each of the values in an array. Index i of the return array contains the sum of elements in row i.
4. Write a method
public double[] averageCol(int[][] nums)

that calculates the average of each column in the array nums, and returns those values in an array of doubles.

5. Write a method
public int smallEven(int[][] matrix)

That finds and returns the smallest even number in the array matrix. Assume that the array is filled with only positive ints.

6. Write a method
public static int biggestRow(int[][] nums)
That returns the row index number that has the greatest sum of its elements.
*/
public class Array2DExplorer {


    public int minRow(int[][] nums, int row) {
        int smallest = 99999999;
        for (int j = 0; j < nums[row].length; j++) {
            if (smallest > nums[row][j]) {
                smallest = nums[row][j];
            }
        }
        return smallest;
    }

    public int[] colMaxs(int[][] matrix) {
        int[] colsMax = new int[matrix[0].length];
        for (int col = 0; col < matrix[0].length; col++) {
            int max = matrix[0][col];
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] >= max) {
                    max = matrix[row][col];
                }
            }
            colsMax[col] = max;
        }
        return colsMax;
    }

    public static int[] allRowSums(int[][] matrix) {
        int[] allRowSums = new int[matrix.length];
        for (int r = 0; r < allRowSums.length; r++) {
            int rowSum = 0;
            for (int c = 0; c < allRowSums.length; c++)
                rowSum += matrix[r][c];

            allRowSums[r] = rowSum;
        }
        return allRowSums;
    }




    public static double[] colAves(int[][] matrix) {
        int colSum = matrix[0][0];
        double[] colAves = new double[matrix[0].length];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                colSum += matrix[r][c];
                colAves[c] = colSum / (double) matrix.length;
            }
        }
        return colAves;
    }

    public double[] averageCol(int[][]nums) {
        int sum = 0;
        int ave = 0;
        for (int j = 0; j < nums.length; j++) {
            for (int a = 0; a < nums[j].length; a++) {
                sum += nums[j][a];
                ave = sum / a;
            }
        }
        return new double[0];
    }

    public int smallEven(int[][] matrixi){
        int smallest = matrixi[0][0];
        for (int j = 0; j <matrixi.length; j++) {
            for (int i = 0; i < matrixi[0].length; i++) {
                if ((matrixi[j][i] < smallest) && (matrixi[j][i] % 2 == 0))
                     smallest = matrixi[j][i];

            }
        }
        return smallest;
    }

    public static int biggestRow(int[][] nums) {
        int[] allRowSums = new int[nums.length];
        int max = allRowSums[0];
        for (int r = 0; r < allRowSums.length; r++) {
            int rowSum = 0;
            for (int c = 0; c < allRowSums.length; c++)
                rowSum += nums[r][c];
            allRowSums[r] = rowSum;
            if (allRowSums[r] < allRowSums[r + 1])
                allRowSums[r + 1] = rowSum;
            return allRowSums[r];
        }

        return max;
    }
}