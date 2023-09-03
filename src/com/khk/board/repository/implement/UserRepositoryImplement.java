package com.khk.board.repository.implement;

import com.khk.board.entity.User;
import com.khk.board.repository.UserRepository;

public class UserRepositoryImplement implements UserRepository {

	@Override
	public boolean create(User entity) {
		//entity가  null인지?
		if(entity == null) return false;
		
		//필수 값이 입력되어있는지?
		if(!entity.isCreatedValid()) return false;
		
		
		USERS.add(entity);
		
		return true;	
	}

	@Override
	public User read(String key) {
		User result = null;
		
		if(key == null) {
			return result;
		}
		//자주 사용
		for(User user:USERS) {
			String email = user.getEmail();
			if(email.equals(key)){
				result = user;
				break;
			}
		}
		
		return result;
	}

	@Override
	public boolean update(User entity) {
		if(entity == null) return false;

		String email = entity.getEmail();
		if(email == null) return false;
		
		for(int index = 0; index < USERS.size(); index++) {
			User user = USERS.get(index);
			String findEmail = user.getEmail();
			
			if(email.equals(findEmail)) {
				USERS.set(index, entity);
				break;
			}	
		}
		return true;
	}

	@Override
	public boolean delete(String key) {
		if(key == null) return false;
		
		for(int index = 0; index < USERS.size() ; index++) {
			User user = USERS.get(index);
			String email = user.getEmail();
			if(key.equals(email)) {
				USERS.remove(index);	
				break;
			}
		}
		return true;
	}

	@Override
	public boolean existByEmail(String email) {
		boolean result = false;
		
		for(User user:USERS) {
			if(user.getEmail().equals(email)) {
				result = true;
				break;
			}
		}
		
		return result;
	}

	@Override
	public boolean existBytelNumber(String telNumber) {
		boolean result =false;
		
		for(User user:USERS) {
			if(user.getTelNumber().equals(telNumber)) {
				result = true;
				break;
			}
		}
		
		
		return result;
	}

	@Override
	public boolean existByNickName(String NickName) {
		boolean result = false;
		
		for(User user:USERS) {
			if(user.getNickname().equals(NickName)) {
				result = true;
				break;
			}
		}
		return result;
	}

}
