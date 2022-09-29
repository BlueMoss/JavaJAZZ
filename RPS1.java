import java.util.Scanner;

public class RPS1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("철수: ");
        String a = in.next();
        System.out.print("영희: ");
        String b = in.next();

        if (a.equals(b))
            System.out.println("무승부");
        else if (a.equals("r")) {
            if (b.equals("p"))
                System.out.println("영희, 승");
            else
                System.out.println("철수, 승");
        } else if (a.equals("p")) {
            if (b.equals("s"))
                System.out.println("영희, 승");
            else
                System.out.println("철수, 승");
        } else {
            if (b.equals("r"))
                System.out.println("영희, 승");
            else
                System.out.println("철수, 승");
        }
    }
}