package EmployeePayroll;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JInternalFrame;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

    private JPanel contentPane;
    private JTextField hourlySalary;
    private JTextField oneone;
    private JTextField twoone;
    private JTextField onetwo;
    private JTextField onethree;
    private JTextField onefour;
    private JTextField onefive;
    private JTextField onesix;
    private JTextField oneseven;
    private JTextField twotwo;
    private JTextField twothree;
    private JTextField twofour;
    private JTextField twofive;
    private JTextField twosix;
    private JTextField twoseven;
    private JTextField reghrs;
    private JTextField regamt;
    private JTextField overhrs;
    private JTextField overamt;
    private JTextField netpay;


     //Launch the application.
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

    //Create the frame.
    public MainFrame() {
        setTitle("Georgetown Cleaning Services - Employee Payroll");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 785, 435);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JSeparator separator = new JSeparator();
        separator.setBounds(173, 353, -140, -98);
        contentPane.add(separator);

        JLabel lblNewLabel = new JLabel("Employee Name:");
        lblNewLabel.setBounds(32, 52, 209, 27);
        contentPane.add(lblNewLabel);

        JLabel lblHourlySalary = new JLabel("Hourly Salary:");
        lblHourlySalary.setHorizontalAlignment(SwingConstants.RIGHT);
        lblHourlySalary.setBounds(373, 52, 95, 27);
        contentPane.add(lblHourlySalary);

        JTextField emp_name = new JTextField();
        emp_name.setBounds(151, 55, 212, 20);
        contentPane.add(emp_name);
        emp_name.setColumns(10);

        hourlySalary = new JTextField("");
        hourlySalary.setBounds(468, 55, 86, 20);
        contentPane.add(hourlySalary);
        hourlySalary.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("First Week :   ");
        lblNewLabel_1.setBounds(15, 152, 140, 20);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Second Week :  ");
        lblNewLabel_1_1.setBounds(15, 180, 140, 20);
        contentPane.add(lblNewLabel_1_1);

        JLabel lblNewLabel_2 = new JLabel("Monday");
        lblNewLabel_2.setBounds(105, 127, 77, 14);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Tuesday");
        lblNewLabel_2_1.setBounds(192, 127, 76, 14);
        contentPane.add(lblNewLabel_2_1);

        JLabel lblNewLabel_2_2 = new JLabel("Wednesday");
        lblNewLabel_2_2.setBounds(278, 127, 85, 14);
        contentPane.add(lblNewLabel_2_2);

        JLabel lblNewLabel_2_3 = new JLabel("Thursday");
        lblNewLabel_2_3.setBounds(368, 127, 78, 14);
        contentPane.add(lblNewLabel_2_3);

        JLabel lblNewLabel_2_4 = new JLabel("Friday");
        lblNewLabel_2_4.setBounds(456, 127, 78, 14);
        contentPane.add(lblNewLabel_2_4);

        JLabel lblNewLabel_2_5 = new JLabel("Saturday");
        lblNewLabel_2_5.setBounds(544, 127, 78, 14);
        contentPane.add(lblNewLabel_2_5);

        JLabel lblNewLabel_2_6 = new JLabel("Sunday");
        lblNewLabel_2_6.setBounds(632, 127, 78, 14);
        contentPane.add(lblNewLabel_2_6);

        oneone = new JTextField("");
        oneone.setBounds(110, 152, 77, 20);
        contentPane.add(oneone);
        oneone.setColumns(10);

        twoone = new JTextField("");
        twoone.setColumns(10);
        twoone.setBounds(104, 180, 78, 20);
        contentPane.add(twoone);

        onetwo = new JTextField("");
        onetwo.setColumns(10);
        onetwo.setBounds(192, 152, 78, 20);
        contentPane.add(onetwo);

        onethree = new JTextField("");
        onethree.setColumns(10);
        onethree.setBounds(280, 152, 83, 20);
        contentPane.add(onethree);

        onefour = new JTextField("");
        onefour.setColumns(10);
        onefour.setBounds(368, 152, 78, 20);
        contentPane.add(onefour);

        onefive = new JTextField("");
        onefive.setColumns(10);
        onefive.setBounds(456, 152, 78, 20);
        contentPane.add(onefive);

        onesix = new JTextField("");
        onesix.setColumns(10);
        onesix.setBounds(547, 152, 76, 20);
        contentPane.add(onesix);

        oneseven = new JTextField("");
        oneseven.setColumns(10);
        oneseven.setBounds(632, 152, 78, 20);
        contentPane.add(oneseven);

        twotwo = new JTextField("");
        twotwo.setColumns(10);
        twotwo.setBounds(200, 180, 78, 20);
        contentPane.add(twotwo);

        twothree = new JTextField("");
        twothree.setColumns(10);
        twothree.setBounds(280, 180, 83, 20);
        contentPane.add(twothree);

        twofour = new JTextField("");
        twofour.setColumns(10);
        twofour.setBounds(368, 180, 78, 20);
        contentPane.add(twofour);

        twofive = new JTextField("");
        twofive.setColumns(10);
        twofive.setBounds(456, 180, 77, 20);
        contentPane.add(twofive);

        twosix = new JTextField("");
        twosix.setColumns(10);
        twosix.setBounds(547, 180, 75, 20);
        contentPane.add(twosix);

        twoseven = new JTextField("");
        twoseven.setColumns(10);
        twoseven.setBounds(632, 180, 78, 20);
        contentPane.add(twoseven);

        reghrs = new JTextField("");
        reghrs.setEditable(false);
        reghrs.setColumns(10);
        reghrs.setBounds(270, 296, 78, 20);
        contentPane.add(reghrs);

        regamt = new JTextField("");
        regamt.setEditable(false);
        regamt.setColumns(10);
        regamt.setBounds(358, 296, 78, 20);
        contentPane.add(regamt);

        overhrs = new JTextField("");
        overhrs.setEditable(false);
        overhrs.setColumns(10);
        overhrs.setBounds(270, 327, 78, 20);
        contentPane.add(overhrs);

        overamt = new JTextField("");
        overamt.setEditable(false);
        overamt.setColumns(10);
        overamt.setBounds(358, 327, 78, 20);
        contentPane.add(overamt);

        JLabel lblNewLabel_3 = new JLabel("Hours");
        lblNewLabel_3.setBounds(270, 275, 46, 14);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_3_1 = new JLabel("Amount");
        lblNewLabel_3_1.setBounds(358, 275, 46, 14);
        contentPane.add(lblNewLabel_3_1);

        JLabel lblNewLabel_4 = new JLabel("Regular:");
        lblNewLabel_4.setBounds(199, 308, 61, 14);
        contentPane.add(lblNewLabel_4);

        JLabel lblNewLabel_4_1 = new JLabel("Overtime:");
        lblNewLabel_4_1.setBounds(199, 333, 61, 14);
        contentPane.add(lblNewLabel_4_1);

        netpay = new JTextField("");
        netpay.setEditable(false);
        netpay.setColumns(10);
        netpay.setBounds(534, 296, 78, 20);
        contentPane.add(netpay);

        JLabel lblNewLabel_5 = new JLabel("Net Pay:");
        lblNewLabel_5.setBounds(468, 296, 56, 20);
        contentPane.add(lblNewLabel_5);

        JButton btnProcess = new JButton("Process It");
        btnProcess.addActionListener(new ActionListener() {
                                         public void actionPerformed(ActionEvent e) {
                                             int reg_hrs = 8;

                                             double hour_sal = Double.valueOf(hourlySalary.getText());

                                             double m1 = Double.valueOf(oneone.getText());
                                             double t1 = Double.valueOf(onetwo.getText());
                                             double w1 = Double.valueOf(onethree.getText());
                                             double th1 = Double.valueOf(onefour.getText());
                                             double f1 = Double.valueOf(onefive.getText());
                                             double sat1 = Double.valueOf(onesix.getText());
                                             double sun1 = Double.valueOf(oneseven.getText());

                                             double m2 = Double.valueOf(twoone.getText());
                                             double t2 = Double.valueOf(twotwo.getText());
                                             double w2 = Double.valueOf(twothree.getText());
                                             double th2 = Double.valueOf(twofour.getText());
                                             double f2 = Double.valueOf(twofive.getText());
                                             double sat2 = Double.valueOf(twosix.getText());
                                             double sun2 = Double.valueOf(twoseven.getText());

                                             //overtime variables
                                             double regm1, regt1, regw1, regth1, regf1, regsat1, regsun1, regm2, regt2, regw2, regth2, regf2, regsat2, regsun2;
                                             if (m1>reg_hrs) {
                                                 regm1 = m1 - reg_hrs;
                                             }else {
                                                 regm1 = 0.0;
                                             }
                                             if(t1>reg_hrs) {
                                                 regt1 = t1 - reg_hrs;
                                             }else {
                                                 regt1 = 0.0;
                                             }
                                             if(w1>reg_hrs) {
                                                 regw1 = w1 - reg_hrs;
                                             }else {
                                                 regw1 = 0.0;
                                             }
                                             if(th1>reg_hrs) {
                                                 regth1 = th1 - reg_hrs;
                                             }else {
                                                 regth1 = 0.0;
                                             }
                                             if(f1>reg_hrs) {
                                                 regf1 = f1 - reg_hrs;
                                             }else {
                                                 regf1 = 0.0;
                                             }
                                             if(sat1>reg_hrs) {
                                                 regsat1 = sat1 - reg_hrs;
                                             }else {
                                                 regsat1 = 0.0;
                                             }
                                             if(sun1>reg_hrs) {
                                                 regsun1 = sun1 - reg_hrs;
                                             }else {
                                                 regsun1 = 0.0;
                                             }

                                             if(m2>reg_hrs) {
                                                 regm2 = m2 - reg_hrs;
                                             }else {
                                                 regm2 = 0.0;
                                             }
                                             if(t2>reg_hrs) {
                                                 regt2 = t2 - reg_hrs;
                                             }else {
                                                 regt2 = 0.0;
                                             }
                                             if(w2>reg_hrs) {
                                                 regw2 = w2 - reg_hrs;
                                             }else {
                                                 regw2 = 0.0;
                                             }
                                             if(th2>reg_hrs) {
                                                 regth2 = th2 - reg_hrs;
                                             }else {
                                                 regth2 = 0.0;
                                             }
                                             if(f2>reg_hrs) {
                                                 regf2 = f2 - reg_hrs;
                                             }else {
                                                 regf2 = 0.0;
                                             }
                                             if(sat2>reg_hrs) {
                                                 regsat2 = sat2 - reg_hrs;
                                             }else {
                                                 regsat2 = 0.0;
                                             }
                                             if(sun2>reg_hrs) {
                                                 regsun2 = sun2 - reg_hrs;
                                             }else {
                                                 regsun2 = 0.0;
                                             }

                                             double ttl_time = (m1 + t1 + w1 + th1 + f1 +sat1 + sun1 + m2 + t2 + w2 + th2 + f2 + sat2 + sun2 );
                                             double ttl_otime = (regm1 + regt1 + regw1 + regth1 + regf1 + regsat1 + regsun1 + regm2 + regt2 + regw2 + regth2 + regf2 + regsat2 + regsun2);
                                             double ttl_regtime = (ttl_time - ttl_otime);
                                             double ttl_reg_pay = (ttl_regtime * hour_sal);
                                             double ttl_otime_pay = (ttl_otime * hour_sal);
                                             float net_pay = (float) (ttl_reg_pay + ttl_otime_pay);


                                             reghrs.setText(String.valueOf(ttl_regtime));
                                             overhrs.setText(String.valueOf(ttl_otime));
                                             regamt.setText(String.valueOf(ttl_reg_pay));
                                             overamt.setText(String.valueOf(ttl_otime_pay));
                                             netpay.setText(String.valueOf(net_pay));
                                         }
        }
        );
        btnProcess.setBounds(71, 280, 102, 52);
        contentPane.add(btnProcess);

        JButton btnClose = new JButton("Close");
        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnClose.setBounds(632, 280, 89, 52);
        contentPane.add(btnClose);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Employee Identification"));
        panel.setBounds(10, 16, 836, 78);
        contentPane.add(panel);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(BorderFactory.createTitledBorder("Payroll Processing"));
        panel_2.setBounds(10, 252, 836, 133);
        contentPane.add(panel_2);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(BorderFactory.createTitledBorder("Time Sheet"));
        panel_1.setBounds(10, 101, 836, 150);
        contentPane.add(panel_1);
    }
}
