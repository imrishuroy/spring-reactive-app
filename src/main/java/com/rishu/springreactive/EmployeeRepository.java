package com.rishu.springreactive;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends //
        ReactiveCrudRepository<Employee, Long> {}
