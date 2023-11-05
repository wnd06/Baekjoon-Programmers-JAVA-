import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
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
            int[][] arr = new int[9][9];
            int[][] arr2 = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
//                    Arrays.sort(arr[i]);
//                    Arrays.sort(arr2[i]);
                    arr[i][j] = arr2[j][i] = sc.nextInt();
                }
            }

            int matrix = matrixSudoku(arr);
            if(matrix != 0) {
                for (int i = 0; i < 9; i++) {
                    Arrays.sort(arr[i]);
                    Arrays.sort(arr2[i]);
                }

                int result = sudoku(arr);
                int result2 = sudoku(arr2);
                if(result == 0 || result2 == 0)
                    System.out.println("#" + test_case + " " + 0);
                else
                    System.out.println("#" + test_case + " " + 1);
            }
            else {
                System.out.println("#" + test_case + " " + 0);
            }

//            for (int i = 0; i < 9; i++) {
//                for (int j = 0; j < 9; j++) {
//                    System.out.print(arr2[i][j] + " ");
//                }
//                System.out.println();
//            }


        }
    }

    static int sudoku(int[][] arr) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(arr[0][i] != arr[j][i])
                    return 0;
            }
        }
        return 1;
    }

    static int matrixSudoku(int[][] arr) {

        for (int i = 0; i <= 6; i+=3) {
            for (int j = 0; j <= 6; j+=3) {
                int sum = 0;
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        sum += arr[k][l];
                    }
                }
                if(sum != 45) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
