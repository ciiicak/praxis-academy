import java.util.Scanner;

class MyClass{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter usesrname");

        String userName = myObj.nextLine();
        System.out.println("username is: "+ userName);
    }
}