package ru.mirea.task23;

public class Cars {
    private int year = 0;
    private String mark = "";
    private String model ="";
    public Cars(int year, String mark, String model){
        this.year = year;
        this.mark = mark;
        this.model = model;
    }
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + year;
        return result;
    }

    public static void main(String[] args){
        Cars car1 = new Cars(2022, "Land Rover", "Long");
        Cars car2 = new Cars(2000, "Mitsubishi", "Galant");
        Cars car3 = new Cars(2004, "Ford", "Escape");
        Cars car4 = new Cars(2004, "LADA", "2115"); //самая лучшая по мнению автора
        Cars car5 = new Cars(2021, "Hyundai", "Long");

        if(car1.hashCode()==car1.hashCode()) {
            System.out.println("Car " + car1.mark + " " + car1.model + " is equal to the car " + car5.mark + " " + car5.model);
        }
        else System.out.println("Car " + car1.mark + " " + car1.model + " not equal to car " + car5.mark + " " + car5.model);
        System.out.println("Hash code of the  car " + car1.mark + " " + car1.model+  ": " + car1.hashCode());
        System.out.println("Hash code of the  car " + car5.mark + " " + car5.model+  ": " + car5.hashCode());
        System.out.println("");

        if(car1.hashCode()==car2.hashCode()) {
            System.out.println("Сar " + car1.mark + " " + car1.model + " is equal to the car " + car2.mark + " " + car2.model);
        }
        else System.out.println("Сar " + car1.mark + " " + car1.model + " not equal to car " + car2.mark + " " + car2.model);
        System.out.println("Hash code of the  car " + car1.mark + " " + car1.model+  ": " + car1.hashCode());
        System.out.println("Hash code of the  car " + car2.mark + " " + car2.model+  ": " + car2.hashCode());
        System.out.println("");

        if(car1.hashCode()==car3.hashCode()) {
            System.out.println("Сar " + car1.mark + " " + car1.model + " is equal to the car " + car3.mark + " " + car3.model);
        }
        else System.out.println("Сar " + car1.mark + " " + car1.model + " not equal to car " + car3.mark + " " + car3.model);
        System.out.println("Hash code of the  car " + car1.mark + " " + car1.model+  ": " + car1.hashCode());
        System.out.println("Hash code of the  car " + car3.mark + " " + car3.model+  ": " + car3.hashCode());
        System.out.println("");

        if(car1.hashCode()==car4.hashCode()) {
            System.out.println("Сar " + car1.mark + " " + car1.model + " is equal to the car " + car4.mark + " " + car4.model);
        }
        else System.out.println("Сar " + car1.mark + " " + car1.model + " not equal to car " + car4.mark + " " + car4.model);
        System.out.println("Hash code of the  car " + car1.mark + " " + car1.model+  ": " + car1.hashCode());
        System.out.println("Hash code of the  car " + car5.mark + " " + car4.model+  ": " + car4.hashCode());


    }
}
