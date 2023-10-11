package br.com.luanteixeira.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/")
public class UserController {

	// spring gerencia o ciclo de vida do atributo
	@Autowired
	private IUserRepository userRepository;

	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody UserModel user) {

		var userSaved = this.userRepository.findByUsername(user.getUsername());

		if (userSaved != null) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe");
		}
		var userCreated = userRepository.save(user);
		return ResponseEntity.ok(userCreated);
	}
}
