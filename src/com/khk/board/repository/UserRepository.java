package com.khk.board.repository;

import java.util.ArrayList;
import java.util.List;

import com.khk.board.entity.User;

public interface UserRepository extends Repository<User, String> {

    // 유저 정보를 저장할 User Entity List
	// 주소값만 변화x
	public static final	List<User> USERS  = new ArrayList<User>();
//	USERS = new ArrayList<User>();
	public abstract boolean existByEmail(String name);
	public abstract boolean existBytelNumber(String telnumber);
	public abstract boolean existByNickName(String NickName);
}
