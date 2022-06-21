package com.test.dto;

import java.util.Date;

public class BoardDto {
	private int boardSeq;
	private String boardTitle;
	private String boardContent;
	@Override
	public String toString() {
		return "BoardDto [boardSeq=" + boardSeq + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardDate=" + boardDate + "]";
	}
	public BoardDto() {
		super();
	}
	public BoardDto(int boardSeq, String boardTitle, String boardContent, Date boardDate) {
		super();
		this.boardSeq = boardSeq;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardDate = boardDate;
	}
	public int getBoardSeq() {
		return boardSeq;
	}
	public void setBoardSeq(int boardSeq) {
		this.boardSeq = boardSeq;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	private Date boardDate;
}
