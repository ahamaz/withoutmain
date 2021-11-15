package firstProject;

import firstProject.service.MessageService;

public class HelloWorld {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageService messageService = new MessageService();
		System.out.println(messageService.getMessage());
	}
	
}
