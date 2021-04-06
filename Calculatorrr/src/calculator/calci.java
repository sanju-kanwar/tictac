package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class calci {

	private JFrame frame;
	private JTextField display;
	double num1;
	double num2;
	double res;
	String op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		display = new JTextField();
		display.setBackground(Color.PINK);
		display.setBounds(10, 10, 397, 30);
		frame.getContentPane().add(display);
		display.setColumns(10);

		JButton one = new JButton("1");
		one.setBackground(Color.ORANGE);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "1";
				display.setText(num);

			}
		});
		one.setBounds(10, 50, 85, 32);
		frame.getContentPane().add(one);

		JButton two = new JButton("2");
		two.setBackground(Color.ORANGE);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "2";
				display.setText(num);
			}
		});
		two.setBounds(115, 52, 85, 30);
		frame.getContentPane().add(two);

		JButton three = new JButton("3");
		three.setBackground(Color.ORANGE);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "3";
				display.setText(num);
			}
		});
		three.setBounds(215, 52, 85, 30);
		frame.getContentPane().add(three);

		JButton six = new JButton("6");
		six.setBackground(Color.ORANGE);
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "6";
				display.setText(num);
			}
		});
		six.setBounds(225, 101, 85, 21);
		frame.getContentPane().add(six);

		JButton four = new JButton("4");
		four.setBackground(Color.ORANGE);
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "4";
				display.setText(num);
			}
		});
		four.setBounds(10, 101, 85, 21);
		frame.getContentPane().add(four);

		JButton five = new JButton("5");
		five.setBackground(Color.ORANGE);
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "5";
				display.setText(num);
			}
		});
		five.setBounds(115, 101, 85, 21);
		frame.getContentPane().add(five);

		JButton seven = new JButton("7");
		seven.setBackground(Color.ORANGE);
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "7";
				display.setText(num);
			}
		});
		seven.setBounds(10, 147, 85, 21);
		frame.getContentPane().add(seven);

		JButton eight = new JButton("8");
		eight.setBackground(Color.ORANGE);
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "8";
				display.setText(num);
			}
		});
		eight.setBounds(115, 147, 85, 21);
		frame.getContentPane().add(eight);

		JButton nine = new JButton("9");
		nine.setBackground(Color.ORANGE);
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "9";
				display.setText(num);
			}
		});
		nine.setBounds(225, 147, 85, 21);
		frame.getContentPane().add(nine);

		JButton dot = new JButton(".");
		dot.setBackground(Color.ORANGE);
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + ".";
				display.setText(num);
			}
		});
		dot.setBounds(10, 178, 85, 21);
		frame.getContentPane().add(dot);

		JButton zero = new JButton("0");
		zero.setBackground(Color.ORANGE);
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "0";
				display.setText(num);
			}
		});
		zero.setBounds(115, 178, 85, 21);
		frame.getContentPane().add(zero);

		JButton clear = new JButton("c");
		clear.setBackground(Color.ORANGE);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = display.getText() + "c";
				display.setText(num);
			}
		});
		clear.setBounds(225, 178, 85, 21);
		frame.getContentPane().add(clear);

		JButton add = new JButton("+");
		add.setBackground(Color.ORANGE);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(display.getText());
				display.setText(" ");
				op = "+";
			}
		});
		add.setBounds(322, 56, 85, 26);
		frame.getContentPane().add(add);

		JButton subtract = new JButton("-");
		subtract.setBackground(Color.ORANGE);
		subtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(display.getText());
				display.setText("");
				op = "-";
			}
		});
		subtract.setBounds(322, 101, 85, 21);
		frame.getContentPane().add(subtract);

		JButton multiply = new JButton("*");
		multiply.setBackground(Color.ORANGE);
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(display.getText());
				display.setText(" ");
				op = "*";
			}
		});
		multiply.setBounds(322, 147, 85, 21);
		frame.getContentPane().add(multiply);

		JButton divde = new JButton("/");
		divde.setBackground(Color.ORANGE);
		divde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(display.getText());
				display.setText("");
				op = "/";
			}
		});
		divde.setBounds(322, 178, 85, 21);
		frame.getContentPane().add(divde);

		JButton Result = new JButton("=");
		Result.setBackground(Color.PINK);
		Result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(display.getText());
				if (op.equals("+")) {
					res = num1 + num2;
				} else if (op.equals("-")) {
					res = num1 - num2;
				} else if (op.equals("*")) {
					res = num1 * num2;
				} else if (op.equals("/")) {
					res = num1 / num2;
				}
				display.setText(res + "");
			}
		});
		Result.setBounds(10, 213, 397, 30);
		frame.getContentPane().add(Result);
	}
}
