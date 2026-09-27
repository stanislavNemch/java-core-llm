package m02.types;

public class PrimitiveAnatomy {
    static void main(String[] args) {
        // 1. Демонстрація переповнення цілих чисел (ефект одометра)
        int maxInt = 2147483647;
        int overflowedInt = maxInt + 1;
        System.out.println("Максимальний int: " + maxInt);
        System.out.println("Результат maxInt + 1: " + overflowedInt);

        // 2. Фінансова пастка з числами із плаваючою крапкою
        // ❌ АНТИПАТЕРН: використання double для грошей
        double priceA = 0.1;
        double priceB = 0.2;
        double sumDouble = priceA + priceB;
        System.out.println("Сума double (0.1 + 0.2): " + sumDouble);

        // ✅ ЯК ТРЕБА: розрахунки у мінімальних неподільних одиницях (копійки/центи)
        long priceCentsA = 10L; // 10 копійок
        long priceCentsB = 20L; // 20 копійок
        long totalCents = priceCentsA + priceCentsB;
        System.out.println("Точна сума в копійках: " + totalCents);

        // 3. Спеціальні стани IEEE 754
        double positiveZero = 0.0;
        System.out.println("Ділення 5.0 на нуль: " + (5.0 / positiveZero));
        System.out.println("Невизначеність 0.0 на 0.0: " + (positiveZero / positiveZero));
    }
}
