
public class Invoice {
	
	private String partNo;//instance variable
	private String partDesc;//instance variable
	private int quanity;//instance variable
	private double price;//instance variable
	
	public Invoice(String partNo, String partDesc,int quanity,double price)
	{
		super();
		this.partNo = partNo;
		this.partDesc = partDesc;
		this.quanity = quanity;
		this.price = price;
	}
	public void setPartNo(String partNo)
	{
		this.partNo = partNo;
	}
	
	public String getpartNo()
	{
		return partNo;
    }
	
	public void setPartDesc(String partDesc)
	{
		this.partDesc = partDesc;
	}
	
	public String getpartDesc()
	{
		return partDesc;
	}
	
	public void setquanity(int quanity)
	{
		this.quanity = quanity;
	}
	
	public int getquanity()
	{
		return quanity;
	}
	
	public void setprice(double price)
	{
		this.price = price;
	}
	
	public double getprice()
	{
		return price;
	}
	
	public double getInvoiceAmount()
	{
		if (this.quanity < 0)
			this.quanity = 0;
		
		else this.quanity = 0;
			
		if(this.price < 0.0)
			this.price = 0.0;
		
		else this.price = 0.0;
		
		return (quanity * price);
	}
}
