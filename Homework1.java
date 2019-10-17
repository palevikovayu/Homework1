public class Homework1 {
    public static void main(String[] args) {
        System.out.println(intToString(1));
        System.out.println(StringToint("2"));
        even(3);
        endsto7(4);
        symbolInString("Exercise 5", "r");
        recountTime(6);
        timeConversion(21548621);
        caseChange("exercise");
        circumference(9);
        parameterСomparison(3, 5, 7);
    }

    public static String intToString(int a) {         //Задача 1
        String a1 = "" + a;
        System.out.println(a1);
        String a2 = Integer.toString(a);
        return a2;

    }

    public static int StringToint(String b) {           //Задача 2
        int exercise2 = Integer.parseInt(b);
        int b1 = new Integer(b);
        System.out.println(exercise2);
        return b1;
    }

    public static void even(int c) {                  //Задача 3
        if ((c % 2) == 0)
            System.out.println("Число " + c + " четное ");
        else
            System.out.println("Число " + c + " нечетное ");
    }

    public static void endsto7(int d) {                //Задача 4
        int d1 = d % 10;
        if (d1 == 7)
            System.out.println("Число заканчивается цифрой 7");
        else
            System.out.println("Число не заканчивается цифрой 7");
    }

    public static void symbolInString(String e1, String e2) {       //Задача 5
        if (e1.contains(e2)) {
            System.out.println("Строка содержит символ " + e2);
        } else {
            System.out.println("Строка не содержит символ " + e2);
        }
    }

    public static void recountTime(int f) {             //Задача 6
        int f1 = f * 60;
        int f2 = f * 3600;
        System.out.println("Указанное время в минутах - " + f1 + ", в секундах - " + f2);
    }

    public static void timeConversion(int g) {              //Задача 7
        int g1 = (int) Math.floor(g / 86400);
        int g2 = (int) Math.floor((g - g1 * 86400) / 3600);
        int g3 = (int) Math.floor((g - g1 * 86400 - g2 * 3600) / 60);
        int g4 = g - g1 * 86400 - g2 * 3600 - g3 * 60;
        System.out.println(g + " секунд - это " + g1 + " дней, " + g2 + " часов, " + g3 + " минут и " + g4 + " секунд");
    }

    public static void caseChange(String h) {         //Задача 8 (знаю, что нужно через одну букву, но не получается)
        System.out.println(h.toUpperCase());
    }

    public static void circumference(int i) {             //Задача 9
        final double Pi = 3.14;
        double i1 = 2 * Pi * i;
        double i2 = Pi * (i ^ 2);
        System.out.println("Длина окружности равна " + i1 + ", площадь круга равна " + i2);
    }

    public static void parameterСomparison(float side1, float side2, float r) {           //Задача 10
        if (side1 > 0 & side2 > 0 & r > 0) {
            boolean compare = false;
            float diameter = 2 * r;
            double diagonal = Math.sqrt((side1 * side1) + (side2 * side2));
            compare = (diameter >= diagonal);
            if (compare == true) {
                System.out.println("Картонка закрывает отверстие");
            } else {
                System.out.println("Картонка не закрывает отверстие");
            }
        } else {
            System.out.println("Неверные данные");
        }
    }

}

