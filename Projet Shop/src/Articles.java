
public class Articles {
	private int IdArticles ;
	private String Description ;
	private String Brand ;
	private float UnitaryPrice ;
	
	private static int agInstance = 0;
	
	public Articles (int Id , String Description, String Brand, float UnitaryPrice) {
		super();
		this.IdArticles = Id ;
		this.Description = Description ;
		this.Brand = Brand ;
		this.UnitaryPrice = UnitaryPrice ;
		agInstance++;
	}
	}


