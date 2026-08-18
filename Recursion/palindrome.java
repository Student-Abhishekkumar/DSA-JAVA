package Recursion;

class palindrome_check{
    public boolean check(String s){
        int start = 0 , end = s.length() -1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (Character.isLowerCase(s.charAt(start)) != Character.isLowerCase(s.charAt(end)))
                return false;
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}

public class palindrome {
    public static void main(String[] args) {
        palindrome_check p = new palindrome_check();
        
        String s = "naman";
        boolean b = p.check(s);

        if (b) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Plindrome");
        }

    }
}
