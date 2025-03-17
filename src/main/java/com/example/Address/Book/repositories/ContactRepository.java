package com.example.Address.Book.repositories;

import com.example.Address.Book.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
