
import java.util.Scanner;
public class Armstrong {
public static void main(String[] args) {
    
System.out.println("enter the no");
Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
System.out.println(check(num));
}



    static boolean check(int n){
    int sum=0;
    int orig=n;
    while(n>0)
    {
        int rem=n%10;
        n/=10;
        sum= sum+ rem*rem*rem;


    }

    if(sum==orig){
    System.out.println("yes");
    return true;
    }else{
    System.out.println("no");
return false;
    }
}
}
