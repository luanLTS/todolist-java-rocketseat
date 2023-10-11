package br.com.luanteixeira.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel, UUID> {
	// interfaces declaram apenas a representação dos metodos, não a implementacao em si
	
	
	UserModel findByUsername(String username);
}
