package Jar;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> jar = new Jar<Integer>();
        jar.add(123);
        jar.add(32);
        jar.add(879);
        System.out.println(jar.remove());

    }
}
