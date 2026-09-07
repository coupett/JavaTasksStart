public class gaz {
    static void main() {
        String[] names = {"Алекс", "Борис", "Вика", "Дима"};
        int[] ages = {20, 21, 19, 22};
        double[] averages = {4.8, 3.9, 4.2, 3.5};
        int[][] grades = {
                {5, 5, 4, 5, 5},
                {4, 3, 4, 4, 3},
                {5, 4, 4, 5, 3},
                {3, 3, 2, 4, 3}
        };
        int selected = 1;
        char stasusSymbol;
        boolean hasTwo = false;
        double sum = 0;
        if (selected < 0 || selected >= names.length) {
            System.out.println("Некорректный номер студента");
            return;
        }
        int max = grades[selected][0];
        int min = grades[selected][0];
        for (int num : grades[selected]) {
            sum = sum + num;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }
        for (int num : grades[selected]) {
            if (num == 2) {
                hasTwo = true;
                break;
            }
        }
        if (averages[selected] >= 4.5){
            stasusSymbol = 'A';
        } else if (averages[selected] >= 4.0){
            stasusSymbol = 'B';
        } else if (averages[selected] >= 3.5) {
            stasusSymbol = 'C';
        } else {
            stasusSymbol = 'D';
        }

        System.out.println("Студент: " + names[selected]);
        System.out.println("Возраст: " + ages[selected]);
        System.out.println("Средний балл: " + averages[selected]);
        switch (stasusSymbol) {
            case 'A':
                System.out.println("Статус: Отличник");
                break;
            case 'B':
                System.out.println("Статус: Хорошист");
                break;
            case 'C':
                System.out.println("Статус: Удовлетворительно");
                break;
            case 'D':
                System.out.println("Статус: Неудовлетворительно");
                break;
        }
        System.out.println("Сумма оценок: " + sum);
        System.out.println("Среднее оценок: " + averages[selected]);
        System.out.println("Максимальная оценка: " + max);
        System.out.println("Минимальная оценка: " + min);
        System.out.println("Есть хотя бы одна двойка: " + hasTwo);
    }
}
