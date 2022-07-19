package 상속;

public class PhoneSale {
	public void selePhone(CellPhone phone)
	{
		if(phone instanceof DmbCellPhone)
		{
			System.out.println(phone.model + "이 팔렸음");
			
		}
		else
			System.out.println("Cellphone 팔림");
			
	}

}
