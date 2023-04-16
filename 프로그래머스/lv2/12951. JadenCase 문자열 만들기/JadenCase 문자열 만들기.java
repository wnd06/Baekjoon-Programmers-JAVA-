class Solution {
    public String solution(String s) {
        String answer = "";
        String c = s.toLowerCase();
        char[] chs = c.toCharArray();
        
        for(int i = 0; i < chs.length; i++){
            if(i == 0) {
                answer += Character.toUpperCase(chs[0]);
                
            }
                
            else if(chs[i-1] == ' '){
                chs[i] = Character.toUpperCase(chs[i]);
                answer += chs[i];
            }
            
            else
                answer += chs[i];
        }
            
        
    return answer;
    }
}       
        
        
        
        
        
        
        
        
        
//         String c = s.toLowerCase();
//         String [] arr = c.split(" ");
        
//         for(int i = 0; i<arr.length; i++){
//             String a = arr[i].substring(0, 1);
//             String b = arr[i].substring(1);
//             if(arr[i].charAt(0) >= '0' && arr[i].charAt(0) <= '9')
//                 arr[i] = a + b;
//             else {
//                 arr[i] = a.toUpperCase() + b;
//             }
            
            
//         }
//         for(int i = 0; i < arr.length; i++){
//             answer += arr[i];
//             if(i != arr.length - 1)
//                 answer+=" ";
//         }
        
        