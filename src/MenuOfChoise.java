import java.io.IOException;

public class MenuOfChoise {
    public static void menu() throws IOException {
        ActionsTamagotchi ActionsTamagotchi = new ActionsTamagotchi();
        char choice;
        do {
            System.out.println("Меню действий:");
            System.out.println("   1. Покормить " + GameTamagotchi.VinPadejName);
            System.out.println("   2. Выгулять "+ GameTamagotchi.VinPadejName);
            System.out.println("   3. Помыть "+ GameTamagotchi.VinPadejName);
            System.out.println("   4. Поиграть с "+ GameTamagotchi.TvorPadejName);
            System.out.println("   5. Пойти спать");
            System.out.println("   Выберите нужное действие:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        switch (choice) {
            case '1':
                ActionsTamagotchi.feed();
                System.out.println("Сытость +30. \nЧистота -3.");
                break;
            case '2':
                ActionsTamagotchi.walk();
                System.out.println("Счастье +25. \nУсталость +30.");
                break;
            case '3':
                ActionsTamagotchi.clean();
                System.out.println("Снова чистенький!");
                break;
            case '4':
                ActionsTamagotchi.pet();
                System.out.println("Счастье +10!");
                break;
            case '5':
                ActionsTamagotchi.sleep();
                System.out.println("Пора спать!");
                break;


        }
    }

    public static void status() {
        System.out.println("Сытость "+GameTamagotchi.RodPadejName +" "+ ActionsTamagotchi.fullness);
        System.out.println("счастье "+GameTamagotchi.RodPadejName +" "+ ActionsTamagotchi.happiness);
        System.out.println("Чистота "+GameTamagotchi.RodPadejName +" "+ ActionsTamagotchi.cleanliness);
        System.out.println("Усталость "+GameTamagotchi.RodPadejName +" "+ ActionsTamagotchi.tiredness);
    }
}
