// Author: 				Monte Robbins
// Date Created: 		18/04/2016
// This program allows for the user to input the scores for each of the runs and then it calculates the average scores based on the rules.
// input:user, output:console

import java.util.Scanner;

public class stage1 {

	public static void main(String[] args) {
		double[] Run1 = new double[7];
		double[] Run2 = new double[7];
		double dRun1Max = 0, dRun1Min = 10, dRun2Max = 0, dRun2Min = 10, dRun1sum = 0, dRun2sum = 0, dRun1five = 0, dRun2five = 0, dRun1avg = 0, dRun2avg = 0;
		Scanner inConsole = new Scanner(System.in);
		
		
		for(int i=0; i<7; i++)
		{
			//Read scores for Run 1
			System.out.print("Enter score for Run1: ");
			Run1[i] = inConsole.nextDouble();
			if(dRun1Max < Run1[i])
			{
				dRun1Max=Run1[i];
			}
			if(dRun1Min > Run1[i])
			{
				dRun1Min=Run1[i];
			}
		}
		
		System.out.println("Highest Score is: ");
		System.out.println(dRun1Max);
		System.out.println("Lowest score is: ");
		System.out.println(dRun1Min);
		
		for(int i=0; i<7; i++)
		{
			//Read scores for Run 2
		System.out.print("Enter score for Run2: ");
			Run2[i] = inConsole.nextDouble();
			if(dRun2Max < Run2[i])
			{
				dRun2Max=Run2[i];
			}
			if(dRun2Min > Run2[i])
			{
				dRun2Min=Run2[i];
			}
		}
		System.out.println("Highest Score is: ");
		System.out.println(dRun2Max);
		System.out.println("Lowest score is: ");
		System.out.println(dRun2Min);
		
		for(int i =0; i<7; i++)
		{
		dRun1sum += Run1[i];
		dRun2sum += Run2[i];
		}
		dRun1five = dRun1sum - dRun1Max - dRun1Min;
		dRun2five = dRun2sum - dRun2Max - dRun2Min;
		
		dRun1avg = dRun1five/5;
		System.out.println("The average score for Run 1 is: ");
		System.out.println(dRun1avg);
		dRun2avg = dRun2five/5;
		System.out.println("The average score for Run 2 is: ");
		System.out.println(dRun2avg);
		
		if(dRun1avg > dRun2avg)
		{
			System.out.println("The Overall score is: ");
			System.out.println(dRun1avg);
		}else{
			System.out.println("The Overall score is: ");
			System.out.println(dRun2avg);
		}
	}

}
