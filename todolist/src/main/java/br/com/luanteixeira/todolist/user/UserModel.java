package br.com.luanteixeira.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;
	
	@Column(unique = true) // restricao de username ser unico
	private String username;
	
	private String name;
	
	private String password;
	
	@CreationTimestamp
	private LocalDateTime createdAt;

	/*
	 * Getter and Setter Getter -> metodo para leitura de um valor privado de uma
	 * classe, sempre levando em consideração o conceito de menor privilegio Setter
	 * -> metodo para atualizar um valor de um atributo privado de uma classe
	 */

//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
}
