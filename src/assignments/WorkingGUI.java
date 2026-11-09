package assignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WorkingGUI {

	private JFrame frame;
	private JTextField textField;    // Search Criteria
	private JTextField textField_1;  // Brand
	private JTextField textField_2;  // Type
	private JTextField textField_3;  // Price
	private JTextField textField_4;  // Size

	// Loads database array from file using Anushka's method[cite: 4, 8]
	private Footwear[] database = LoadMethodAnushka.loadItems("shoes.txt");

	//DESCRIPTION - Returns Footwear object that corresponds to the search word; if not found, return null[cite: 11]
	//PARAMETERS - Footwear[] a, String searchWord
	//RETURN - Footwear
	public static Footwear searchAll(Footwear[] a, String searchWord) {
		
		// Checks Brand[cite: 10]
		int index = LinearUnsortedAlbert.searchBrand(a, searchWord, 0);
		if (index != -1) {
			return a[index];
		}

		// Checks Type of Shoe[cite: 10]
		index = LinearUnsortedAlbert.searchTypeOfShoe(a, searchWord, 0);
		if (index != -1) {
			return a[index];
		}

		// Checks Price[cite: 9]
		index = LinearUnsortedAnushka.searchPrice(a, searchWord, 0);
		if (index != -1) {
			return a[index];
		}

		// Checks Size[cite: 9]
		index = LinearUnsortedAnushka.searchSize(a, searchWord, 0);
		if (index != -1) {
			return a[index];
		}

		// Returns null if no match is found
		return null;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkingGUI window = new WorkingGUI();
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
	public WorkingGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 469, 432);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Footwear Search");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(159, 40, 138, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Search Criteria:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(49, 83, 82, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Brand");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(49, 143, 82, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Type");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(49, 193, 82, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Price");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(49, 242, 82, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Size");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(49, 291, 82, 14);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		textField = new JTextField();
		textField.setBounds(180, 81, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 141, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(180, 191, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(180, 240, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(180, 289, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String searchWord = textField.getText().trim();
				
				
				Footwear result = searchAll(database, searchWord);
				
				
				if (result != null) {
					textField_1.setText(result.getBrand());
					textField_2.setText(result.getTypeOfFootwear());
					textField_3.setText(result.getPrice());
					textField_4.setText(result.getSize());
				} else {
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
				}
				
			}
		});
		btnNewButton.setBounds(318, 80, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}