package tn.esprit.spring.entities;

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Product;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;


@Entity
public class CommentProduct implements Serializable {
	
	public CommentProduct(float rate, String content) {
		super();
		this.rate = rate;
		this.content = content;
	}




	private static final long serialVersionUID = 1L;
	
	
	
public int idc;
public int indp;







	public CommentProduct(int idc, int indp, float rate, String content, Client client, Date date1, Product product,
		CommentProductId commentproductid) {
	super();
	this.idc = idc;
	this.indp = indp;
	this.rate = rate;
	this.content = content;
	this.client = client;
	this.date1 = date1;
	this.product = product;
	this.commentproductid = commentproductid;
}




	public int getIdc( CommentProductId commentproductid) {
	return commentproductid.getIdClient();
}




public void setIdc(int idc) {
	this.idc = idc;
}




public int getIndp( CommentProductId commentproductid) {
	return commentproductid.getIdProduct();
}




public void setIndp(int indp) {
	this.indp = indp;
}




public Date getDate1(CommentProductId commentproductid) {
	return commentproductid.getDate();
}




public void setDate1(Date date1) {
	this.date1 = date1;
}




	public CommentProduct(float rate, String content, Client client, Product product,
			CommentProductId commentproductid) {
		super();
		this.rate = rate;
		this.content = content;
		this.client = client;
		this.product = product;
		this.commentproductid = commentproductid;
	}
	
	


	public CommentProduct(float rate, String content, Client client, Product product) {
		super();
		this.rate = rate;
		this.content = content;
		this.client = client;
		this.product = product;
	}




	private float rate;
	private String content;

	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false, name ="idClient",referencedColumnName= "USER_ID")
	private Client client;
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Date date1;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(insertable = false, updatable = false, name ="idProduct",referencedColumnName= "ID_PRODUCT")
	private Product product;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	@JsonIgnore
	@EmbeddedId
	private CommentProductId commentproductid;
	public CommentProductId getCommentproductid() {
		return commentproductid;
	}
	public void setCommentproductid(CommentProductId commentproductid) {
		this.commentproductid = commentproductid;
	}
	
	
	
	public CommentProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
