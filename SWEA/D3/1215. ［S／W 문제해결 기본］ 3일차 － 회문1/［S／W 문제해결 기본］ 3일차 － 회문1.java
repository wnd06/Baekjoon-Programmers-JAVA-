import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    static int count;

    public static void main(String args[]) throws Exception
    {
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
       // System.setIn(new FileInputStream("/Users/wnd0605/Desktop/Ssafy/oddAdd/src/input/input (10).txt"));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
        Scanner sc = new Scanner(System.in);
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            count = 0;
            int N = sc.nextInt();
            String[][] arr = new String[8][8];
            String[][] arr2 = new String[8][8];

            //배열 만들기
            for (int i = 0; i < 8; i++) {
                String[] arrStr = sc.next().split("");
                for (int j = 0; j < 8; j++) {
                    arr[i][j] = arrStr[j];
                    arr2[j][i] = arrStr[j];

                }
            }

            int result = 0;
            for (int index = 0; index < 8; index++) {
                {
                    for (int i = 0; i <= 8 - N; i++) {
                        result += rowPalindrome(i, i + N - 1, index, arr);
                        result += rowPalindrome(i, i + N - 1, index, arr2);
//                        result += columnPalindrome(i, i + N - 1, index, arr);

                    }
                }
            }

            System.out.println("#" + test_case + " " + result);
        }
    }

    static int rowPalindrome(int i, int j, int index, String[][] arr) {


        if (i >= j) return 1;

        if (arr[index][i].equals(arr[index][j])) return rowPalindrome(i + 1, j - 1, index, arr);

        else return 0;
    }

    static int columnPalindrome(int i, int j, int index, String[][] arr) {


        if (i >= j) return 1;

        if (arr[i][index].equals(arr[j][index])) {
            return columnPalindrome(i + 1, j - 1, index, arr);
        }

        if (arr[index][i].equals(arr[index][j])) {
            return columnPalindrome(i + 1, j - 1, index, arr);
        }

        else return 0;
    }

}