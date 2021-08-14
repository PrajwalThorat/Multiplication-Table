import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ans;
        do{
            System.out.print("Enter the Number : ");
            int number = sc.nextInt();
            for(int i=1 ; i<=10 ; i++){
                System.out.println(" "+number+" * "+i+" = "+number*i);
            }
            System.out.print("Do You Want Again (y/n) : ");
            ans = sc.next().charAt(0);
        }while(ans =='y' || ans == 'Y');
        System.out.println("thank you !!");
    }
    
}
