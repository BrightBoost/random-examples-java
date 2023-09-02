package org.example;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RealTimeClock {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Real-Time Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        JLabel timeLabel = new JLabel();
        frame.add(timeLabel);

        // Timer to update the time every second
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalDateTime now = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String formattedTime = now.format(formatter);
                timeLabel.setText(formattedTime);
            }
        });

        timer.start();

        frame.setVisible(true);
    }
}
