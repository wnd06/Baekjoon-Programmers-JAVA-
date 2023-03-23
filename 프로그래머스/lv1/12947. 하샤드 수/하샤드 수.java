class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int arr = x;
        int length = (int)(Math.log10(x)+1);
        for(int i = 0; i < length; i++){
            int n = x % 10;
            sum += n;
            x /= 10;
        }
        if(arr % sum != 0)
            answer = false;
        return answer;
    }
}

// int sum = 0;
//         int num = x;
//         while (x > 0)
//         {
//             sum += x % 10;
//             x = x/10;
//         }
//         if(num % sum != 0)
//             answer = false;
//         return answer;