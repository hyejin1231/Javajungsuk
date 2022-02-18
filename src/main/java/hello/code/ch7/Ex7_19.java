package hello.code.ch7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7_19 {
    public static void main(String[] args) {
        Button b = new Button();
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occuredd!!");
            }
        });
    }
}
