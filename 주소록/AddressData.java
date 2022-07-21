package 주소록;

public class AddressData implements Comparable{
	private String name="";
	private String phone="";
	private String email="";
	private static int type=1;//이름으로 검색
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddressData() {
		super();
		
	}
	public AddressData(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public AddressData(String key, int type) {
		super();
		AddressData.type = type;
		if(type==1)
			this.name = key;
		else if(type==2)
			this.phone = key;
		else
			this.email = key;
	}
	@Override
	public int hashCode() {
		if(type==1)
		{
			return this.name.hashCode();
		}
		else if(type==2)
			return this.phone.hashCode();
		else
			return this.email.hashCode();
		
	}
	@Override
	public boolean equals(Object obj) {
		AddressData ad = (AddressData)obj;
		if(type==1)
		{
			return name.equals(ad.name);
		}
		else if(type==2)
		{
			return phone.equals(ad.phone);
		}
		else
			return email.equals(ad.email);
		
	}
	@Override
	public String toString() {
		
		return String.format("%s\t%s\t%s",name,phone,email);
	}
	
	@Override
	public int compareTo(Object o) {
		AddressData ad = (AddressData)o;
		if(type==1)
			return -name.compareTo(ad.name);
		else if(type==2)
			return -phone.compareTo(ad.phone);
		else
			return -email.compareTo(ad.email);
	}
	
	public static void setType(int t)
	{
		type = t;
	}
	
	//1. getter/setter
	//2.생성자	--2번부터는 필수사항은 아니다.
	//3.toString
	//4.equals
	//5.hashCode
	//6.Comparable
	
}
