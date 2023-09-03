package com.khk.board.entity;

import com.khk.board.dto.request.SignUpRequestDto;

// 이메일 / 비밀번호 / 닉네임 / 휴대전화번호 /  주소 / 상세주소  / 개인정보 동의 여부 / 프로필 사진
public class User {

	private String email;
	private String password;
	private String nickname;
	private String telNumber;
	private String address;
	private String addressDetail;
	private boolean agreedPernal;
	private String profileImage;//주소 형태로 가져옴
	
	public User(String email, String password, String nickname, String telNumber, String address, String addressDetail,
			boolean agreedPernal) {

		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.telNumber = telNumber;
		this.address = address;
		this.addressDetail = addressDetail;
		this.agreedPernal = agreedPernal;

	}
	
	public User(SignUpRequestDto dto) {
		this.email = dto.getEmail();
		this.password = dto.getPassword();
		this.nickname = dto.getNickName();
		this.telNumber = dto.getTelNumber();
		this.address = dto.getAddress();
		this.addressDetail = dto.getAddressDetail();
		this.agreedPernal = dto.isAgreedPersonal();
		this.profileImage = null;
	}
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public String getAddress() {
		return address;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public boolean isAgreedPernal() {
		return agreedPernal;
	}
	
	public boolean isCreatedValid(){
		if(email == null || password == null ||
				nickname == null  || address == null  ||
				 telNumber == null ) {
				return false;
			}
			
		if(email.isBlank() ||password.isBlank() ||
				nickname.isBlank()  || address.isBlank() || 
				telNumber.isBlank() || !agreedPernal) {
				return false;
		}
			
		return false;	
	}
}
