import java.util.Scanner;

public class Sixth {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = in.nextInt();
        //В восточном календаре принят 60-летний цикл, состоящий из 12-летних подциклов,
        // обозначаемых названиями цвета: зеленый, красный, желтый, белый и голубой.  по два
        // названия животных: крысы, коровы, тигра, зайца, дракона, змеи, лошади, овцы, обезьяны, петуха, собаки и свиньи.
        // По номеру года определить его название и название ближайших четырех лет(2 прошлых и 2 будущих),
        // если 4 год нашей эры — начало цикла: «год зеленой крысы».
        String[] Colors = {"зеленый", "красный", "желтый", "белый", "голубой"};
        String[] Animals = {"крысы", "коровы", "тигра", "зайца", "дракона", "змеи", "лошади", "овцы", "обезьяны", "петуха", "собаки", "свиньи"};
        int C = 0;
        int A = 0;
        if (year >= 4) {
            C = ((year - 4) / 2) % 5;
            A = ((year + 8) % 12);
        } else {
            System.out.print("Error");
        }
        System.out.print("Year:  " + Colors[C] + "  " + Animals[A] + " \n");
        System.out.println("Next two years: " + Colors[C+1] + " " + Animals[(A + 1) % 12] + " and "
                + Colors[C+1] + " " + Animals[(A + 2) % 12]);

        // Выводим названия предыдущих двух лет
        System.out.println("Previous two years: " + Colors[(C - 1 + 5) % 5] + " " + Animals[(A - 1 + 12) % 12] + " and "
                + Colors[(C - 2 + 5) % 5] + " " + Animals[(A - 2 + 12) % 12]);
    }
}
