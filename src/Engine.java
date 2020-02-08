import java.util.Scanner;

public class Engine implements Runnable {
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.nextLine());
        Logo logo = new Logo(N);
        logo.draw();
        System.out.println(logo.toString());
        scanner.close();
    }
}
