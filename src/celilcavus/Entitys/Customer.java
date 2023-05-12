package celilcavus.Entitys;

public class Customer extends BaseCustomer {

	public String AtmNo;
	public double Bakiye = 0.0;
	public int Id;
	public String create_date;
	public String update_date;
	
	
	public String getCreate_date() {
		return create_date;
	}

	public String getUpdate_date() {
		return update_date;
	}


	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getAtmNo() {
		return AtmNo;
	}

	public void setAtmNo(String atmNo) throws Exception {
		if (!atmNo.matches("") && atmNo.length() == 11) {
			AtmNo = atmNo;
		} else {
			throw new Exception("Atm No Boş Olamaz");
		}
	}

	public double getBakiye() {
		return Bakiye;
	}

	public void setBakiye(double bakiye) {
		if (bakiye != 0.0 || bakiye <= 0.0) {
			Bakiye = bakiye;
		} else {
			Bakiye = 0.0;
		}
	}

}
