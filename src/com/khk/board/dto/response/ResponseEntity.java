package com.khk.board.dto.response;

public class ResponseEntity<D> {
	private int status;
	private String message;
	private D data;
	
	public ResponseEntity(int status, String message, D data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	@Override
	public String toString() {
		return "[status=" + status + ", message=" + message + ", data=" + data + "]";
	}
	
	public static <D> ResponseEntity<D> ok() {		 
		return new ResponseEntity<D>(200,"성공", null);//null or 특정 데이터
 	}
	
	public static <D> ResponseEntity<D> ok(D data) {		 
		return new ResponseEntity<D>(200,"성공", data);//null or 특정 데이터
 	}
	
	public static <D> ResponseEntity<D> badRequest() {		 
		return new ResponseEntity<D>(400,"올바르지 않은 입력입니다.", null);
 	}
	
	public static <D> ResponseEntity<D> badRequest(String message) {		 
		return new ResponseEntity<D>(400, message, null);
 	}
	
	
	public static <D> ResponseEntity<D> unauthorized() {		 
		return new ResponseEntity<D>(401,"로그인 정보가 일치하지 않습니다.", null);
 	}
	
	
	public static <D> ResponseEntity<D> unauthorized(String message) {		 
		return new ResponseEntity<D>(401,message, null);
 	}

	
	public static <D> ResponseEntity<D> internalServerError(String message) {		 
		return new ResponseEntity<D>(500,message, null);
 	}
		
	
}
