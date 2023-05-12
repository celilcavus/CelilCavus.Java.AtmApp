package celilcavus.Entitys;

public class BaseCustomer {

	public String Name;
	public String LastName;
	public String Tc;
	public String TelNo;
	public String Adress;

	public String getName() {
		return Name;
	}

	public void setName(String name) throws Exception {
		if (!name.matches("")) {
			Name = name;
		} else {
			throw new Exception("Ad Ad alani bos olamaz");
		}

	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) throws Exception {
		if (!lastName.matches("")) {
			LastName = lastName;
		} else {
			throw new Exception("Soyisim Alani Bos Olamaz.");
		}

	}

	public String getTc() throws Exception {
		return Tc;
	}

	public void setTc(String tc) throws Exception {
		if (!tc.matches("") && tc.length() == 11) {
			Tc = tc;
		} else {
			throw new Exception("Tc bos olamaz veya 11 haneli olmalidir. !!");
		}
	}

	public String getTelNo() {
		return TelNo;
	}

	public void setTelNo(String telNo) throws Exception {
		if (!telNo.matches("") && telNo.length() == 11) {
			TelNo = telNo;
		} else {
			throw new Exception("Telefon no bos olamaz veya 11 haneli olmalidir. !!");
		}
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) throws Exception {
		if (!adress.matches("")) {
			Adress = adress;
		} else {
			throw new Exception("Adres Alani Bos Olamaz.!");
		}
	}
}
