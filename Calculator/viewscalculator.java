import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class viewscalculator extends JFrame implements ActionListener {
  JLabel a, b, result;
  JTextField texta, textb, textresult;
  JButton add, sub, mul, div;
  ModelCalculator model;

  viewscalculator() {
    model = new ModelCalculator();

    setTitle("Calculator");
    setSize(500, 500);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    a = new JLabel("Enter A");
    a.setBounds(50, 50, 100, 30);
    add(a);

    texta = new JTextField();
    texta.setBounds(150, 50, 100, 30);
    add(texta);

    b = new JLabel("Enter B");
    b.setBounds(50, 100, 100, 30);
    add(b);

    textb = new JTextField();
    textb.setBounds(150, 100, 100, 30);
    add(textb);

    result = new JLabel("Result");
    result.setBounds(50, 150, 100, 30);
    add(result);

    textresult = new JTextField();
    textresult.setBounds(150, 150, 100, 30);
    textresult.setEditable(false);
    add(textresult);

    add = new JButton("+");
    add.setBounds(30, 220, 60, 30);
    add.addActionListener(this);
    add(add);

    sub = new JButton("-");
    sub.setBounds(100, 220, 60, 30);
    sub.addActionListener(this);
    add(sub);

    mul = new JButton("*");
    mul.setBounds(170, 220, 60, 30);
    mul.addActionListener(this);
    add(mul);

    div = new JButton("/");
    div.setBounds(240, 220, 60, 30);
    div.addActionListener(this);
    add(div);

    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    double first = Double.parseDouble(texta.getText());
    double second = Double.parseDouble(textb.getText());
    double value;

    if (e.getSource() == add) {
      value = model.add(first, second);
    } else if (e.getSource() == sub) {
      value = model.sub(first, second);
    } else if (e.getSource() == mul) {
      value = model.mul(first, second);
    } else {
      value = model.div(first, second);
    }

    textresult.setText(String.valueOf(value));
  }

  public static void main(String[] args) {
    new viewscalculator();
  }
}