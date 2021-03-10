import java.io.IOException;
import java.util.Scanner;

public class BeginGame {
    public static void beginGame (){
        String choise;
        System.out.println("Введите имя питомца: ");
        Scanner scanner = new Scanner(System.in);
        GameTamagotchi.nameTamagotchi = scanner.nextLine();
        System.out.println("Введите имя питомца в родительном падеже: ");
        GameTamagotchi.RodPadejName = scanner.nextLine();
        System.out.println("Введите имя питомца в дательном падеже: ");
        GameTamagotchi.DatPadejName = scanner.nextLine();
        System.out.println("Введите имя питомца в винительном падеже: ");
        GameTamagotchi.VinPadejName = scanner.nextLine();
        System.out.println("Введите имя питомца в творительном падеже: ");
        GameTamagotchi.TvorPadejName = scanner.nextLine();
        System.out.println("Введите имя питомца в предложном падеже: ");
        GameTamagotchi.PredlPadejName = scanner.nextLine();
        System.out.println("В этом страшном мире появляется чудо заморское \n" +
                "и имя ему... " + GameTamagotchi.nameTamagotchi + "! Вырастит ли " +
                "оно тем,\nкто спасёт человечество или же погубит его?");

        System.out.println("\nЧтобы вызвать меню действий, напишите \"меню\"" +
                "\nУзнать статус питомца \"статус\"\nВыйти из игры \"выход\"");
        do {
            choise = scanner.nextLine();
            if (choise.equalsIgnoreCase("меню")) {
                try {
                    MenuOfChoise.menu();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (choise.equalsIgnoreCase("статус")) {
                MenuOfChoise.status();
            } else if (choise.equalsIgnoreCase("выход")) {
                break;
            }
            System.out.println("\nЧтобы вызвать меню действий, напишите \"меню\"" +
                    "\nУзнать статус питомца \"статус\"\nВыйти из игры \"выход\"");
            //Почему-то с этим куском не работает Scanner
//                    else {
//                        System.out.println("Вы не ввели ничего из предложенного.\nХотите закончить игру?\nНет\nДа(или любое другое слово)");
//                        if (scanner.nextLine().equalsIgnoreCase("Нет")) {
//                            System.out.println("\nЧтобы вызвать меню действий, напишите \"меню\"" +
//                                    "\nУзнать статус питомца \"статус\" ");
//                            continue;
//                        } else break;
//                    }
            if (ActionsTamagotchi.health==0) {
                System.out.println("GameOver!"+GameTamagotchi.nameTamagotchi+" is Dead!");
                break;
            }
        } while (true);
    }
}
