package com.test.dto;

public class ProductDto {
	public ProductDto() {
		super();
	}

	public ProductDto(String proKey, int proPrice, int proCnt, String proNm) {

	
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

	public String getProNm() {
		return proNm;
	}
	public void setProNm(String proNm) {
		this.proNm = proNm;
	}
	



	private String proKey;
	private int proPrice;
	private int proCnt;

	private String proNm;
	private String proNm1;
	private String proNm2;
	private String proNm3;
	private String proNm4;
	private String proNm5;
	private String proNm6;
	private String proNm7;
	private String proNm8;
	public String getProNm1() {
		return proNm1;
	}
	public void setProNm1(String proNm1) {
		this.proNm1 = proNm1;
	}
	public String getProNm2() {
		return proNm2;
	}
	public void setProNm2(String proNm2) {
		this.proNm2 = proNm2;
	}
	public String getProNm3() {
		return proNm3;
	}
	public void setProNm3(String proNm3) {
		this.proNm3 = proNm3;
	}
	public String getProNm4() {
		return proNm4;
	}
	public void setProNm4(String proNm4) {
		this.proNm4 = proNm4;
	}
	public String getProNm5() {
		return proNm5;
	}
	public void setProNm5(String proNm5) {
		this.proNm5 = proNm5;
	}
	public String getProNm6() {
		return proNm6;
	}
	public void setProNm6(String proNm6) {
		this.proNm6 = proNm6;
	}
	public String getProNm7() {
		return proNm7;
	}
	public void setProNm7(String proNm7) {
		this.proNm7 = proNm7;
	}
	public String getProNm8() {
		return proNm8;
	}
	public void setProNm8(String proNm8) {
		this.proNm8 = proNm8;
	}
	
	
}
