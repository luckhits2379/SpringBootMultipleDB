package com.ng.springboot.multipleDB.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository1 extends JpaRepository<Book1, Integer> {

}
