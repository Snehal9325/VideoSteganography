package source;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class UserLogin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JLabel label;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	GraphicsEnvironment graphics =
						      GraphicsEnvironment.getLocalGraphicsEnvironment();
						      GraphicsDevice device = graphics.getDefaultScreenDevice();
						      
                    UserLogin frame = new UserLogin();
                    frame.setVisible(true);
                    
                    frame.setResizable(false);
				     // device.setFullScreenWindow(frame);
                    //frame.pack();
                    frame.setLocationRelativeTo(null);
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
    public UserLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Securing Confidential Data Over Public Channel using Video Steganography using AES");

        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
		contentPane.setBackground(new Color(25,147,240));

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label = new JLabel("Securing Confidential Data Over Public Channel using Video Steganography using AES");
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Arial", Font.BOLD, 22));
		label.setBounds(74, 13, 1500, 78);
		contentPane.add(label);
		
        JLabel lblNewLabel = new JLabel("User Login");
        lblNewLabel.setForeground(Color.white);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblNewLabel.setBounds(423, 70, 273, 93);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        textField.setBounds(481, 170, 281, 68);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(481, 286, 281, 68);
        contentPane.add(passwordField);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setForeground(new Color(255, 255, 255));
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 24));
		
        lblUsername.setBounds(250, 166, 193, 52);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(new Color(255, 255, 255));
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 24));
        
        lblPassword.setBounds(250, 286, 193, 52);
        contentPane.add(lblPassword);

        btnNewButton = new JButton("Login");
        btnNewButton.setBackground(new Color(13,59,102));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setOpaque(true);
		
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(545, 392, 162, 73);
        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            	String u="demo";
            	String p="demo";
                String userName = textField.getText();
                String password = passwordField.getText();
              //  try {
                    //Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
                       // "root", "root");

                   // PreparedStatement st = (PreparedStatement) connection
                    //    .prepareStatement("Select name, password from student where name=? and password=?");

                    //st.setString(1, userName);
                    //st.setString(2, password);
                   // ResultSet rs = st.executeQuery();
                    if (userName.equals(u) && password.equals(p) ) {
                        
                        JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
                        dispose();
                        //UserHome ah = new UserHome(userName);
                        GraphicsEnvironment graphics =
						      GraphicsEnvironment.getLocalGraphicsEnvironment();
						      GraphicsDevice device = graphics.getDefaultScreenDevice();
					
					VideoSteganography frame = new VideoSteganography();
					
					//frame.setUndecorated(true);
				      frame.setResizable(false);
				      device.setFullScreenWindow(frame);
				      
					frame.setVisible(true);
					
                        //ah.setTitle("Welcome");
                        //ah.setVisible(true);
                       
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
                    //}
              //  } catch (SQLException sqlException) {
               //     sqlException.printStackTrace();
                }
            }
        });

        contentPane.add(btnNewButton);

        label = new JLabel("");
        label.setBounds(0, 0, 1008, 562);
        contentPane.add(label);
    }
}
