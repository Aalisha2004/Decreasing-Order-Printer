import java.util.*;

public class Recs{
    public static void PrintDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        PrintDec(n-1);
    }

public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number to print in decreasing order:");
    int n=sc.nextInt();
    PrintDec(n);
}
}