package m02.types;

public class PrimitiveOverflowLab {
   public static void main(String[] args) {

        byte counter = 127;
        System.out.println("Лічильник: " + counter);
        // Збільшуємо значення на 1, що призведе до переповнення
        counter += 1;
        // Це призведе до переповнення, і значення циклічно зміниться на -128.
        System.out.println("Лічильник: " + counter);

        // Приклад переповнення при обчисленні мілісекунд у 30 днях
        long badMillis = 30 * 24 * 60 * 60 * 1000;
        System.out.println("Погані мілісекунди: " + badMillis);

        // Щоб уникнути переповнення, потрібно використовувати long для обчислення
        long goodMillis = 30L * 24 * 60 * 60 * 1000;
        System.out.println("Хороші мілісекунди: " + goodMillis);

        double brokenValue = 0.0 / 0.0;
        // Перевірка, чи є значення NaN (Not a Number)
        System.out.println("Зламане значення: " + Double.isNaN(brokenValue)); // true
    }
}
