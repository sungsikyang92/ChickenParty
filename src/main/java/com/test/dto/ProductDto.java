package com.test.dto;

public class ProductDto {
	public ProductDto() {
		super();
	}
	public ProductDto(String proKey, int proPrice, int proCnt, int proNm) {
		super();
		this.proKey = proKey;
		this.proPrice = proPrice;
		this.proCnt = proCnt;
		this.proNm = proNm;
	}
	@Override
	public String toString() {
		return "ProductDto [proKey=" + proKey + ", proPrice=" + proPrice + ", proCnt=" + proCnt + ", proNm=" + proNm
				+ "]";
	}
	public String getProKey() {
		return proKey;
	}
	public void setProKey(String proKey) {
		this.proKey = proKey;
	}
	public int getProPrice() {
		return proPrice;
	}
	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}
	public int getProCnt() {
		return proCnt;
	}
	public void setProCnt(int proCnt) {
		this.proCnt = proCnt;
	}
	public int getProNm() {
		return proNm;
	}
	public void setProNm(int proNm) {
		this.proNm = proNm;
	}
	private String proKey;
	private int proPrice;
	private int proCnt;
	private int proNm;
}
