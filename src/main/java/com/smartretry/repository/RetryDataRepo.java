package com.smartretry.repository;

import com.smartretry.entity.RetryData;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RetryDataRepo extends CrudRepository<RetryData, Long> {

	List<RetryData> findByAttemptsGreaterThan(int attempts);

	Optional<RetryData> findByUserId(String customerNumber);

}
