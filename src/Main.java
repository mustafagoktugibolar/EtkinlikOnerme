import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int weather;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Degree :");

     weather = sc.nextInt();

        if  (weather < 5) {
            System.out.println("You can ski ");

        } else if  (weather <= 25) {
            if(weather <= 15) {
                System.out.println("sinemaya gidebilirsin");

            }
            if(weather >=10 ){
                System.out.println("pikniğe gidebilirsin");
            }

        }else {
            System.out.println("yüzmeye gidebilirsin");
    }
    }
}
