package ru.mirea.task5;

public class Borzoi extends Dog {
    private String Gender;

    public String getGender() {
        return Gender;
    }

    public void setGender(String size) {
        this.Gender = size;
    }

    public Borzoi(int years, String nickname, String gender) {
        super(years, nickname);
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Borzoi{" +
                "Gender='" + Gender + '\'' +
                ", years=" + years +
                ", Nickname='" + Nickname + '\'' +
                '}';
    }
}