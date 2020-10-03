import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int count0=0;
        int count1=0;
        int start=1;
        int end=n;
        while(start!=p){
            start+=1;
            count0+=1;
        }
        while(end!=p){
            end-=1;
            count1+=1;
        }
        System.out.println(Math.min(count1,count0));
    }
}