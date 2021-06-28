package com.api.backend.groovey.entity.product;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.api.backend.groovey.entity.user.Address;
import com.api.backend.groovey.entity.user.Cart;
import com.api.backend.groovey.entity.user.Favroit;
import com.api.backend.groovey.entity.user.UserOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	
	private String title;
	private String description;
	private String price;
	private String cuttedPrice;
	private String image;
	private String mainImage;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "product")
	private List<ProductImages> productImages;
	
	@ManyToOne
	private Cart cart;
	
	@ManyToOne
	private Favroit favroit;
	
	@ManyToOne
	private Address address;
	
	@ManyToOne
	private UserOrder userOrder;
	
}
