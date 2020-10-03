/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int sumd=0;
		int sume=0;
		for(int i=0;i<n;i++){
		    sumd+=arr[i][i];
		}
		for(int j=0;j<n;j++){
		    sume+=arr[j][2-j];
		}
		System.out.println(Math.abs(sumd-sume));
		
	}
}
