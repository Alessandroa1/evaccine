package br.com.alessandro.sa.domain;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



@Entity
public class Usuario {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   @Column(nullable = false, length = 50)
   private String login;

   @Column(nullable = false, length = 50)
   private String senha;

   @Column(nullable = false)
   private Boolean ativo;

   @Column(nullable = false)
   private String nome;


   @ManyToMany(fetch = FetchType.EAGER)
   @JoinTable(
         name = "USUARIOPERMISSAO",
         joinColumns = {@JoinColumn(name="USUARIOID", referencedColumnName = "ID")},
         inverseJoinColumns = {@JoinColumn(name="PERMISSAOID", referencedColumnName = "ID")}
   )
   private List<Permissao> permissoes;

   public List<Permissao> getPermissoes() {
      return permissoes;
   }

   public void setPermissoes(List<Permissao> permissoes) {
      this.permissoes = permissoes;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Boolean getAtivo() {
      return ativo;
   }

   public void setAtivo(Boolean ativo) {
      this.ativo = ativo;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }

   public String getSenha() {
      return senha;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }


 //  @Override
   public Collection<? extends GrantedAuthority> getAuthorities() {
      return permissoes.stream().map(permissao -> new SimpleGrantedAuthority(permissao.getRole())).collect(Collectors.toList());
   }

 //  @Override
   public String getPassword() {
      return senha;
   }

 //  @Override
   public String getUsername() {
      return login;
   }

 //  @Override
   public boolean isAccountNonExpired() {
      return true;
   }

 //  @Override
   public boolean isAccountNonLocked() {
      return true;
   }

 // @Override
   public boolean isCredentialsNonExpired() {
      return true;
   }

   
 // @Override
   public boolean isEnabled() {
      return ativo;
   }

}		
			
			
			
			
			
			