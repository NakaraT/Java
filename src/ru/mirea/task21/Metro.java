package ru.mirea.task21;

import java.util.ArrayList;

class Metro {
    ArrayList<String> lines = new ArrayList<String>();
    Metro() {
        lines.add("Park Pobedy");
        lines.add("Kievskaya");
        lines.add("Smolenskaya");
        lines.add("Borovitskaya");
        lines.add("Arbatskaya");
        lines.add("Biblioteka Lenina");
        lines.add("Park Kultury");
        lines.add("Frunzenskaya");
        lines.add("Sportivnaya");
        lines.add("Universitet");
        lines.add("Yugo-Zapadnaya");
        lines.add("Okhotny Ryad");
        lines.add("Lubyanka");
        lines.add("Teatralnaya");
        lines.add("Nekrasovskaya");
        lines.add("Belyaevo");
    }
    public void PrintList(boolean state){
        for(int i = 0; i < lines.size(); i++){
            if(state){
                if(i % 2 == 0)
                    System.out.println("Line => " + lines.get(i));
            }
            else if(i % 2 == 1)
                System.out.println("Line => " + lines.get(i));
        }
    }
}