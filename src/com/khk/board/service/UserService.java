package com.khk.board.service;


import com.khk.board.dto.request.SignInRequestDto;
import com.khk.board.dto.request.SignUpRequestDto;
import com.khk.board.dto.response.ResponseEntity;
import com.khk.board.dto.response.SignInResponseDto;
import com.khk.board.dto.response.SignUpResponseDto;


public interface UserService {
	ResponseEntity<SignUpResponseDto> signUp(SignUpRequestDto dto);
	ResponseEntity<SignInResponseDto> signIn(SignInRequestDto dto);
	
}
