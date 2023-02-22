package project;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hospital_Appointment_Booking {
		  static Scanner input = new Scanner(System.in);
		    static Map<String, List<String>> appointments = new HashMap<String, List<String>>();
		

	public static void main(String[] args) {
		String months[] = {
	            "Jan",
	            "Feb",
	            "Mar",
	            "Apr",
	            "May",
	            "Jun",
	            "Jul",
	            "Aug",
	            "Sep",
	            "Oct",
	            "Nov",
	            "Dec"
		};
		 Calendar calendar = Calendar.getInstance();
	        //System.out.println("--------------------------------------------------------------------------------");
	        int count1 = 4, count2 = 4, count3 = 4;
	        System.out.println("\n--------------------------------------------------------------------------------");
	        System.out.println("            * Welcome to Appiontment Booking System Project in Java *");
	        System.out.println("--------------------------------------------------------------------------------");
	        
	        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
	        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
	        /*doctor[] d = new doctor[25];
	        patient[] p = new patient[100];*/
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("                         -:-:-:-:-:WELCOME TO RUBY HOSPITAL:-:-:-:-:-               ");
		System.out.println("                                 ");


		  System.out.println("Welcome to the hospital appointment booking program!");
	        while (true) {
	            System.out.println("\nPlease choose an option:\n1. Book an appointment\n2. View appointments\n3. Cancel an appointment\n4. Exit");
	            int option = input.nextInt();
	            input.nextLine();
	            switch (option) {
	                case 1:
	                    bookAppointment();
	                    break;
	                case 2:
	                    viewAppointments();
	                    break;
	                case 3:
	                    cancelAppointment();
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the program. Goodbye!");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid option. Please choose again.");
	            }
	        }
	    }
	
	   public static void bookAppointment() {
	        System.out.println("\nPlease enter the patient's name:");
	        String patientName = input.nextLine();
	        System.out.println("Please enter the appointment date (DD/MM/YYYY):");
	        String appointmentDate = input.nextLine();
	        List<String> appointmentsList = appointments.get(appointmentDate);
	        if (appointmentsList == null) {
	            appointmentsList = new ArrayList<String>();
	            appointments.put(appointmentDate, appointmentsList);
	        }
	        appointmentsList.add(patientName);
	        System.out.println("Appointment booked successfully for " + patientName + " on " + appointmentDate + ".");
	    }
	   public static void viewAppointments() {
	        System.out.println("\nPlease enter the appointment date (DD/MM/YYYY):");
	        String appointmentDate = input.nextLine();
	        List<String> appointmentsList = appointments.get(appointmentDate);
	        if (appointmentsList == null) {
	            System.out.println("No appointments booked on " + appointmentDate + ".");
	            return;
	        }
	        System.out.println("Appointments booked on " + appointmentDate + ":");
	        for (String patientName : appointmentsList) {
	            System.out.println(patientName);
	        }
	    }
	    
	    public static void cancelAppointment() {
	        System.out.println("\nPlease enter the appointment date (DD/MM/YYYY):");
	        String appointmentDate = input.nextLine();
	        List<String> appointmentsList = appointments.get(appointmentDate);
	        if (appointmentsList == null) {
	            System.out.println("No appointments booked on " + appointmentDate + ".");
	            return;
	        }
	        System.out.println("Please enter the patient's name:");
	        String patientName = input.nextLine();
	        boolean removed = appointmentsList.remove(patientName);
	        if (removed) {
	            System.out.println("Appointment cancelled successfully for " + patientName + " on " + appointmentDate + ".");
	        } else {
	            System.out.println("Appointment not found for " + patientName + " on " + appointmentDate + ".");
	        }
	    }
	}
	    
	


