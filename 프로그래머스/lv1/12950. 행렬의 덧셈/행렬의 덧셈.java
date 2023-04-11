class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int col = 0;
        int row = 0;
        for (int i = 0; i < arr1.length; i++)
            col++;
        for (int j = 0; j < arr1[0].length; j++)
            row++;
        
        int[][] answer = new int [col][row];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}