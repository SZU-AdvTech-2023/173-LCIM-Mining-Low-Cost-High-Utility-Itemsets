package com.enzochen.LCIM;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;


public class MainTestLCIM {

	public static void main(String [] arg) throws IOException{
//		fileToPath("DB_cost.txt");
		String input = "D:\\Programming\\IDEAprojects\\studyjava\\src\\com\\enzochen\\LCIM\\DB_cost.txt";
		String output = ".//output.txt";

		double minutil = 10d;  
		double maxcost = 10d;  
		double minsup = 0.1d; // which means 40 % of the database size.
		
		// Applying the  algorithm
		AlgoLCIM algorithm = new AlgoLCIM();
		algorithm.runAlgorithm(input, output, minutil, maxcost, minsup);
		algorithm.printStats();
		///Simple algorithm
		SimpleLCIM simpleLCIM = new SimpleLCIM();
		simpleLCIM.runAlgorithm(input, output, minutil, maxcost, minsup);
		simpleLCIM.printStats();

		input ="D:\\Programming\\IDEAprojects\\studyjava\\src\\com\\enzochen\\LCIM\\random.txt";
		output = ".//outputrandom.txt";
		// Applying the  algorithm
		algorithm.runAlgorithm(input, output, minutil, maxcost, minsup);
		algorithm.printStats();
		///Simple algorithm
		simpleLCIM.runAlgorithm(input, output, minutil, maxcost, minsup);
		simpleLCIM.printStats();

		input ="D:\\Programming\\IDEAprojects\\studyjava\\src\\com\\enzochen\\LCIM\\mushroom.txt";
		output = ".//outputmushroom.txt";
		// Applying the  algorithm
		algorithm.runAlgorithm(input, output, minutil, maxcost, minsup);
		algorithm.printStats();
		///Simple algorithm
		simpleLCIM.runAlgorithm(input, output, minutil, maxcost, minsup);
		simpleLCIM.printStats();


	}

	public static String fileToPath(String filename) throws UnsupportedEncodingException{
		URL url = MainTestLCIM.class.getResource(filename);
		return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
	}
}
