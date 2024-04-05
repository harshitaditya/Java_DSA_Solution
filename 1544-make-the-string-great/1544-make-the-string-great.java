//using recursion
class Solution {
    public String makeGood(String s) {
         for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)+32==s.charAt(i+1)||s.charAt(i)==s.charAt(i+1)+32){
                return makeGood(s.substring(0,i)+s.substring(i+2));
            }
        }
        return s;
        
    }
}



//using stack
// class Solution {
//     public String makeGood(String s) {
//         Stack<Character> stack=new Stack();
//         for(char ch:s.toCharArray()){
//             if(!stack.isEmpty() && Math.abs(stack.peek() - ch)==32)
//                 stack.pop();
//             else
//                 stack.add(ch);
            
//         }
//         StringBuffer sb=new StringBuffer();
//         while(stack.size()>0){
//             sb.append(stack.pop());
//         }
//         return sb.reverse().toString();
        
        
//     }
// }