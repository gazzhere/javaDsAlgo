import java.util.Scanner;

class firstclass{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String arg[]){
       Scanner sc=new Scanner(System.in);
       String name=sc.nextLine();
       System.out.println(name);
    }
}