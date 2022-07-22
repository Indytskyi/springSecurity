package com.project.indytskyi.FirstSecurityApp.security;

import com.project.indytskyi.FirstSecurityApp.models.Person;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class PersonDetails implements UserDetails {
    private final Person person;


    public PersonDetails(Person person) {
        this.person = person;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null; // получать роли которые есть у пользователя и получать коллекцию прав которые есть у пользователя
    }

    @Override
    public String getPassword() {
        return this.person.getPassword();
    }

    @Override
    public String getUsername() {
        return this.person.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() { // пароль не просрочен
        return true;
    }

    @Override
    public boolean isEnabled() { //аккаунт включен
        return true;
    }

    // Нужно, чтобы получать данные аунтифицированного пользователя
    public Person getPerson() {
        return this.person;
    }
}
