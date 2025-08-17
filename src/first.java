package src;
import java.util.Scanner;

public class first{
    public static int secondLarge(int[] numb){
        if(numb[0]>numb[1]){
            int firstlarge = numb[0];
            int secondlarge = numb[1];
        }else{
            int firstlarge = numb[1];
            int secondlarge = numb[0];
        }
        for(int i: numb){
            if(firstlarge<i){
                secondlarge = firstlarge;
                firstlarge = i;
            }
        }
        return secondlarge;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int asize = sc.nextInt();
        int[] ar = new int[asize];
        for(int i=0;i<asize;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println(secondLarge(ar));
        sc.close();
    }
}