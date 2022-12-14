package ru.mirea.task17;

import java.util.Scanner;
//
enum Planets {
    Mercury(3.302e23, 2440),
    Venus(4.869e24, 6052),
    Earth(5.974e24, 6378),
    Mars(6.419e23, 3397),
    Jupiter(1.899e27, 71490),
    Saturn(5.685e26, 60270),
    Uranium(8.685e25, 25560),
    Neptune(1.024e26, 24760);

    private double G = 6.67408e-11;
    private double weight, radius, force;
    Planets(double w, double r) {
        weight = w;
        radius = r;
        force = (G*weight)/(radius*radius)/1000000;
    }

    public double getForce() { return force; }
}
//
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int planets;
        while (true) {
            System.out.println("Enter the planet number from 0 to 7 by distance from the sun =>: ");
            planets = sc.nextInt();
            Planets pl;
            if (planets < 8) {
                System.out.println("Planet => " + Planets.values()[planets].name());
                System.out.println("The force of attraction => " + Planets.values()[planets].getForce() + " m/s^2");
            } else System.out.println("There is no planet with this number.");
        }
    }
}
