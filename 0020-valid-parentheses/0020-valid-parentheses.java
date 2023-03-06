class Solution {
    public boolean isValid(String s) {
        // Create a new stack to store the characters.
        Stack <Character> openBracketStack = new Stack<>();
        
        for(char ch: s.toCharArray()){
        //   if(ch == '(' || ch == '{' || ch == '['){
        //     openBracketStack.push(ch);
        //   } 
          switch(ch){
            case '(':
            case '{':
            case '[':
                openBracketStack.push(ch);
                break;
            case ')':
                if(openBracketStack.isEmpty() || openBracketStack.pop()!= '(') {
                    return false; 
                } 
                break; 
            case '}':
                if(openBracketStack.isEmpty() || openBracketStack.pop()!= '{') {
                    return false; 
                } 
                break;  
             case ']':
                if(openBracketStack.isEmpty() || openBracketStack.pop() != '['){
                       return false; 
                }
                break; 
          }
        }
        return openBracketStack.isEmpty(); 
    }
    
}