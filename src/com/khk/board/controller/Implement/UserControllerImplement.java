package com.khk.board.controller.Implement;

import com.khk.board.controller.UserController;
import com.khk.board.dto.request.RequestDto;
import com.khk.board.dto.request.SignInRequestDto;
import com.khk.board.dto.request.SignUpRequestDto;
import com.khk.board.dto.response.ResponseEntity;
import com.khk.board.dto.response.SignInResponseDto;
import com.khk.board.dto.response.SignUpResponseDto;
import com.khk.board.service.UserService;

public class UserControllerImplement implements UserController {
	
	private  final UserService userService;
	
	public UserControllerImplement(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public ResponseEntity<SignUpResponseDto> signUp(SignUpRequestDto requestDto) {
		//		if (requestDto.getEmail() == null || )
		boolean isValid = requestDto.valid();
		if(!isValid) return ResponseEntity.badRequest();
		
		ResponseEntity<SignUpResponseDto> result = userService.signUp(requestDto);
		return result;
	}

//	@Override
//	public RequestDto signIn() {
//		// TODO Auto-generated meth	od stub
//		return null;
//	}
	
	@Override
	public ResponseEntity<SignInResponseDto> signIn(SignInRequestDto requestDto) {
		boolean isValid = requestDto.valid();
		if (!isValid) return ResponseEntity.badRequest();
		
		ResponseEntity<SignInResponseDto> result = userService.signIn(requestDto);
		return result;	
	}

}
