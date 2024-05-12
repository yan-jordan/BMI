import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize( 420,400);
        frame.setLocation(550,300);
        frame.setResizable(false);
        frame.setLayout(null);

        //getting height from user
        JLabel height = new JLabel();
        height.setBounds(0 , 0 , 150 , 50);
        height.setText("ENTER HEIGHT(cm) = ");
        frame.add(height);
        JTextField heightText = new JTextField();
        heightText.setBounds( 200 , 0 , 200 , 50);
        frame.add(heightText);

        //getting weight from user
        JLabel weight = new JLabel();
        weight.setBounds(0 ,  100 , 150 , 50);
        weight.setText("ENTER WEIGHT(kg) = ");
        frame.add(weight);
        JTextField weightText = new JTextField();
        weightText.setBounds( 200 , 100 , 200 , 50);
        frame.add(weightText);

        //calculator button
        JButton calculator = new JButton("CALCULATOR");
        calculator.setBounds(100 , 200 , 200 , 50);
        frame.add(calculator);
        calculator.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strWeight = weightText.getText();
                String strHeight = heightText.getText();
                double weight = Double.valueOf(strWeight);
                double height = Double.valueOf(strHeight) / 100;
                int bmi = (int)(weight / ( height * height));
                frame.revalidate();
                frame.repaint();
                JLabel answer = new JLabel();
                answer.setText("YOUR BMI IS = " + bmi);
                answer.setBounds(130 , 300 , 300 ,  50);
                frame.add(answer);
            }
        });

        //make the frame visible
        frame.setVisible(true);
    }
}