package com.app.registration.model;

import javax.persistence.*;


@Entity
@Table
public class Category {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "category_name")
	private String name;
	
	@Column(name="description")
	private String desc;

	public Long getId() {
		return id;
	}

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

	public Category(Long id, String name, String desc) {
		this.id = id;
		this.name = name;
		this.desc = desc;
	}
public Category(){

}
	
}