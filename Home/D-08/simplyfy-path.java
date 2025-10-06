// 71. Simplify Path

class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> st = new Stack<>();

        for(String s : str) {
            if(s.equals("..")) {
                if(!st.isEmpty()) {
                    st.pop();
                }
            }else if(!s.equals(".") && !s.equals("")) {
                st.push(s);
            }
        }

        StringBuilder ans = new StringBuilder("");
        while(!st.isEmpty()) {
            ans.insert(0, st.pop());
            ans.insert(0, "/");
        }

        if(ans.length() == 0) {
            ans.insert(0, "/");
        }

        return ans.toString();
    }
}