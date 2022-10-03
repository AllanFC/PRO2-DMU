package Ex03;


import java.util.Arrays;

public class EmailEvaluator implements Evaluator {
    /** Returns true, if s contains a valid email address. */
    @Override
    public boolean isValid(String s) {
        String[] strings = s.split("^(.+)\\.(.+)@$");
        System.out.println(Arrays.toString(strings));
        return false;
    }

    /**
     * Returns true, if s is an acceptable word.
     * That is, s is not empty, and all letters
     * are in 'A'..'Z', 'a'..'z' or '0'..'9'.
     */
    public boolean isWord(String s) {
        if(!s.isEmpty()){
            char[] word = s.toCharArray();
            boolean validChars;
            for (char c : word) {
                validChars = ((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z')) || ((c >= '0') && (c <= '9'));
                if(!validChars){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
