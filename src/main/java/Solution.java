public class Solution {

    /**
     * return the sum of a and b.
     */
    public int add(int a, int b) {
        //replace 0  with your implementation
        
        int add = a+b;
        return add;
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * return the difference of a and b.
     */
    public int subtract(int a, int b) {
        // replace 0  with your implementation
        int minus=a-b;
        
        return minus;
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * return the product of a and b.
     */
    public int multiply (int a, int b){
        int multiply=a * b;
        return multiply;
    }

    /**
     * return the quotient of a and b.
     */

    public double divide (int a, int b){
        // replace 0.0  with your implementation
        double divide=(double)a/b;
        return divide;
    }

    /**
     * return the string concatenation of word1 and word2 
     */
    public String concatenate (String word1, String word2){
        // replace ""  with your implementation
        String concatenate=word1 + word2;
        return concatenate;
    }


    /**
     * Start with a variable x equal to a. Then, IN THIS ORDER:
     *   1. add 4 to x
     *   2. multiply x by 3
     *   3. subtract the ORIGINAL a value from x
     * Return x.
 */
    public int transform(int a) {
        int x = a;      
        x = x + 4;     
        x = x * 3;      
        x = x - a;       
        return x;
    }

    public static void main(String[] args) {
        //this main method is for manually debugging
        Solution solution = new Solution();
        System.out.println( solution.add(1, 2)); 
        System.out.println( solution.subtract(5, 3));
        System.out.println( solution.multiply(4, 6));
        System.out.println( solution.divide(10, 2));
        System.out.println( solution.concatenate("Hello", "World"));
        System.out.println( solution.transform(5));


    }
}
