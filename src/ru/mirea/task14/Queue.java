package ru.mirea.task14;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        java.util.Queue<Integer> firstPlayer = new LinkedList<>();
        java.util.Queue<Integer> secondPlayer = new LinkedList<>();
        System.out.println("Enter the cards of the first player => ");
        int input;
        for(int i=0;i<5;i++){
            input = in.nextInt();
            firstPlayer.offer(input);
        }
        System.out.println("Enter the cards of the second player => ");
        for(int i=0;i<5;i++){
            input = in.nextInt();
            secondPlayer.offer(input);
        }
        int cnt =0;
        while(!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
            if(firstPlayer.peek()==0){
                firstPlayer.offer(secondPlayer.poll());
                firstPlayer.offer(firstPlayer.poll());
            }
            else if(secondPlayer.peek()==0){
                secondPlayer.offer(secondPlayer.poll());
                secondPlayer.offer(firstPlayer.poll());
            }
            else if (firstPlayer.peek()>secondPlayer.peek()){
                firstPlayer.offer(secondPlayer.poll());
                firstPlayer.offer(firstPlayer.poll());
            }
            else {
                secondPlayer.offer(secondPlayer.poll());
                secondPlayer.offer(firstPlayer.poll());
            }
            cnt++;
            if(cnt>=106) break;
        }
        if(cnt>=106) System.out.println("Botva");
        else if(secondPlayer.isEmpty()) System.out.println("First " + cnt);
        else System.out.println("Second " + cnt);
    }
}
