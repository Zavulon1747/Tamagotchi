public class ActionsTamagotchi {
    public static int fullness = 100, happiness = 100, cleanliness = 100, tiredness = 0, health = 100;

    public void feed() {
        fullness += 30;
        if (fullness > 100) {
            fullness = 100;
        }
        cleanliness -= 3;
        if (cleanliness < 0) {
            cleanliness = 0;
        }
    }

    public void walk() {
        happiness += 25;
        tiredness -= 30;
        if (happiness > 100) {
            happiness = 100;
        }
        if (tiredness < 0) {
            tiredness = 0;
            sleep();
        }
    }

    public void clean() {
        cleanliness += 70;
        if (cleanliness > 100) {
            cleanliness = 100;
        }
    }

    public void sleep() {

    }

    public void pet() {
        happiness += 10;
        fullness-=10;
        if (happiness > 100) {
            happiness = 100;
        }
        if (fullness<0) {
            System.out.println("GameOver!");
        }
    }

    public String getMood() {
        if (tiredness == 100) {
            return "asleep";
        } else if (tiredness >= 80) {
            return "tired";
        } else if (fullness <= 40 && fullness > 10) {
            return "hungry";
        } else if (fullness <= 10) {
            return "starving";
        } else if (cleanliness <= 30) {
            return "dirty";
        } else if (happiness >= 70) {
            return "happy";
        } else if (happiness < 70 && happiness >= 40) {
            return "Ok";
        } else if (happiness < 40) {
            return "Unhappy";
        } else return "Error, testing code.";

    }

    //здесь время для потока. Меняются числовые значения fullness, cleanliness, happiness, tiredness за какое-то время (см.
    //комментарий в шапке кода
    public void passTime() {


    }
}
