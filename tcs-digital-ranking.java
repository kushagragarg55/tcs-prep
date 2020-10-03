import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer> scores=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int l=sc.nextInt();
            if(!scores.contains(l)){
                scores.add(l);
            }
        }
        Collections.reverse(scores);
        int m=sc.nextInt();
        int cha[]=new int[m];
        for(int i=0;i<m;i++){
            cha[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            int leader=0;
            int score=cha[i];
            for(int j=0;j<scores.size();j++){
                System.out.println(scores.get(j));
                if(scores.get(j)<score){
                    leader++;
                }else if(scores.get(j)==score){
                    continue;
                }else if(scores.get(j)>score){
                    leader++;
                    break;
                }
            }
            System.out.println(leader);
        }
    }
}