import java.util.Scanner;
public class main {

    public static void main(String[] args){
        int n1, n2, ebob = 1, i = 1, i2 = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz :");
        n1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz :");
        n2 = input.nextInt();

        while (i <= n1 && i <= n2){
            i++;
            if(n1%i == 0 & n2%i ==0{
                ebob = i;                
            }
           
        }System.out.print(n1 + " ve " + n2 + " sayılarının ebob değeri : " + ebob );

        while (i2 <= n1*n2) {
            i2++;
            if(i2%n1 == 0 & i2%n2 == 0) {
                System.out.print("\n" + n1 + " ve " + n2 + " sayılarının ekok değeri : " + i2);
                break;
            }
        }
     }
}
