import java.io.*;
import java.util.*;
class G5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        //int len=a.length;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       Arrays.sort(a);
       int d=(a[n-1]);
       System.out.println(d);
    }
}

