package com.sso.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sso.entity.User;

/**
 * 
 * @author Hetasvi.Ahir
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {

	/**
	 * 
	 * @param username
	 * @return {@summary Get user by Username}
	 */
	@Query("SELECT u FROM User u WHERE u.username = :username")
	public User getUserByUsername(@Param("username") String username);
}
