package com.lms;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class LMSImpl {

	static List<BookDetails> books = new ArrayList<BookDetails>();
	static List<Admin> student = new ArrayList<Admin>();
	static Map<Integer, ArrayList<BookIssueDetails>> hm = new HashMap<Integer, ArrayList<BookIssueDetails>>();

	public static void main(String[] args) {

		System.out.println("Library Management System");
		System.out.println("Press 1 to add Book");
		System.out.println("Press 2 to add Libraian Details");
		System.out.println("Press 3 to issue a book");
		System.out.println("Press 4 to return a book");
		System.out.println("Press 5 to print the Student details");
		System.out.println("Press 6 to print Book details");

		System.out.println("Press 7 to exit");
		Scanner c = new Scanner(System.in);
		int choice = c.nextInt();

		do {
			switch (choice) {
			case 1:
				addBook();
				break;
			case 2:
				addStudent();

				break;
			case 3:
				issueBook();

				break;
			case 4:
				returnBook();

				break;
			case 5:
				studentdetails();
				break;
			case 6:
				printBookDetails();
				break;
			case 7:
				System.exit(0);
			default:
				System.out.println("Invalid input");
				break;
			}
			c = new Scanner(System.in);
			choice = c.nextInt();
		} while (choice > 0 && choice < 10);
	}

	private static void studentdetails() {
		for (Admin a : student) {

			System.out.print(a.getStudentName() + " \n" + a.getStudentId() + "  \n" + a.getClassName());
		}

	}

	private static void printBookDetails() {
		for (BookDetails b : books) {
			System.out.print(" " + b.getBookNumber() + " \n " + b.getBookName() + "\n" + b.getPrice());
		}
	}

	private static void returnBook() {
		try {
			Scanner a = new Scanner(System.in);
			System.out.println("Enter studentId");
			int id = a.nextInt();
			System.out.println("Enter bookId");
			int bookId = a.nextInt();

		} catch (ArithmeticException e) {
			System.out.println("Try Again..");
		}
	}

	private static void issueBook() {

		Scanner c = new Scanner(System.in);
		System.out.println("Enter Student Id");
		int studentId = c.nextInt();
		Scanner c1 = new Scanner(System.in);
		System.out.println("Enter Booknumber");
		int bookNumber = c1.nextInt();
		Scanner c2 = new Scanner(System.in);
		System.out.println("Enter name");
		String name = c2.nextLine();

		Scanner c3 = new Scanner(System.in);
		System.out.println("Date:");
		String issueDate = c3.nextLine();
		BookIssueDetails newIssuedBook = new BookIssueDetails();
		newIssuedBook.setName(name);
		newIssuedBook.setBookNumer(bookNumber);

	}

	private static void addBook() {

		Scanner c = new Scanner(System.in);
		System.out.println("Enter Booknumber");
		int bookNumber = c.nextInt();
		System.out.println("Enter name");
		String name = c.next();
		System.out.println("Enter price");
		Double price = c.nextDouble();

		BookDetails book = new BookDetails(bookNumber, name, price);
		books.add(book);

	}

	private static void addStudent() {

		Scanner c = new Scanner(System.in);
		System.out.println("Enter Your name");
		String name = c.nextLine();
		System.out.println("Enter Your ID");
		int id = c.nextInt();
		System.out.println("Enter Class");
		String clas = c.next();

		Admin stud = new Admin(name, id, clas);

		student.add(stud);

	}

}
