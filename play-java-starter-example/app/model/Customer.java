package model;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="\"customer\"")
@Audited
public class Customer {
	private Integer cus_id;
	private String cus_firstname;
	private String cus_surname;
	private Integer cus_age;
	private Integer is_deleted;

	
	public Integer getCus_id() {
		return cus_id;
	}

	public void setCus_id(Integer cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_firstname() {
		return cus_firstname;
	}

	public void setCus_firstname(String cus_firstname) {
		this.cus_firstname = cus_firstname;
	}

	public String getCus_surname() {
		return cus_surname;
	}

	public void setCus_surname(String cus_surname) {
		this.cus_surname = cus_surname;
	}

	public Integer getCus_age() {
		return cus_age;
	}

	public void setCus_age(Integer cus_age) {
		this.cus_age = cus_age;
	}

	public Integer getIs_deleted() {
		return is_deleted;
	}

	public void setIs_deleted(Integer is_deleted) {
		this.is_deleted = is_deleted;
	}
}
