package CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        CustomList<String> customList = new CustomList<String>();
        while (!command.equals("END")){
            String[] tokens = command.split("\\s+");
            switch (tokens[0]){
                case "Add" -> customList.add(tokens[1]);
                case "Remove" -> customList.remove(Integer.parseInt(tokens[1]));
                case "Contains" -> System.out.println(customList.contains(tokens[1]));
                case "Swap" -> customList.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                case "Greater" -> System.out.println(customList.countGreaterThan(tokens[1]));
                case "Max" -> System.out.println(customList.getMax());
                case "Min" -> System.out.println(customList.getMin());
                case "Print" -> {
                    for (int i = 0; i < customList.size; i++) {
                        System.out.println(customList.get(i));
                    }
                }
                case "Sort" -> customList.sort();
            }
            command = scanner.nextLine();
        }

    }
}
