package com.khk.board.controller;

import com.khk.board.dto.request.RequestDto;
import com.khk.board.dto.request.SignInRequestDto;
import com.khk.board.dto.request.SignUpRequestDto;
import com.khk.board.dto.response.ResponseEntity;
import com.khk.board.dto.response.SignInResponseDto;
import com.khk.board.dto.response.SignUpResponseDto;


public interface UserController {

	ResponseEntity<SignUpResponseDto> signUp(SignUpRequestDto requestDto);
	ResponseEntity<SignInResponseDto> signIn(SignInRequestDto requestDto);
}


/// ResonseDto: int status, String message
// SignInReponse: int status, String message, String email, String NickName, Stiring p...