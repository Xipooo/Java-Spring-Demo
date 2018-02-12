package com.wozu.springdemo;

import org.springframework.data.repository.CrudRepository;

// CrudRepository Methods List: 
// https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
public interface PersonRepository extends CrudRepository<Person, Long> {

}
