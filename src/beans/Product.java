package beans;

public class Product {
	private String name;
	private String description;
	private String image;
	private int id;
	private double price;
	private int quantite;
	private String category;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String description, String image, int id,
			double price, int quantite, String category) {
		super();
		this.name = name;
		this.description = description;
		this.image = image;
		this.id = id;
		this.price = price;
		this.quantite = quantite;
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description
				+ ", image=" + image + ", id=" + id + ", price=" + price
				+ ", quantite=" + quantite + ", category=" + category + "]";
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	
	
}
