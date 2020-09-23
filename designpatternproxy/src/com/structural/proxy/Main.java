package com.structural.proxy;

public class Main {

	public static void main(String[] args) {
		
			CommandExecutor executor = new CommandExecutorProxy("Udhay", "Udhaya@123#");
			try {
				executor.runCommand("ipconfig");
				executor.runCommand("rmdir /s xxst:");
			} catch (Exception e) {
				System.out.println("Exception Message::"+e.getMessage());
			}
			
		}

	

}
