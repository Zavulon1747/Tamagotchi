/*
                                                               Тамагочи спецификация:

1) Можно кормить Тамагочи -> при кормлении сытость увеличивается на 30 ед.

2) Можно гулять с Тамагочи -> счастье увеличивается 25 ед, энергия уменьшается 35 ед.

3) Гигиена -> при помывке Тамагочи гигиена растёт на 70 ед.

4) Ухаживать за Тамагочи -> счастье увеличивается 10 ед.

5) Тамагочи должен спать.

6) У Тамагочи должно быть настроение
Если tiredness == 100 -> Tamagotchi sleep(). Если tiredness == 80 -> Tamagotchi tired;
Если fullness <= 40 -> Tamagotchi hungry;
Если cleanliness <= 30 -> Tamagotchi dirty;
Если happiness >= 70 -> Счастлив; happiness < 70 && happiness >=40 -> Ok; happiness <40 -> unhappiness;

7) Установить время для каждой хаарктеристики.
Каждые 57600 секунд (каждые 960 минут или 16 часов) усталость на 100. 1 единица усталости в каждую 576 секунд.
Сытость теряет 1 единицу каждые 3 минуты (180 секунд). Если fullness <= 40 -> happiness уменьшается на 1 единицу каждые 4 минуты.
Счастье теряет 1 единицу каждые 6 минут (360 секунд).
Чистоту теряет каждые 5 минут (300 секунд). Если чистота <=30 -> happiness теряет 1 единицу каждые 2 минуты.

8) У методов нет параметров.

9) Значения не могут быть отрицательными и не могут превышать 100.



Поля Тамагочи: fullness, happiness, cleanliness, tiredness. Интервалы от 0 до 100.
 */

public class GameTamagotchi {
    public static String nameTamagotchi, RodPadejName, DatPadejName, VinPadejName, TvorPadejName, PredlPadejName;

    public static void main(String[] args) {
        WindowScreen.getFrame();
        BeginGame.beginGame();



    }
}



