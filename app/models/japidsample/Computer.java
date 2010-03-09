package models.japidsample;

import java.util.Date;

public class Computer {
	private Long id;
	private String name;
	private Date releaseDate;
	private String manufacturor;
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
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getManufacturor() {
		return manufacturor;
	}
	public void setManufacturor(String manufacturor) {
		this.manufacturor = manufacturor;
	}
	
}
