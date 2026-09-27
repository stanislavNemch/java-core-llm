package m02.types;

public class CodeDetective {
    public static void main(String[] args) {
        int regularNumber = 10;
        int zeroInt = 0;
        double zeroDouble = 0.0;

        System.out.println("Результат 1: " + (zeroDouble / zeroDouble == zeroDouble / zeroDouble));
        System.out.println("Результат 2: " + (regularNumber / zeroDouble));
        System.out.println("Результат 3: " + (regularNumber / zeroInt));
    }
}
