package com.bmpl.CarRental.model;

import java.time.LocalDate;

public class BookingStatus {

	private String customerName;
	private long customerPhoneNo;
	private LocalDate issueDate;
	private LocalDate returnDate;
	
	public BookingStatus(String customerName, long customerPhoneNo, LocalDate issueDate, LocalDate returnDate) {
		this.customerName = customerName;
		this.customerPhoneNo = customerPhoneNo;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(long customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	public static void main(String[] args) {
//		Car car = new Car();
//		car.getModel();
	}
	
	
}
