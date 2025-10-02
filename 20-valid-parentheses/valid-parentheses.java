// class Solution {
//     public boolean isValid(String s) {
//         int n = s.length();
//         int arr[]=new int[6];
//         for(int i=0;i<n;i++){
//            switch(s.charAt(i)){
//             case '(' -> arr[0]+=1;
//             case ')' -> arr[1]+=1;
//             case '[' -> arr[2]+=1;
//             case ']' -> arr[3]+=1;
//             case '{' -> arr[4]+=1;
//             case '}' -> arr[5]+=1;}
//        }
//   return arr[0]==arr[1]&& arr[2]==arr[3]&& arr[4]==arr[5]; }
// }
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           switch(ch){
            case '(','{','[' -> st.push(s.charAt(i));
            case ')' -> {if(!st.isEmpty() &&st.peek()=='(') st.pop(); else{return false;}}
            case '}' -> {if(!st.isEmpty() &&st.peek()=='{') st.pop(); else{return false;}}
            case ']' -> {if(!st.isEmpty() &&st.peek()=='[') {st.pop();} else{return false;}}
           }
        }
    return st.isEmpty();}
}