package com.khk.board.service.Implement;

import com.khk.board.common.ResponseMessage;
import com.khk.board.dto.request.SignInRequestDto;
import com.khk.board.dto.request.SignUpRequestDto;
import com.khk.board.dto.response.ResponseEntity;
import com.khk.board.dto.response.SignInResponseDto;
import com.khk.board.dto.response.SignUpResponseDto;
import com.khk.board.entity.User;
import com.khk.board.repository.UserRepository;
//import com.khk.board.repository.implement.UserRepositoryImplement;
import com.khk.board.service.UserService;

public class UserServiceImplement implements UserService {
	/// 의존성 역전 원칙??
	
	
	private final UserRepository userRepository;
	
	public UserServiceImplement(UserRepository userRepository) {
		this.userRepository = userRepository;		
	}
	
	@Override
	public ResponseEntity<SignUpResponseDto> signUp(SignUpRequestDto dto) {
		
		String email = dto.getEmail();
		String telNumber = dto.getTelNumber();
		String nickName = dto.getNickName();

		// 이메일 중복 확인
		boolean hasEmail = userRepository.existByEmail(email);
		if(hasEmail) return ResponseEntity.badRequest(ResponseMessage.EXISTED_EXIST_EMAIL);
		
		// 전화번호 중복확인
		boolean hasTelNumber = userRepository.existBytelNumber(telNumber);
		if(hasTelNumber) return  ResponseEntity.badRequest(ResponseMessage.EXISTED_TEL_NUMBER);
		
		// 닉네임 중복확인
		boolean hasNickName = userRepository.existByNickName(nickName);
		if(hasNickName) return ResponseEntity.badRequest(ResponseMessage.EXISTED_NICKNAME);
		
		// Entity 생성
		User user = new User(dto);
		
		// Entity 저장,  데이터 베이스 처리
		boolean result = userRepository.create(user);
		if(!result) return ResponseEntity.internalServerError(ResponseMessage.DATABASE_ERROR);
		
		return ResponseEntity.ok();

	}

	@Override
	public ResponseEntity<SignInResponseDto> signIn(SignInRequestDto dto) {
		String email = dto.getEmail();
		String password = dto.getPassword();
		
		//이메일로 유저정보 받기
		User user = userRepository.read(email);
		if(user == null) return  ResponseEntity.unauthorized();
		
		//입력한 비밀번호가 저장된 비밀번호가 같은지 비교
		if(!password.equals(user.getPassword())) return  ResponseEntity.unauthorized();
		
		SignInResponseDto data = new SignInResponseDto(user);
		
		return ResponseEntity.ok();
	}


}
