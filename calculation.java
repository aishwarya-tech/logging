package interest;
import java.util.Scanner;
import java.lang.Math;
import java.io.FileDescriptor;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.util.logging.Logger;


public class calculation {

	private final static Logger logg = Logger.getLogger(calculation.class.getName());
	
	static
	{
		double prin,rate,time,output,raper;
		int ch;
		Scanner sc = new Scanner(System.in);
		
		PrintStream myOutput = new PrintStream(new FileOutputStream(FileDescriptor.out));
		
		logg.info("Hello Customer.. Enter your bank details:");
		
		myOutput.print("\n Enter the principal: ");
		prin = sc.nextDouble();
		myOutput.print("\n Enter the rate (in %): ");
		rate = sc.nextDouble();
		myOutput.print("\n Enter the time periods (in years): ");
		time = sc.nextDouble();
		
		myOutput.print("\n Select one option. 1. Simple Interest 2. Compound Interest : ");
		ch = sc.nextInt();
		
		switch(ch)
		{
		case 1 :
			myOutput.print("\nCalculating Simple Interset...");
			raper = (rate / 100);
			output = prin * raper * time;
			myOutput.print(output);
			break;
			
		case 2:
			myOutput.print("\n Calculating Compound Interest...\n1 ");
			raper = (rate / 100);
			output = prin * Math.pow(1+raper, time) - prin;
			myOutput.print(output);
			break;
			
		default:
			//myOutput.print("\n Invalid choice: ");
			logg.warning("INVALID CHOICE");
			break;
		}
		
		sc.close();
		myOutput.close();
	}

}
