import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        // String[] answer = {};
        char[] c = new char[strings.length];
        Arrays.sort(strings);
        for(int i = 0; i < strings.length; i++) {
            c[i] = strings[i].charAt(n);
        }
        String temp;
        char temp2;
        for(int i = 0; i < strings.length-1; i++) {
            for(int j = 0; j < strings.length-1; j++) {
                if(Character.compare(c[j], c[j+1]) > 0) {
                    temp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = temp;
                    temp2 = c[j];
                    c[j] = c[j+1];
                    c[j+1] = temp2;
                }
            }
            
        }
        return strings;
    }
}