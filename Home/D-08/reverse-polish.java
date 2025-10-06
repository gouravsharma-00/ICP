// 150. Evaluate Reverse Polish Notation

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        if(tokens.length == 0) {
            return 0;
        }
        for(int i = 0; i < tokens.length; i++) {
            String c = tokens[i];
            if(
                !stack.isEmpty() && stack.size() >= 2 && 
                c.equals("+") || c.equals("*") || c.equals("-") || c.equals("/") ){
                    int a = stack.pop();
                    int b = stack.pop();
                    switch (c) {
                        case "+" : 
                            stack.push(b + a);
                            break;
                        case "-" :
                            stack.push(b - a);
                            break;
                        case "*" : 
                            stack.push(b * a);
                            break;
                        case "/" :
                            stack.push(b / a);
                            break;
                    }
                }
            else {
                int ele = Integer.parseInt(c);
                stack.push(ele);
            }
        }
        return stack.pop();
    }
}