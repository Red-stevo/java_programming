package SimplePayrollSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class MainFrame extends JFrame {

    private JPanel contentPane;
    private JTextField workDays;
    private JTextField dailyHrs;
    private JTextField rate;
    private JTextField empName;
    private JTextField main_tax;
    private JTextField phil_tax;
    private JTextField sss_tax;
    private JTextField ttl_sal;
    private JTextField ttl_deduct;
    private JTextField gross_salary;
    private JTextField total_tax;
    private JTextField net_salary;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame frame = new MainFrame();
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
    public MainFrame() {
        setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
        setTitle("SALARY PAYROLL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 871, 425);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Simple Payroll System");
        lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));

        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(263, 11, 286, 41);
        contentPane.add(lblNewLabel);

        workDays = new JTextField();
        workDays.setBounds(165, 128, 86, 20);
        contentPane.add(workDays);
        workDays.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Employee Name:");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
        lblNewLabel_1_1.setBounds(-8, 56, 164, 14);
        contentPane.add(lblNewLabel_1_1);

        dailyHrs = new JTextField();
        dailyHrs.setColumns(10);
        dailyHrs.setBounds(165, 103, 86, 20);
        contentPane.add(dailyHrs);

        rate = new JTextField();
        rate.setColumns(10);
        rate.setBounds(165, 78, 86, 20);
        contentPane.add(rate);

        empName = new JTextField();
        empName.setColumns(10);
        empName.setBounds(165, 53, 86, 20);
        contentPane.add(empName);

        JLabel lblNewLabel_1_1_1 = new JLabel("Rate Per Hour:");
        lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
        lblNewLabel_1_1_1.setBounds(-8, 81, 164, 14);
        contentPane.add(lblNewLabel_1_1_1);

        JLabel lblNewLabel_1_1_2 = new JLabel("Hour Per Day:");
        lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
        lblNewLabel_1_1_2.setBounds(-8, 106, 164, 14);
        contentPane.add(lblNewLabel_1_1_2);

        JLabel lblNewLabel_1_1_3 = new JLabel("Number of days worked:");
        lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
        lblNewLabel_1_1_3.setBounds(10, 131, 146, 14);
        contentPane.add(lblNewLabel_1_1_3);

        JLabel lblNewLabel_1 = new JLabel("DEDUCTION OF SALARY:");
        lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
        lblNewLabel_1.setForeground(new Color(255, 0, 0));
        lblNewLabel_1.setBounds(283, 49, 158, 27);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1_4 = new JLabel("TAX 15% of Monthly Wage");
        lblNewLabel_1_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
        lblNewLabel_1_1_4.setBounds(277, 81, 164, 14);
        contentPane.add(lblNewLabel_1_1_4);

        JLabel lblNewLabel_1_1_5 = new JLabel("Philhealth 5%");
        lblNewLabel_1_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
        lblNewLabel_1_1_5.setBounds(277, 106, 164, 14);
        contentPane.add(lblNewLabel_1_1_5);

        JLabel lblNewLabel_1_1_6 = new JLabel("SSS 2%");
        lblNewLabel_1_1_6.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
        lblNewLabel_1_1_6.setBounds(277, 131, 164, 14);
        contentPane.add(lblNewLabel_1_1_6);

        main_tax = new JTextField();
        main_tax.setEditable(false);
        main_tax.setColumns(10);
        main_tax.setBounds(451, 78, 86, 20);
        contentPane.add(main_tax);

        phil_tax = new JTextField();
        phil_tax.setEditable(false);
        phil_tax.setColumns(10);
        phil_tax.setBounds(451, 103, 86, 20);
        contentPane.add(phil_tax);

        sss_tax = new JTextField();
        sss_tax.setEditable(false);
        sss_tax.setColumns(10);
        sss_tax.setBounds(451, 128, 86, 20);
        contentPane.add(sss_tax);

        JLabel lblNewLabel_1_1_5_1 = new JLabel("Gross Salary:");
        lblNewLabel_1_1_5_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_5_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
        lblNewLabel_1_1_5_1.setBounds(571, 81, 121, 14);
        contentPane.add(lblNewLabel_1_1_5_1);

        JLabel lblNewLabel_1_1_5_2 = new JLabel("Deduction:");
        lblNewLabel_1_1_5_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_1_1_5_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
        lblNewLabel_1_1_5_2.setBounds(553, 106, 139, 14);
        contentPane.add(lblNewLabel_1_1_5_2);

        ttl_sal = new JTextField();
        ttl_sal.setEditable(false);
        ttl_sal.setColumns(10);
        ttl_sal.setBounds(702, 78, 86, 20);
        contentPane.add(ttl_sal);

        ttl_deduct = new JTextField();
        ttl_deduct.setEditable(false);
        ttl_deduct.setColumns(10);
        ttl_deduct.setBounds(702, 103, 86, 20);
        contentPane.add(ttl_deduct);

        JLabel lblNewLabel_2 = new JLabel("GROSS SALARY:");
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
        lblNewLabel_2.setBounds(24, 171, 132, 41);
        contentPane.add(lblNewLabel_2);

        gross_salary = new JTextField();
        gross_salary.setEditable(false);
        gross_salary.setColumns(10);
        gross_salary.setBounds(165, 182, 86, 20);
        contentPane.add(gross_salary);

        JLabel lblNewLabel_2_1 = new JLabel("TOTAL DEDUCTION:");
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
        lblNewLabel_2_1.setBounds(250, 171, 200, 41);
        contentPane.add(lblNewLabel_2_1);

        total_tax = new JTextField();
        total_tax.setEditable(false);
        total_tax.setColumns(10);
        total_tax.setBounds(451, 182, 86, 20);
        contentPane.add(total_tax);

        JLabel lblNewLabel_2_1_1 = new JLabel("NET SALARY:");
        lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
        lblNewLabel_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
        lblNewLabel_2_1_1.setBounds(560, 171, 132, 41);
        contentPane.add(lblNewLabel_2_1_1);

        net_salary = new JTextField();
        net_salary.setEditable(false);
        net_salary.setColumns(10);
        net_salary.setBounds(702, 182, 86, 20);
        contentPane.add(net_salary);

        JButton btnComputation = new JButton("Compute");

        btnComputation.addActionListener(new ActionListener() {
                                             public void actionPerformed(ActionEvent e) {
                                                 int rph = Integer.valueOf(rate.getText());
                                                 int hpd = Integer.valueOf(dailyHrs.getText());
                                                 int days = Integer.parseInt(workDays.getText());
                                                 int gross = rph * hpd * days;
                                                 String gross_sal = String.valueOf(gross);


                                                 int pritax = (int) (0.15*gross);
                                                 int philhealthtax =(int)(0.05*gross);
                                                 int ssstax =(int)(0.02*gross);
                                                 int ttltax = pritax + philhealthtax + ssstax;

                                                 int netsal = gross - ttltax;
                                                 String net_sal = String.valueOf(netsal);
                                                 String pri_tax = String.valueOf(pritax);
                                                 String philhealth = String.valueOf(philhealthtax);
                                                 String sss = String.valueOf(ssstax);
                                                 String ttl_tax = String.valueOf(ttltax);
                                                 gross_salary.setText(gross_sal);
                                                 main_tax.setText(pri_tax);
                                                 phil_tax.setText(philhealth);
                                                 sss_tax.setText(sss);
                                                 total_tax.setText(ttl_tax);
                                                 ttl_sal.setText(gross_sal);
                                                 ttl_deduct.setText(ttl_tax);
                                                 net_salary.setText(net_sal);

                                             }
                                         }

        );
        btnComputation.setBackground(new Color(2, 19, 2));
        btnComputation.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
        btnComputation.setForeground(new Color(255, 255, 255));
        btnComputation.setBounds(378, 236, 110, 30);
        contentPane.add(btnComputation);
    }
}
