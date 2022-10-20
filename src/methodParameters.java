public class methodParameters {
    //https://www.w3schools.com/java/java_methods_param.asp

    public static void main(String[] args) {
        //method that takes a String called name as parameter. When the method is called, we pass along a first name
        //which is used inside the method to print the full name:

        //You can have as many parameters as you like:
        printName("billy", 21);
        printName("bob", 25);
        printName("joe", 27);
        //void keyword, used in the examples above, indicates that the method should not return a value.

        System.out.println("this should print 8: "+ oneMethod(3));

        //example returns the sum of a method's two parameters:
        System.out.println("this is x plus y: "+ twoMethod(5, 3));

        //store the result in a variable (recommended, as it is easier to read and maintain):
        int z = twoMethod(5, 3);
        System.out.println(z);

        //common to use if...else statements inside methods:
        int age = 22;
        checkAge(age);
    }
    static void printName(String name, int age){
        System.out.println("the name is: "+ name +" and the age is: "+ age);
    }

    //If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
    //instead of void, and use the return keyword inside the method:
    static int oneMethod(int x){
        return 5 + x;
    }
    static int twoMethod(int x, int y){
        return x + y;
    }
    static void checkAge(int age){
        if (age < 18) {
            System.out.println("not old enough");
        }else {
            System.out.println("are old enough");
        }
    }
}
