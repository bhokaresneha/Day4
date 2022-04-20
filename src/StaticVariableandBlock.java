/* Problem Statement=>
2. Write a Program to demonstrate the use of the static variable, blocks.

 * */

public class StaticVariableandBlock {

    static int a=100,b=20;//Static Variable

    public StaticVariableandBlock(){
        int sum=a+b;
        System.out.println("Sum is " + sum );
        }
    //Static Block
    static{
        System.out.println("Inside the Static Block");
    }

    public static void main(String[] args) {
        StaticVariableandBlock d2s= new StaticVariableandBlock();

    }

}
