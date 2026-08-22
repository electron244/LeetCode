class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n = password.length();
        if(n<8) return false;
        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        boolean special = false;
        String str = "!@#$%^&*()-+";
        for(int i = 0;i<n;i++){
            char ch = password.charAt(i);
            if(i > 0 && password.charAt(i) == password.charAt(i-1)){
                return false;
            }
            if(Character.isLowerCase(ch)){
                lower = true;
            }else if(Character.isUpperCase(ch)){
                upper = true;
            }else if(Character.isDigit(ch)){
                digit = true;
            }else if(str.indexOf(ch)!=-1){
                special = true;
            }
        }
        return lower&&upper&&digit&&special;
    }
}