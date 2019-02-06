// Author: 				Monte Robbins
// Date Created: 		24/04/2016
// This program uses GUI to allow for easier user input of the scores of the Runs, and then calculates the total scores and the best score.
// input: user via GUI      output: GUI interface
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Stage2 {

	private JFrame frame;
	private JTextField AthletesName;
	private JTextField Judge1Run1;
	private JTextField Judge1Run2;
	private JTextField Judge2Run1;
	private JTextField Judge2Run2;
	private JTextField Judge3Run1;
	private JTextField Judge3Run2;
	private JTextField Judge4Run1;
	private JTextField Judge4Run2;
	private JTextField Judge5Run1;
	private JTextField Judge5Run2;
	private JTextField Judge6Run1;
	private JTextField Judge6Run2;
	private JTextField Judge7Run1;
	private JTextField Judge7Run2;
	private JTextField BestScore;
	private JTextField TotalRun1;
	private JTextField TotalRun2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stage2 window = new Stage2();
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
	public Stage2() {
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
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double[] Run1 = new double[7];
				double[] Run2 = new double[7];
				double dRun1Max = 0, dRun1Min = 10, dRun2Max = 0, dRun2Min = 10, dRun1sum = 0, dRun2sum = 0, dRun1five = 0, dRun2five = 0, dRun1avg = 0, dRun2avg = 0;
				try{
					//grabs the values that are input for the scores
					Run1[0]=Double.parseDouble(Judge1Run1.getText());
					Run1[1]=Double.parseDouble(Judge2Run1.getText());
					Run1[2]=Double.parseDouble(Judge3Run1.getText());
					Run1[3]=Double.parseDouble(Judge4Run1.getText());
					Run1[4]=Double.parseDouble(Judge5Run1.getText());
					Run1[5]=Double.parseDouble(Judge6Run1.getText());
					Run1[6]=Double.parseDouble(Judge7Run1.getText());
					Run2[0]=Double.parseDouble(Judge1Run2.getText());
					Run2[1]=Double.parseDouble(Judge2Run2.getText());
					Run2[2]=Double.parseDouble(Judge3Run2.getText());
					Run2[3]=Double.parseDouble(Judge4Run2.getText());
					Run2[4]=Double.parseDouble(Judge5Run2.getText());
					Run2[5]=Double.parseDouble(Judge6Run2.getText());
					Run2[6]=Double.parseDouble(Judge7Run2.getText());
					
					for(int i=0; i<7; i++)
					{//Finds the Minimum and Maximum Scores for Run1
						if(dRun1Max < Run1[i])
						{
							dRun1Max=Run1[i];
						}
						if(dRun1Min > Run1[i])
						{
							dRun1Min=Run1[i];
						}
					}
					for(int i=0; i<7; i++)
					{//Finds the Minimum and Maximum Scores for Run2
						if(dRun2Max < Run2[i])
						{
							dRun2Max=Run2[i];
						}
						if(dRun2Min > Run2[i])
						{
							dRun2Min=Run2[i];
						}
					}
					
					for(int i =0; i<7; i++)
					{
					dRun1sum += Run1[i];
					dRun2sum += Run2[i];
					}
					dRun1five = dRun1sum - dRun1Max - dRun1Min;
					dRun2five = dRun2sum - dRun2Max - dRun2Min;
					
					//outputs the totals and the best score
					
					dRun1avg = dRun1five/5;
					TotalRun1.setText(Double.toString(dRun1avg));
					dRun2avg = dRun2five/5;
					TotalRun2.setText(Double.toString(dRun2avg));
					
					if(dRun1avg > dRun2avg)
					{
						BestScore.setText(Double.toString(dRun1avg));
					}else{
						BestScore.setText(Double.toString(dRun2avg));
					}
				
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Please Enter a valid number");
				}
			}
		});
		btnCalculate.setBounds(219, 197, 89, 23);
		frame.getContentPane().add(btnCalculate);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); 	// Exit the application when user clicks on Quit button
			}
		});
		btnQuit.setBounds(335, 197, 89, 23);
		frame.getContentPane().add(btnQuit);
		
		JLabel lblNewLabel = new JLabel("Snowboard HalfPipe Scoring System");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(81, 11, 274, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblWinterOplympics = new JLabel("Winter Oplympics 2018 - Thredbo");
		lblWinterOplympics.setFont(new Font("Arial", Font.BOLD, 11));
		lblWinterOplympics.setBounds(81, 36, 223, 20);
		frame.getContentPane().add(lblWinterOplympics);
		
		AthletesName = new JTextField();
		AthletesName.setBounds(220, 61, 102, 20);
		frame.getContentPane().add(AthletesName);
		AthletesName.setColumns(10);
		
		JLabel lblAthletesName = new JLabel("Athlete's Name :");
		lblAthletesName.setBounds(101, 61, 101, 20);
		frame.getContentPane().add(lblAthletesName);
		
		Judge1Run1 = new JTextField();
		Judge1Run1.setBounds(59, 117, 41, 20);
		frame.getContentPane().add(Judge1Run1);
		Judge1Run1.setColumns(10);
		
		Judge1Run2 = new JTextField();
		Judge1Run2.setBounds(59, 148, 41, 20);
		frame.getContentPane().add(Judge1Run2);
		Judge1Run2.setColumns(10);
		
		Judge2Run1 = new JTextField();
		Judge2Run1.setBounds(110, 117, 41, 20);
		frame.getContentPane().add(Judge2Run1);
		Judge2Run1.setColumns(10);
		
		Judge2Run2 = new JTextField();
		Judge2Run2.setBounds(110, 148, 41, 20);
		frame.getContentPane().add(Judge2Run2);
		Judge2Run2.setColumns(10);
		
		Judge3Run1 = new JTextField();
		Judge3Run1.setBounds(161, 117, 41, 20);
		frame.getContentPane().add(Judge3Run1);
		Judge3Run1.setColumns(10);
		
		Judge3Run2 = new JTextField();
		Judge3Run2.setBounds(161, 148, 41, 20);
		frame.getContentPane().add(Judge3Run2);
		Judge3Run2.setColumns(10);
		
		Judge4Run1 = new JTextField();
		Judge4Run1.setBounds(209, 117, 41, 20);
		frame.getContentPane().add(Judge4Run1);
		Judge4Run1.setColumns(10);
		
		Judge4Run2 = new JTextField();
		Judge4Run2.setBounds(209, 148, 41, 20);
		frame.getContentPane().add(Judge4Run2);
		Judge4Run2.setColumns(10);
		
		Judge5Run1 = new JTextField();
		Judge5Run1.setBounds(263, 117, 41, 20);
		frame.getContentPane().add(Judge5Run1);
		Judge5Run1.setColumns(10);
		
		Judge5Run2 = new JTextField();
		Judge5Run2.setBounds(263, 148, 41, 20);
		frame.getContentPane().add(Judge5Run2);
		Judge5Run2.setColumns(10);
		
		Judge6Run1 = new JTextField();
		Judge6Run1.setBounds(314, 117, 41, 20);
		frame.getContentPane().add(Judge6Run1);
		Judge6Run1.setColumns(10);
		
		Judge6Run2 = new JTextField();
		Judge6Run2.setBounds(314, 148, 41, 20);
		frame.getContentPane().add(Judge6Run2);
		Judge6Run2.setColumns(10);
		
		Judge7Run1 = new JTextField();
		Judge7Run1.setBounds(365, 117, 41, 20);
		frame.getContentPane().add(Judge7Run1);
		Judge7Run1.setColumns(10);
		
		Judge7Run2 = new JTextField();
		Judge7Run2.setBounds(365, 148, 41, 20);
		frame.getContentPane().add(Judge7Run2);
		Judge7Run2.setColumns(10);
		
		JLabel lblJudge = new JLabel("Judge 1");
		lblJudge.setBounds(50, 89, 46, 14);
		frame.getContentPane().add(lblJudge);
		
		JLabel lblJudge_1 = new JLabel("Judge 2");
		lblJudge_1.setBounds(101, 89, 46, 14);
		frame.getContentPane().add(lblJudge_1);
		
		JLabel lblJudge_2 = new JLabel("Judge 3");
		lblJudge_2.setBounds(155, 89, 46, 14);
		frame.getContentPane().add(lblJudge_2);
		
		JLabel lblJudge_3 = new JLabel("Judge 4");
		lblJudge_3.setBounds(202, 89, 46, 14);
		frame.getContentPane().add(lblJudge_3);
		
		JLabel lblJudge_4 = new JLabel("Judge 5");
		lblJudge_4.setBounds(251, 89, 46, 14);
		frame.getContentPane().add(lblJudge_4);
		
		JLabel lblJudge_5 = new JLabel("Judge 6");
		lblJudge_5.setBounds(304, 89, 46, 14);
		frame.getContentPane().add(lblJudge_5);
		
		JLabel lblJudge_6 = new JLabel("Judge 7");
		lblJudge_6.setBounds(355, 89, 46, 14);
		frame.getContentPane().add(lblJudge_6);
		
		JLabel lblRun = new JLabel("Run 1 :");
		lblRun.setBounds(10, 120, 46, 14);
		frame.getContentPane().add(lblRun);
		
		JLabel lblRun_1 = new JLabel("Run 2 :");
		lblRun_1.setBounds(10, 151, 46, 14);
		frame.getContentPane().add(lblRun_1);
		
		JLabel lblBestScore = new JLabel("Best Score  :");
		lblBestScore.setBounds(23, 236, 86, 14);
		frame.getContentPane().add(lblBestScore);
		
		BestScore = new JTextField();
		BestScore.setBounds(105, 233, 46, 20);
		frame.getContentPane().add(BestScore);
		BestScore.setColumns(10);
		
		JLabel lblTotalRun = new JLabel("Total Run 1 :");
		lblTotalRun.setBounds(23, 186, 77, 14);
		frame.getContentPane().add(lblTotalRun);
		
		JLabel lblTotalRun_1 = new JLabel("Total Run 2 :");
		lblTotalRun_1.setBounds(23, 211, 77, 14);
		frame.getContentPane().add(lblTotalRun_1);
		
		TotalRun1 = new JTextField();
		TotalRun1.setBounds(105, 183, 46, 20);
		frame.getContentPane().add(TotalRun1);
		TotalRun1.setColumns(10);
		
		TotalRun2 = new JTextField();
		TotalRun2.setBounds(105, 208, 46, 20);
		frame.getContentPane().add(TotalRun2);
		TotalRun2.setColumns(10);
	}
}
