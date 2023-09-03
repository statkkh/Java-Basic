package com.khk.board.entity;

public class Comment {
	
	private String writerProfileImage;
	private String writerNickname;
	private String writeDatetime;
	private String contents;
	
	public Comment(String writerProfileImage, String writerNickname, String writeDatetime, String content) {
		super();
		this.writerProfileImage = writerProfileImage;
		this.writerNickname = writerNickname;
		this.writeDatetime = writeDatetime;
		this.contents = contents;
	}
	
	public String getWriterProfileImage() {
		return writerProfileImage;
	}
	public void setWriterProfileImage(String writerProfileImage) {
		this.writerProfileImage = writerProfileImage;
	}
	public String getWriterNickname() {
		return writerNickname;
	}
	public void setWriterNickname(String writerNickname) {
		this.writerNickname = writerNickname;
	}
	public String getWriteDatetime() {
		return writeDatetime;
	}
	public String getContents() {
		return contents;
	}
	
	
	
}
