public class recursion {
    //https://www.w3schools.com/java/java_recursion.asp
    //Recursion is the technique of making a function call itself. This technique provides a way to break
    //complicated problems down into simple problems which are easier to solve.

    public static void main(String[] args) {
        //Use recursion to add all the numbers up to 10.
        int upTen = sum(10);
        System.out.println(upTen);
        //When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k and returns
        //the result. When k becomes 0, the function just returns 0. When running, the program follows these steps:

        //10 + sum(9)
        //10 + ( 9 + sum(8) )
        //10 + ( 9 + ( 8 + sum(7) ) )
        //...
        //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
        //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0


        //Infinite recursion is when the function never stops calling itself. Every recursive function
        //should have a halting condition, which is the condition where the function stops calling itself.
        //Use recursion to add all of the numbers between 5 to 10.
        int fiveTen = sum(5, 10);
        System.out.println(fiveTen);
    }

    public static int sum(int x){
        if (x > 0){
            return x + sum(x - 1);
        } else {
            return 0;
        }
    }
    public static int sum(int start, int end){
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
