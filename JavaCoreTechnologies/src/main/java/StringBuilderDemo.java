import java.util.Scanner;

/**
 *
 * @author whxiang
 * @date 2017/12/4
 */
public class StringBuilderDemo {

    public void print() {
        Scanner scanner = new Scanner(System.in);

        String next = scanner.nextLine();


        StringBuilder stringBuilder = new StringBuilder(next);

        System.out.println(stringBuilder.toString());
    }
}
