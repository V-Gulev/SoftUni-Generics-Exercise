package GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Box<Double> box = new Box<>();
        for (int i = 1; i <= n ; i++) {
            double number = Double.parseDouble(sc.nextLine());;
            box.add(number);
        }
        double elementToCompare = Double.parseDouble(sc.nextLine());;
        System.out.println(box.countGreaterElements(elementToCompare));
    }
}
