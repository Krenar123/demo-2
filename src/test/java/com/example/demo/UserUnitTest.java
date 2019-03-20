package com.example.demo;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.example.demo.entities.User;

public class UserUnitTest {
    
    @Test
    public void whenCalledGetName_thenCorrect() {
        User user = new User("Bossi", "bossi@domain.com", 80708, "Vizbegovo2");
        
        assertThat(user.getName()).isEqualTo("Bossi");
    }
    
    @Test
    public void whenCalledGetEmail_thenCorrect() {
        User user = new User("Bossi", "bossi@domain.com",80708, "Vizbegovo2");
        
        assertThat(user.getEmail()).isEqualTo("bossi@domain.com");
    }
    @Test
    public void whenCalledGetPhone_thenCorrect() {
        User user = new User("Bossi", "bossi@domain.com",80708, "Vizbegovo2");
        
        assertThat(user.getEmail()).isEqualTo(80708);
    }
    @Test
    public void whenCalledGetAdresa_thenCorrect() {
        User user = new User("Bossi", "bossi@domain.com",80708, "Vizbegovo2");
        
        assertThat(user.getEmail()).isEqualTo("Vizbegovo2");
    }
    
    @Test
    public void whenCalledSetName_thenCorrect() {
        User user = new User("Bossi", "bossi@domain.com",80708, "Vizbegovo2");
        
        user.setName("Nali");
        
        assertThat(user.getName()).isEqualTo("Nali");
    }
    
    @Test
    public void whenCalledSetEmail_thenCorrect() {
        User user = new User("Bossi", "bossi@domain.com", 80708 , "Vizbegovo2");
        
        user.setEmail("nali@domain.com");
        
        assertThat(user.getEmail()).isEqualTo("nali@domain.com");
    }
    @Test
    public void whenCalledSetPhone_thenCorrect() {
        User user = new User("Bossi", "bossi@domain.com", 80708 , "Vizbegovo2");
        
        user.setPhone(70809);
        
        assertThat(user.getPhone()).isEqualTo(70809);
    }
    @Test
    public void whenCalledSetAdresa_thenCorrect() {
        User user = new User("Bossi", "bossi@domain.com", 80708 , "Vizbegovo2");
        
        user.setAdresa("Vizbegovo");
        
        assertThat(user.getAdresa()).isEqualTo("Vizbegovo");
    }
    @Test
    public void whenCalledtoString_thenCorrect() {
        User user = new User("Bossi", "bossi@domain.com", 80708, "Vizbegovo2");
        assertThat(user.toString()).isEqualTo("User{id=0, name=Bossi, email=bossi@domain.com, phone=80708, adresa=Vizbegovo2}");
    }
}