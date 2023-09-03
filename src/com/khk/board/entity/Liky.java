package com.khk.board.entity;

public class Liky {
	private String userProfileImage;
	private String userEmail;
	private String userNickName;

	public Liky(String userProfileImage, String userEmail, String userNickName) {
	
		this.userProfileImage = userProfileImage;
		this.userEmail = userEmail;
		this.userNickName = userNickName;
	}

	public String getUserProfileImage() {
		return userProfileImage;
	}

	public void setUserProfileImage(String userProfileImage) {
		this.userProfileImage = userProfileImage;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getUserEmail() {
		return userEmail;
	}
	
	

}
