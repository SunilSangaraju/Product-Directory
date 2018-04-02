import java.util.Date;

public class Product{

       private Integer number;

       private String name;

       private String category;

       private Date expiryDate;

       public Product(Integer number, String name, String category, Date expiryDate) {
		super();
		this.number = number;
		this.name = name;
		this.category = category;
		this.expiryDate = expiryDate;
	}

    public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
       public String toString(){
              return number + ", " +name + ", "+category+", "+expiryDate;
       }

}