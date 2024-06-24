package my.mood;

import com.toedter.calendar.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AddCustomer extends JFrame  implements ActionListener {

    JLabel customerId1;
    JTextField nameTF, nationalityTF, emailTF, phoneTF,
            addressTF, passportNumTF, driverLicenceTF, nationalIdTF,
            emergencyNumTF, emergencyNameTF;
    JDateChooser dobDC, registrationDateDC;
    JComboBox genderCB;
    JButton save;

    public AddCustomer(){

        setBounds(150, 150, 1200, 600);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text = new JLabel("Add Customer Details");
        text.setFont(new Font("Arial", Font.BOLD, 24));
        text.setForeground(Color.BLACK);
        text.setBounds(450, 20, 400, 30);
        add(text);

        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Raleway", Font.BOLD, 16));
        name.setBounds(100, 80, 150, 20);
        add(name);

        JLabel dob = new JLabel("Date of birth :");
        dob.setFont(new Font("Raleway", Font.BOLD, 16));
        dob.setBounds(100, 120, 150, 20);
        add(dob);

        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway", Font.BOLD, 16));
        gender.setBounds(100, 160, 150, 20);
        add(gender);

        JLabel nationality = new JLabel("Nationality :");
        nationality.setFont(new Font("Raleway", Font.BOLD, 16));
        nationality.setBounds(100, 200, 150, 20);
        add(nationality);

        JLabel email = new JLabel("Email Address :");
        email.setFont(new Font("Raleway", Font.BOLD, 16));
        email.setBounds(100, 240, 150, 20);
        add(email);

        JLabel PhoneNumber = new JLabel("Phone Number :");
        PhoneNumber.setFont(new Font("Raleway", Font.BOLD, 16));
        PhoneNumber.setBounds(100, 280, 150, 20);
        add(PhoneNumber);

        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway", Font.BOLD, 16));
        address.setBounds(100, 320, 150, 20);
        add(address);

        JLabel PassportNumber = new JLabel("Passport Number :");
        PassportNumber.setFont(new Font("Raleway", Font.BOLD, 16));
        PassportNumber.setBounds(100, 360, 150, 20);
        add(PassportNumber);

        JLabel nationalId = new JLabel("National Id Num :");
        nationalId.setFont(new Font("Raleway", Font.BOLD, 16));
        nationalId.setBounds(100, 400, 150, 20);
        add(nationalId);

        JLabel drivingLicence = new JLabel("Driving Licence Num :");
        drivingLicence.setFont(new Font("Raleway", Font.BOLD, 16));
        drivingLicence.setBounds(100, 440, 180, 20);
        add(drivingLicence);

        nameTF = new JTextField();
        nameTF.setFont(new Font("Raleway", Font.PLAIN, 16));
        nameTF.setBounds(280, 80, 200, 20);
        nameTF.setBorder(new LineBorder(Color.BLACK));
        add(nameTF);

        dobDC = new JDateChooser();
        dobDC.setBounds(280, 120, 200, 20);
        dobDC.setBorder(new LineBorder(Color.BLACK));
        add(dobDC);

        String [] Array = {"Male", "Female", "Other", "Prefer not to say"};
        genderCB = new JComboBox(Array);
        genderCB.setFont(new Font("Raleway", Font.PLAIN, 14));
        genderCB.setBounds(280, 160, 200, 20);
        genderCB.setBackground(Color.white);
        add(genderCB);

        nationalityTF = new JTextField();
        nationalityTF.setFont(new Font("Raleway", Font.PLAIN, 16));
        nationalityTF.setBounds(280, 200, 200, 20);
        nationalityTF.setBorder(new LineBorder(Color.BLACK));
        add(nationalityTF);

        emailTF = new JTextField();
        emailTF.setFont(new Font("Raleway", Font.PLAIN, 16));
        emailTF.setBounds(280, 240, 200, 20);
        emailTF.setBorder(new LineBorder(Color.BLACK));
        add(emailTF);

        phoneTF = new JTextField();
        phoneTF.setFont(new Font("Raleway", Font.PLAIN, 16));
        phoneTF.setBounds(280, 280, 200, 20);
        phoneTF.setBorder(new LineBorder(Color.BLACK));
        add(phoneTF);

        addressTF = new JTextField();
        addressTF.setFont(new Font("Raleway", Font.PLAIN, 16));
        addressTF.setBounds(280, 320, 200, 20);
        addressTF.setBorder(new LineBorder(Color.BLACK));
        add(addressTF);

        passportNumTF = new JTextField();
        passportNumTF.setFont(new Font("Raleway", Font.PLAIN, 16));
        passportNumTF.setBounds(280, 360, 200, 20);
        passportNumTF.setBorder(new LineBorder(Color.BLACK));
        add(passportNumTF);

        nationalIdTF = new JTextField();
        nationalIdTF.setFont(new Font("Raleway", Font.PLAIN, 16));
        nationalIdTF.setBounds(280, 400, 200, 20);
        nationalIdTF.setBorder(new LineBorder(Color.BLACK));
        add(nationalIdTF);

        driverLicenceTF = new JTextField();
        driverLicenceTF.setFont(new Font("Raleway", Font.PLAIN, 16));
        driverLicenceTF.setBounds(280, 440, 200, 20);
        driverLicenceTF.setBorder(new LineBorder(Color.BLACK));
        add(driverLicenceTF);

        JLabel emergencyName = new JLabel("Emergency Contact Name :");
        emergencyName.setFont(new Font("Raleway", Font.BOLD, 16));
        emergencyName.setBounds(550, 80, 250, 20);
        add(emergencyName);

        JLabel emergencyNumber = new JLabel("Emergency Contact Phone :");
        emergencyNumber.setFont(new Font("Raleway", Font.BOLD, 16));
        emergencyNumber.setBounds(550, 120, 250, 20);
        add(emergencyNumber);

        JLabel customerId = new JLabel("Customer ID :");
        customerId.setFont(new Font("Raleway", Font.BOLD, 16));
        customerId.setBounds(550, 160, 250, 20);
        add(customerId);

        JLabel registrationDate = new JLabel("Date of Registration :");
        registrationDate.setFont(new Font("Raleway", Font.BOLD, 16));
        registrationDate.setBounds(550, 200, 250, 20);
        add(registrationDate);

        emergencyNameTF = new JTextField();
        emergencyNameTF.setFont(new Font("Raleway", Font.PLAIN, 16));
        emergencyNameTF.setBounds(780, 80, 200, 20);
        emergencyNameTF.setBorder(new LineBorder(Color.BLACK));
        add(emergencyNameTF);

        emergencyNumTF = new JTextField();
        emergencyNumTF.setFont(new Font("Raleway", Font.PLAIN, 16));
        emergencyNumTF.setBounds(780, 120, 200, 20);
        emergencyNumTF.setBorder(new LineBorder(Color.BLACK));
        add(emergencyNumTF);

        Random r = new Random();
        int random =r.nextInt(900000);
        customerId1 = new JLabel(String.valueOf(random));
        customerId1.setFont(new Font("Raleway", Font.PLAIN, 16));
        customerId1.setBounds(780, 160, 200, 20);
        customerId1.setBorder(new LineBorder(Color.BLACK));
        add(customerId1);

        registrationDateDC = new JDateChooser();
        registrationDateDC.setBounds(780, 200, 200, 20);
        registrationDateDC.setBorder(new LineBorder(Color.BLACK));
        registrationDateDC.setDate(new Date());
        registrationDateDC.setEnabled(true);
        registrationDateDC.setVisible(true);
        add(registrationDateDC);


        save = new JButton("Save");
        save.setFont(new Font("Arial", Font.BOLD, 18));
        save.setBounds(880, 240, 100, 25);
        save.setBorder(new LineBorder(Color.white));
        save.setForeground(Color.white);
        save.setBackground(Color.black);
        save.addActionListener(this);
        add(save);



        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae){
        String nameS = nameTF.getText();
        String dobS = dobDC.getDateFormatString();
        String genderS = (String) genderCB.getSelectedItem();
        String nationalityS = nationalityTF.getText();
        String emailS = emailTF.getText();
        String phoneS = phoneTF.getText();
        String addressS = addressTF.getText();
        String passportNumS = passportNumTF.getText();
        String driverLicenceS = driverLicenceTF.getText();
        String nationalIdS = nationalIdTF.getText();
        String emergencyNumS = emergencyNumTF.getText();
        String emergencyNameS = emergencyNameTF.getText();
        String customerIdS = customerId1.getText();
        String registrationDateS = registrationDateDC.getDateFormatString();

        if (nameS.isEmpty() || dobS.isEmpty() ||
                nationalityS.isEmpty() || emailS.isEmpty() ||
                phoneS.isEmpty() || addressS.isEmpty() ||
                passportNumS.isEmpty() || driverLicenceS.isEmpty() ||
                nationalIdS.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill all the required field!");
        }
        else {
            try {
                DBConnection c = new DBConnection();
                String query = "insert into Customer values ('"+nameS+"', '"+dobS+"', '"+genderS+"', '"+nationalityS+"', '"+emailS+"', '"+phoneS+"', '"+addressS+"', '"+passportNumS+"', '"+driverLicenceS+"', '"+nationalIdS+"', '"+emergencyNameS+"', '"+emergencyNumS+"', '"+customerIdS+"', '"+registrationDateS+"')";
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Customer details added successfully!");
                JOptionPane.showMessageDialog(null, "Please note down \nCustomer Id : " + customerIdS);

                setVisible(false);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        new AddCustomer();

    }
}
