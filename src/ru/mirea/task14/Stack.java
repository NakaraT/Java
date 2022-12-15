package ru.mirea.task14;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
    private static void secondPlayerWin(java.util.Stack<Integer> firstPlayer, java.util.Stack<Integer> secondPlayer, ArrayList<Integer> buf1, ArrayList<Integer> buf2) {
        buf2.add(0,secondPlayer.pop());
        for (int i = buf2.size();i>0;i--){
            secondPlayer.push(buf2.get(i-1));
        }
        secondPlayer.push(firstPlayer.pop());
        for (int i = buf1.size();i>0;i--){
            firstPlayer.push(buf1.get(i-1));
        }
    }

    private static void firstPlayerWin(java.util.Stack<Integer> firstPlayer, java.util.Stack<Integer> secondPlayer, ArrayList<Integer> buf1, ArrayList<Integer> buf2) {
        buf1.add(0,firstPlayer.pop());
        for (int i = buf1.size();i>1;i--){
            firstPlayer.push(buf1.get(i-1));
        }
        firstPlayer.push(secondPlayer.pop());
        firstPlayer.push(buf1.get(0));
        for (int i = buf2.size();i>0;i--){
            secondPlayer.push(buf2.get(i-1));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        java.util.Stack<Integer> firstPlayer = new java.util.Stack<>();
        java.util.Stack<Integer> secondPlayer = new java.util.Stack<>();
        System.out.println("Enter the cards of the first player => ");
        int input;
        for(int i=0;i<5;i++){
            input = in.nextInt();
            firstPlayer.push(input);
        }
        System.out.println("Enter the cards of the second player => ");
        for(int i=0;i<5;i++){
            input = in.nextInt();
            secondPlayer.push(input);
        }
        int i = 0;
        ArrayList<Integer> buf1 = new ArrayList<>();
        ArrayList<Integer> buf2 = new ArrayList<>();
        while(!firstPlayer.empty() && !secondPlayer.empty()){
            while (firstPlayer.size()!=1) buf1.add(firstPlayer.pop());
            while (secondPlayer.size()!=1) buf2.add(secondPlayer.pop());
            if(firstPlayer.peek()==0){
                firstPlayerWin(firstPlayer, secondPlayer, buf1, buf2);
            }
            else if(secondPlayer.peek()==0){
                secondPlayerWin(firstPlayer, secondPlayer, buf1, buf2);
            }
            else if (firstPlayer.peek()>secondPlayer.peek()){
                firstPlayerWin(firstPlayer, secondPlayer, buf1, buf2);
            }
            else {
                secondPlayerWin(firstPlayer, secondPlayer, buf1, buf2);
            }
            i++;
            buf1.clear();
            buf2.clear();
            if(i>=106) break;
        }
        if(i>=106) System.out.println("Botva");
        else if(secondPlayer.empty()) System.out.println("First " + i);
        else System.out.println("Second " + i);
    }
}