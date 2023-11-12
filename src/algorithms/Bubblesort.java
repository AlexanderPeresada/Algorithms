package algorithms;

public class Bubblesort {
    public static void main(String[] args) {
        int countDay = 7;
        String currency = "USD";
        double[] price = {2.00, 5.00, 8.32, 9.59, 7.00, 16.00, 3.75};

        // Перший цикл пройде через всі елементи массиву
        for (int num = 0; num < price.length; num++) {
            //Другий цикл також проходить через елементи, але зменьшує діпазаон на одиницю з кожною ітерацією
            for (int sort = 0; sort < (price.length - num - 1); sort++) {
                // Порівняння два сусідні елементи
                if (price[sort] > price[sort + 1]) {
                    double temp = price[sort]; // Обмін елементами якщо потрпібно
                    price[sort] = price[sort + 1];// Заміна першого елементу на другий
                    price[sort + 1] = temp; // Зміна другого елементу на збережене значення першого
                }
            }
        }
        // Виведення відсортованого масиву
        System.out.println("Відсортований діапазон ціни по зростанню: ");
        for (double value : price) {
            System.out.print(value + " ");
        }
        // Розрахунок суми усіх елементів масиву
        double sumResult = 0;
        for (int num = 0; num < price.length; num++) {
            sumResult += price[num];
        }
        // Розрахунок середньої ціни за весь період продажів
        double avgResult = sumResult / countDay;
        System.out.println("\nСередня ціна за " + countDay + " днів складає: " + avgResult + " " + currency);

    }

}

