package lesson_10_tasks;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    JLabel labelOne, labelTwo;

    public GUI() {
        setTitle("Здесь был Петрович");
        setSize(400, 400);
        setVisible(true);

        labelOne = new JLabel("Сукины, сукины, сукины, сукины, сукины дети");
        labelTwo = new JLabel("Пример говнокода");

        labelOne.setToolTipText("Кто-то");
        labelTwo.setToolTipText("Понял");

        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));

        container.add(labelOne);
        container.add(labelTwo);

    }

    public static void main(String[] args) {
        new GUI();
    }
}
