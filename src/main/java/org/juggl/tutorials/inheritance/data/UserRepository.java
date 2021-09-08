package org.juggl.tutorials.inheritance.data;

import org.juggl.tutorials.inheritance.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {

	@Modifying
	@Transactional
	@Query("select from UserEntity where id='1ef5784a-f9dd-11eb-bb38-4ffaa8d8f67f'")
	UserEntity getDefaultUserId();
}
