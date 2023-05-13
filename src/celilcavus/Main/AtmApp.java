package celilcavus.Main;

import java.util.Scanner;

import celicavus.Repository.CustomerRepository;
import celilcavus.Entitys.Customer;

public class AtmApp {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		CustomerRepository rep = new CustomerRepository();
		Customer custom = new Customer();
		/*
		 * custom.setName(""); custom.setLastName("Çavuş"); custom.setTc("123456");
		 * custom.setTelNo("1234567"); custom.setBakiye(3500.0); rep.Add(custom);
		 */

		while (true) {
			System.out.println("========= Atm Sistemine Hoşgeldiniz.. =========");
			System.out.println("1-Müşterileri Listele");
			System.out.println("2-Müşteri EKle");
			System.out.println("3-Müşteri Sil");
			System.out.println("4-Müşteri Güncelle");
			System.out.println("5-Çıkış");
			System.out.println("Seçiminiz :");
			int number = scan.nextInt();

			switch (number) {
			case 1: {
				for (Customer item : rep.GetAll()) {
					String customer = "ID = " + item.getId() + " " + item.getName() + "Name = " + item.getLastName()
							+ "LastName = " + item.getTc() + "Telefon = " + item.getTelNo() + "Bakiye = "
							+ item.getBakiye() + "Adres = " + item.getAdress() + "Oluşturulma Tarihi = "
							+ item.getCreate_date() + "Son Güncelleme Tarihi = " + item.getUpdate_date();
					System.out.println(customer);

				}
			}
			case 2: {
				System.out.println("Müşteri Adi * : ");
				String customerName = scan.nextLine();
				System.out.println("Müşteri Soyadi* : ");
				String customerLastName = scan.nextLine();
				System.out.println("Müşteri Tc* : ");
				String customerTc = scan.nextLine();
				System.out.println("Müşteri Tel No* : ");
				String customerPhoneNumber = scan.nextLine();
				System.out.println("Müşteri Adress* : ");
				String customerAdress = scan.nextLine();

				System.out.println("Müşteri Atm no");
				String customerAtmNo = scan.nextLine();

				System.out.println("Müşteri Bakiye : ");
				double customerPrice = scan.nextDouble();

				custom.setName(customerName);
				custom.setLastName(customerLastName);
				custom.setTc(customerTc);
				custom.setTelNo(customerPhoneNumber);
				custom.setAdress(customerAdress);
				custom.setAtmNo(customerAtmNo);
				custom.setBakiye(customerPrice);
				rep.Add(custom);
			}
			case 3: {
				for (Customer item : rep.GetAll()) {
					String customer = "ID = " + item.getId() + " " + item.getName() + "Name = " + item.getLastName()
							+ "LastName = " + item.getTc() + "Telefon = " + item.getTelNo() + "Bakiye = "
							+ item.getBakiye() + "Adres = " + item.getAdress() + "Oluşturulma Tarihi = "
							+ item.getCreate_date() + "Son Güncelleme Tarihi = " + item.getUpdate_date();
					System.out.println(customer);

				}

				System.out.println("================================");
				System.out.println("Lütfen Müşteri Id giriniz : ");
				int customerId = scan.nextInt();
				Customer cs = rep.GetById(customerId);
				rep.Delete(cs);
			}

			case 4: {
				for (Customer item : rep.GetAll()) {
					String customer = "ID = " + item.getId() + " " + item.getName() + "Name = " + item.getLastName()
							+ "LastName = " + item.getTc() + "Telefon = " + item.getTelNo() + "Bakiye = "
							+ item.getBakiye() + "Adres = " + item.getAdress() + "Oluşturulma Tarihi = "
							+ item.getCreate_date() + "Son Güncelleme Tarihi = " + item.getUpdate_date();
						System.out.println(customer);
				}
				System.out.println("================================");
				System.out.println("Lütfen Müşteri Id giriniz : ");
				int customerId = scan.nextInt();
				Customer cs = rep.GetById(customerId);

				System.out.println("Müşteri Adi * : ");
				String customerName = scan.nextLine();
				System.out.println("Müşteri Soyadi* : ");
				String customerLastName = scan.nextLine();
				System.out.println("Müşteri Tc* : ");
				String customerTc = scan.nextLine();
				System.out.println("Müşteri Tel No* : ");
				String customerPhoneNumber = scan.nextLine();
				System.out.println("Müşteri Adress* : ");
				String customerAdress = scan.nextLine();

				System.out.println("Müşteri Atm no");
				String customerAtmNo = scan.nextLine();

				System.out.println("Müşteri Bakiye : ");
				double customerPrice = scan.nextDouble();

				cs.setId(customerId);
				cs.setName(customerName);
				cs.setLastName(customerLastName);
				cs.setTc(customerTc);
				cs.setTelNo(customerPhoneNumber);
				cs.setAdress(customerAdress);
				cs.setAtmNo(customerAtmNo);
				cs.setBakiye(customerPrice);
				rep.Update(cs);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + number);
			}
		}

	}

}
