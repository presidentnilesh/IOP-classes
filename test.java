// import java.util.Scanner ;
// public class test {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the princpal amount : ");
//         int principal = sc.nextInt();
//         System.out.println("enter the rate of intrest : ");
//         int rate = sc.nextInt();
//         System.out.println("enter the time : ");
//         int time = sc.nextInt();

//         float SI = (principal*rate*time)/100 ;
//         System.out.println("The principal is : "  + SI);

//     }
// }



import java.util.Scanner ;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int a = sc.nextInt();
        System.out.println("enter the second number : ");
        int b = sc.nextInt();

        System.out.println("the sum of both number is : "  + (a+b) );
        System.out.println("the sutract of both number is : "  + (a-b) );
        System.out.println("the multiple of both number is : "  + (a*b) );
        System.out.println("the divide of both number is : "  + (a/b) );
        System.out.println("the reminder of both number is : "  + (a%b) );

    }
}