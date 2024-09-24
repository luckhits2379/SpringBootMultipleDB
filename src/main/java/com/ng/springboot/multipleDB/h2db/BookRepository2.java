package com.ng.springboot.multipleDB.h2db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository2 extends JpaRepository<Book2, Integer> {

}
