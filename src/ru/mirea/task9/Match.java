package ru.mirea.task9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Match");
        frame.setSize(500,350);
        frame.setVisible(true);
        frame.setLayout(null);

        JButton aButton = new JButton("Arsenal");
        aButton.setBounds(50,200,128,32);
        frame.add(aButton);

        JButton bButton = new JButton("BLACKPOOL");
        bButton.setBounds(300,200,128,32);
        frame.add(bButton);

        final int[] aScore = {0};
        final int[] bScore = {0};
        JLabel scoreLabel = new JLabel("Result: " + aScore[0] + " x " + bScore[0]);
        scoreLabel.setSize(200, 100);
        scoreLabel.setBounds(222, 100, 85, 25);
        frame.add(scoreLabel);

        JLabel lastGoalLabel = new JLabel("Last scorer: ");
        lastGoalLabel.setSize(200, 100);
        lastGoalLabel.setBounds(222, 120, 150, 25);
        frame.add(lastGoalLabel);

        JLabel winnerLabel = new JLabel("Winner: ");
        winnerLabel.setSize(200, 100);
        winnerLabel.setBounds(222, 80, 100, 25);
        frame.add(winnerLabel);

        aButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                aScore[0]+=1;
                if (aScore[0] > bScore[0]){
                    winnerLabel.setText("Winner: Arsenal");
                    scoreLabel.setText("Result: " + aScore[0] + " x " + bScore[0]);
                    lastGoalLabel.setText("Last scorer: Arsenal");
                }
                else if (aScore[0] == bScore[0]) {
                    winnerLabel.setText("Winner: DRAW");
                    scoreLabel.setText("Result: " + aScore[0] + " x " + bScore[0]);
                    lastGoalLabel.setText("Last scorer: Arsenal");
                }
                else {
                    scoreLabel.setText("Result: " + aScore[0] + " x " + bScore[0]);
                    lastGoalLabel.setText("Last scorer: Arsenal");
                }
            }
        });

        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bScore[0]+=1;
                if (bScore[0] > aScore[0]){
                    winnerLabel.setText("Winner: BLACKPOOL");
                    scoreLabel.setText("Result: " + aScore[0] + " x " + bScore[0]);
                    lastGoalLabel.setText("Last scorer: BLACKPOOL");
                }
                else if (aScore[0] == bScore[0]) {
                    winnerLabel.setText("Winner: DRAW");
                    scoreLabel.setText("Result: " + aScore[0] + " x " + bScore[0]);
                    lastGoalLabel.setText("Last scorer: BLACKPOOL");
                }
                else {
                    scoreLabel.setText("Result: " + aScore[0] + " x " + bScore[0]);
                    lastGoalLabel.setText("Last scorer: BLACKPOOL");
                }
            }
        });
    }
}
