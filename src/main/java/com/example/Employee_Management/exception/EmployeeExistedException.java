package com.example.Employee_Management.exception;

public class EmployeeExistedException extends RuntimeException {

		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public EmployeeExistedException() {
	        super("Employee already existed in database");
	}

	}


