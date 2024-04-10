package example;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PizzaOrder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtMob;
	private JTextArea txtAddr;
	private JComboBox lstToppings;
	private JComboBox cbBase;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaOrder frame = new PizzaOrder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PizzaOrder() {
		setTitle("Pizza Order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 424);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(29, 36, 99, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Address.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(29, 90, 115, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Mobile No.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(29, 139, 129, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Select Base.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(29, 181, 107, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Select Toppings.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(29, 236, 115, 22);
		contentPane.add(lblNewLabel_4);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtName.setBounds(179, 33, 131, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAddr = new JTextArea();
		txtAddr.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtAddr.setBounds(181, 85, 129, 22);
		contentPane.add(txtAddr);
		
		txtMob = new JTextField();
		txtMob.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMob.setBounds(179, 139, 131, 20);
		contentPane.add(txtMob);
		txtMob.setColumns(10);
		
	    cbBase = new JComboBox();
		cbBase.setModel(new DefaultComboBoxModel(new String[] {"Basic", "Thick and Chewy", "Thin and Crispy", "Chicago Deep Dish"}));
		cbBase.setFont(new Font("Tahoma", Font.BOLD, 14));
		cbBase.setBounds(179, 180, 131, 22);
		contentPane.add(cbBase);
		
		JButton btnNewButton = new JButton("Place Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=txtName.getText()+"\n Your Details are:\n";
				msg+="Address:"+txtAddr.getText()+"\n";
				msg+="Mobile No:"+txtMob.getText()+"\n";
				msg+="Base:"+cbBase.getSelectedItem()+"\n";
				msg+="Toppings :"+lstToppings.getSelectedItem()+"\n";
				JOptionPane.showMessageDialog(btnNewButton,msg);
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(29, 351, 115, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAddr.setText("");
				txtMob.setText("");
				cbBase.setSelectedIndex(-1);
				lstToppings.setSelectedIndex(-1);
			}
		});
		
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(221, 351, 115, 23);
		contentPane.add(btnNewButton_1);
		
		lstToppings = new JComboBox();
		lstToppings.setFont(new Font("Tahoma", Font.BOLD, 12));
		lstToppings.setModel(new DefaultComboBoxModel(new String[] {"Pepporoni", "Sausage", "Black Olive", "Mushroom"}));
		lstToppings.setBounds(179, 238, 143, 22);
		contentPane.add(lstToppings);
	}
}
