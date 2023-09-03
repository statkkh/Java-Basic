package com.khk.board.entity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.khk.board.common.BoardIndex;

// 게시물 번호(구분자) /  제목 / 내용 / 작성일 /  [작성자 이메일] / 작성자 닉네임 / 작성자 프로필 사진 / /댓글수  / 좋아요 수 / 조회 수 / 
// 게시물 이미지(여러개) /  좋아요 작성자의 프로필 사진 / 
// [좋아요한 사용자의 이메일] / 좋아요한 사용자의 닉네임 /
// 댓글 사용자의 프로필 사진  / 댓글 작성자의 닉네임 / 
// 댓글 작성 시간 / 댓글 내용



public class Board {
	
	private int boardNumber;
	private String title;
	private String contents;
	private String writeDatetime;
	private String writerEmail;
	private String writerNickName;
	private String writerProfileImage;
	private int viewCount;
	private List<String> imageList; 
	private List<Liky> likeList;
	private List<Comment> commentList;
	
	public Board(String title, String contents, String writeDate, String writerEmail, String writerNickName,
			String writerProfile, List<String> imageList, List<Liky> likeList, List<Comment> commentList) {
		
		Date now = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy. MM. dd. hh:mm:ss");
		
        this.boardNumber = BoardIndex.index++;
		this.title = title;
		this.contents = contents;
		this.writeDatetime = simpleDateFormat.format(now);
		this.writerEmail = writerEmail;
		this.writerNickName = writerNickName;
		this.writerProfileImage = writerProfileImage;
		this.viewCount = 0;
		this.imageList = imageList;
		this.likeList = new ArrayList<Liky>(); //배열 인터페이스 주로  어레이리스트 사용
		this.commentList = new ArrayList<Comment>();
		
			

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriterNickName() {
		return writerNickName;
	}

	public void setWriterNickName(String writerNickName) {
		this.writerNickName = writerNickName;
	}

	public String getWriterProfileImage() {
		return writerProfileImage;
	}

	public void setWriterProfileImage(String writerProfileImage) {
		this.writerProfileImage = writerProfileImage;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}

	public int getBoardNumber() {
		return boardNumber;
	}

	public String getWriteDatetime() {
		return writeDatetime;
	}

	public String getWriterEmail() {
		return writerEmail;
	}

	public List<String> getImageList() {
		return imageList;
	}

	public List<Liky> getLikeList() {
		return likeList;
	}

	public List<Comment> getCommentList() {
		return commentList;
	}
	

	
	
	
}
