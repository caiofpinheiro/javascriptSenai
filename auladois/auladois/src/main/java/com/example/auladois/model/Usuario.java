package com.example.auladois.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "nome é obrigatório")
    private String nome;

    @Column(nullable = false)
    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Deve ser um email válido.")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Senha é obrigatório")
    @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.")
    private String senha;

    public Usuario() {

    }

    public Usuario(Long id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "nome é obrigatório") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "nome é obrigatório") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Email é obrigatório") @Email(message = "Deve ser um email válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email é obrigatório") @Email(message = "Deve ser um email válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Senha é obrigatório") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha é obrigatório") @Size(min = 3, message = "A senha deve ter no minimo 3 caracteres.") String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
