import java.util.Arrays;
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int count = 0;
        int min = 1000;
        if (A.length >= B.length)
            count = A.length;
        else
            count = B.length;
        int answer = 0;
        int j = count-1;
        for(int i = 0; i < count; i++){
            answer += A[i] * B[j];
            j--;
        }
        
    
        
        return answer;
//         int [] C = new int [count];
        
//         for(int i = 0; i < A.length; i++){
//             for(int j = 0; j < B.length; j++){
//                 C[j] = A[i] * B[j];
//             }
            
//             Arrays.sort(C);
//             answer += C[0];
//         }

        
    }
}