import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentsMarks {
    private JTextField txtsName;
    private JButton CLICKFORCALCULATEButton;
    private JTextField txtMaths;
    private JTextField txtPhysics;
    private JTextField txtChemistry;
    private JTextField txtTotal;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentsMarks");
        frame.setContentPane(new StudentsMarks().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JTextField txtAvg;
    private JTextField txtGrade;
    private JPanel Main;

    public StudentsMarks() {
    CLICKFORCALCULATEButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            int m,p,c, total, average;
            double Avg;




            m = Integer.parseInt(txtMaths.getText());
            c = Integer.parseInt(txtChemistry.getText());
            p =  Integer.parseInt(txtPhysics.getText());


            total  = m+p+c;

            txtTotal.setText(String.valueOf(total));

            average = ((m+p+c)/3);

            txtAvg.setText(String.valueOf(average));

//            criteria for grade
            if (average < 35){
                txtGrade.setText("Fail");
            }else if (average > 35){
                txtGrade.setText("Pass");
            }

//            criteria for average
            if (average < 35){
                txtAvg.setText(String.valueOf(average +": You are not qualify "));
//                txtAvg.setText("You are not qualify");
            }else {
                txtAvg.setText(String.valueOf(average));
            }

//            criteria for specific subject

            if (m < 35 || p < 35 || c < 35){
                txtGrade.setText("Fail");
            };

            if (m < 35 ){
                txtAvg.setText(String.valueOf(average +": You are fail"));
            };

            if (p < 35 ){
                txtAvg.setText(String.valueOf(average +": You are fail"));
            };

            if (c < 35 ){
                txtAvg.setText(String.valueOf(average +": You are fail"));
            };



        }
    });
}
}
