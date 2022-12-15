package ru.mirea.task22;

public class MultifunctionalChair implements Chair{
    private String material, name;
    public MultifunctionalChair() {
        this.SetMaterial(); this.SetName();
    }

    public void SetMaterial() {
        this.material = "Metal";
    }

    public void SetName() {
        this.name = "Multifunctional";
    }

    public String getName() {
        return name;
    }
}