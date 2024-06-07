import java.util.Scanner;
//Sum of the prime factors of number
//Sample Input: 60
//prime factors are 2,3,5;
//Sample Output:10
public class Day4Example {
    public static void main(String[] args) {
        int sum=0;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Prime factors of the given number "+n+" is: ");
        for(int i=2;i<n;i++){
            int count=0;
            if(n%i==0){
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==0){
                    System.out.print(+i+" ");
                    sum+=i;
                }
            }
        }
        System.out.println();
        System.out.println("The sum the Prime Factors of "+n+" are: "+sum);
    }
}
