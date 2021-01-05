import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        try {
            Scanner scanner= new Scanner(System.in);
            System.out.println("Enter edge A");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter adge B");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter adge C");
            int c = Integer.parseInt(scanner.nextLine());

            if (a<=0|| b<=0||c<=0){
                throw new IllegalTriangleException("Adge cannot be negative ");
            }
            if (a+b<c||a+c<b||b+c<a){
                throw new IllegalTriangleException("Invalid edge");
            }
        }catch (IllegalTriangleException e){
            System.out.println(e.message);
        }

    }
}
