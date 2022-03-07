package com.app.registration.model;
import java.util.Date;
import javax.persistence.*;



@Entity
@Table
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Product_name")
	private String name;
	
	@Column(name="description")
	private String desc;

	@Column(name = "Product_price")
    private String price;

	@Column(name = "created_at")
	private Date createdAt;
	
	@PrePersist
	public void addTimestamp() {
		createdAt =new Date();
	}

	public Long getId() {
		return id;
	}


	//getter and setter

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}




	//parameter constructor

	public Product(Long id, String name, String desc, String price) {
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	// @ManyToMany
	// private List<Category> category;

	
	public Product(){
		
	}
}