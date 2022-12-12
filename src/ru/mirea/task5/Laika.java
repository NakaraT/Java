package ru.mirea.task5;

public class Laika extends Dog {
    private String Gender;

    public String getGender() {
        return Gender;
    }

    public void setGender(String size) {
        this.Gender = size;
    }

    public Laika(int years, String nickname, String gender) {
        super(years, nickname);
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Laika{" +
                "Gender='" + Gender + '\'' +
                ", years=" + years +
                ", Nickname='" + Nickname + '\'' +
                '}';
    }
}