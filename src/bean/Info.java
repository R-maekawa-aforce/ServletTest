package bean;

public class Info implements java.io.Serializable{

	private String name;
	private String company;
	private String mail;
	private String contact;
	private String[] info;
	private String yesNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String[] getInfo() {
		return info;
	}
	public void setInfo(String[] info) {
		this.info = info;
	}
	public String getYesNo() {
		return yesNo;
	}
	public void setYesNo(String or) {
		this.yesNo = or;
	}


}
