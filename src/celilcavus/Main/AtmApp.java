package celilcavus.Main;

import java.util.Scanner;

import celicavus.Repository.CustomerRepository;
import celilcavus.Entitys.Customer;

public class AtmApp {

	public static void main(String[] args) throws Exception {
		//Scanner scan = new Scanner(System.in);
		//String Name = scan.nextLine();
		
		CustomerRepository rep = new CustomerRepository();
		/*
		Customer custom = new Customer();
		custom.setName("");
		custom.setLastName("Çavuş");
		custom.setTc("123456");
		custom.setTelNo("1234567");
		custom.setBakiye(3500.0);
		rep.Add(custom);
		*/
		for (Customer item : rep.GetAll()) {
			String customer = 
					item.getName() + 
					"Name = " + item.getLastName() +
					"LastName = " + item.getTc() + 
					"Telefon = " + item.getTelNo() +
					"Bakiye = " + item.getBakiye() +
					"Adres = " + item.getAdress() + 
					"Oluşturulma Tarihi = " + item.getCreate_date() + 
					"Son Güncelleme Tarihi = " + item.getUpdate_date();
					 System.out.println(customer);
		}
		


	}

}
