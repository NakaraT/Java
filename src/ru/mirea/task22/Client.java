package ru.mirea.task22;

public class Client {
    private boolean sit = false;
    private Chair chair;

    void Sit(Chair chair) {
        if (sit) System.out.println("I'm already sitting down...");
        else {
            System.out.println("I'm sitting on a " + chair.getName() + " chair");
            this.chair = chair;
            sit = true;
        }
    }
    void Stand(Chair chair) {
        if (!sit) System.out.println("I'm already standing...");
        else {
            System.out.println("I got up from the " + chair.getName() + " chair");
            this.chair = chair;
            sit = false;
        }
    }
    public static void main(String[] args) {
        Chair chair1 = new VictorianChair();
        Chair chair2 = new MultifunctionalChair();
        Chair chair3 = new MagicChair();

        Client c = new Client();

        c.Sit(chair1);
        c.Sit(chair1);
        c.Stand(chair1);
        c.Sit(chair2);
        c.Sit(chair2);
        c.Stand(chair2);
        c.Stand(chair3);
        c.Stand(chair3);
        c.Sit(chair1);
    }
}
