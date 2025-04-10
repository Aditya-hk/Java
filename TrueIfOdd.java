
import java.util.*;
public class TrueIfOdd {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int v1=sc.nextInt();
boolean ans= prime(v1);
        System.out.println(ans);
    }

    static boolean prime(int var)

    {


        if(var %2==0) {
            return false;
        }
           return true;
    }
}

