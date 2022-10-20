public class methodOverloading {
    //https://www.w3schools.com/java/java_methods_overloading.asp
    //method overloading, multiple methods can have the same name with different parameters:

    public static void main(String[] args) {
        //overload the plusMethod method to work for both int and double:
        int myInt = plusMethod(5, 3);
        double myDouble = plusMethod(5.0, 3.0);
        System.out.println("The int is: "+ myInt +" and the double is: "+ myDouble);

    }
    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }
}
