import java.util.Scanner;

public class Main_1{
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
  int N = sc.nextInt();
  int [] arr = new int[N];
  for(int i=0;i<arr.length;i++){
    arr[i] = sc.nextInt();
  }
  for(int i=0;i<arr.length;i++){
    if(arr[i]%3==0){
    System.out.println(arr[i]);
    System.out.println(" ");
    }
  }
}
}