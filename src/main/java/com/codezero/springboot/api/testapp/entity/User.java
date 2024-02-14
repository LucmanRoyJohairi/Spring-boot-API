package com.codezero.springboot.api.testapp.entity;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name="user")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long userId;
    private String username;
    private String password;
    private String email;
    private int userType;

    public User() {
    }

    @Enumerated(EnumType.STRING)
    private Role role;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
//    public Long getUserId(){
//        return userId;
//    }
//
//    public void setUserId(Long userId){
//        this.userId = userId;
//    }
//
//    public String getUsername(){
//        return username;
//    }
//    public void setUsername(String username){
//        this.username = username;
//    }
//    public void setPassword(String password){
//        this.password = password;
//    }
//
//    public String getPassword(){
//        return password;
//    }
//
//    public void setEmail(String email){
//        this.email = email;
//    }
//
//    public String getEmail(){
//        return email;
//    }
//
//    public void setUserType(int userType){
//        this.userType = userType;
//    }
//
//    public int getUserType(){
//        return userType;
//    }



}
