package ru.mirea.task5;

public class Dog {
    protected int years;
    protected String Nickname;

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public Dog(int years, String nickname) {
        this.years = years;
        Nickname = nickname;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "years=" + years +
                ", nickname='" + Nickname + '\'' +
                '}';
    }
}
