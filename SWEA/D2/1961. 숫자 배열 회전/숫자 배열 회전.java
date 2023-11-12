import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    static int[][] matrix;
    public static void main(String args[]) throws Exception
    {
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
        //System.setIn(new FileInputStream("res/input.txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            matrix = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int[][] arr = new int[N][N];
            int[][] arr2 = new int[N][N];
            int[][] arr3 = new int[N][N];
            String[][] result = new String[N][N];
            changeMatrix(arr, matrix);
            value(arr, result, 0);
            changeMatrix(arr2, arr);
            value(arr2, result, 1);
            changeMatrix(arr3, arr2);
            value(arr3, result, 2);

            System.out.println("#" + test_case);
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void changeMatrix(int[][] arr, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int index = 0;
            for (int j = matrix.length - 1; j >= 0; j--) {
                arr[i][index] = matrix[j][i];
                index++;
            }
        }
    }

    public static void value(int[][] arr, String[][] result, int index) {
        for (int i = 0; i < arr.length; i++) {
            String str = "";
            for (int j = 0; j < arr.length; j++) {
                str += String.valueOf(arr[i][j]);
            }
            result[i][index] = str;
        }
    }

}
