package main.java.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Random;

public class Utility {

	public static double getRandomDouble() {
		Random rd = new Random();
		double random = rd.nextDouble();
		return random;
	}

	public static int getRandomInt(int n) {
		Random rd = new Random();
		int random = rd.nextInt(n);
		return random;
	}

	public static void enterArrayInt(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = InputScanner.readInt();
		}
	}

	public static void enter2DArrayInt(int[][] arr, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				try {
					arr[i][j] = InputScanner.readInt();
				} catch (InputMismatchException e) {
					 InputScanner.nextLine();
					System.out.println("invalid data : " + "\nenter the data again :");
					j--;
				}
			}
		}
	}

	public static void enter2DArrayDouble(double[][] arr, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				try {
					arr[i][j] = InputScanner.readDouble();
				} catch (InputMismatchException e) {
					InputScanner.nextLine();
					System.out.println("invalid data : " + "\nenter the data again :");
					j--;
				}

			}
		}
	}

	public static void enter2DArrayBoolean(boolean[][] arr, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				try {
					arr[i][j] = InputScanner.readBoolean();
				} catch (InputMismatchException e) {
					InputScanner.nextLine();
					System.out.println("invalid data : " + "\nenter the data again :");
					j--;
				}

			}
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void enterDistinctArrayInt(int[] arr) {
		boolean duplicate = false;
		int data = 0;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			duplicate = false;
			try {
				data = InputScanner.readInt();
			} catch (InputMismatchException e) {
				InputScanner.nextLine();
				System.out.println("invalid entry : " + e);
				System.out.println("enter the data again");
				i--;
				continue;
			}

			for (j = 0; j <= i; j++) {
				if (arr[j] == data) {
					duplicate = true;
					break;
				}
			}
			if (duplicate == true) {
				System.out.print("duplicate number enter distinct number : ");
				i--;
				continue;
			} else {
				arr[i] = data;
			}

		}
	}

	public static void print2DArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}

//bubble sort
	public static void doBubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
//bubble sort end

//insertion sort starts

	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0) {
				if (arr[j] > key) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
				j--;
			}
			arr[j + 1] = key;
		}
	}
//insertion sort ends

//write a sentence into file
	public static void writeLineIntoFilePW(String filename) throws IOException {
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		String s = "";
		System.out.println("enter the word to write in file : ");
		s = InputScanner.readString();
		pw.println(s);

		pw.flush();
		pw.close();
	}

//read a single line from given file using PrintWriter
	public static String readlineFromFile(String filename) throws IOException {
		File file = new File(filename);
		if (!file.exists()) {
			System.out.println("file doesnot exist");
			return null;
		}
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		line = br.readLine();
		System.out.println("line  : " + line);

		br.close();
		return line;
	}

//sort a given string array using bubble sort
	public static void sortStringArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static boolean isPrimeNumber(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
