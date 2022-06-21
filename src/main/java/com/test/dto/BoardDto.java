package com.test.dto;

import java.util.Date;

public class BoardDto {

	private int board_seq;
	private String board_title;
	private String board_content;
	private Date board_date;
	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardDto(int board_seq, String board_title, String board_content, Date board_date) {
		super();
		this.board_seq = board_seq;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_date = board_date;
	}
	public int getBoard_seq() {
		return board_seq;
	}
	public void setBoard_seq(int board_seq) {
		this.board_seq = board_seq;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public Date getBoard_date() {
		return board_date;
	}
	public void setBoard_date(Date board_date) {
		this.board_date = board_date;
	}
	@Override
	public String toString() {
		return "BoardDto [board_seq=" + board_seq + ", board_title=" + board_title + ", board_content=" + board_content
				+ ", board_date=" + board_date + "]";
	}
}

