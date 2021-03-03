package com.smartretry.service;

import com.smartretry.entity.RetryData;
import com.smartretry.repository.RetryDataRepo;
import io.micronaut.context.annotation.Value;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
@Slf4j
public class RetryService {

	@Value("$client.attempts}")
	private int webhookRetryAttempts;

	@Inject
	private RetryDataRepo retryDataRepo;

	public boolean setForRetry(String userId, String body) {

		return false;
	}


	public List<RetryData> getAllQualifyingUsers() {
		List<RetryData> allData = retryDataRepo.findByAttemptsGreaterThan(0);
		log.info("Size returned from DB is {}", allData.size());
		return allData;
	}

	public void deleteSuccessfulRecord(String userId) {

	}


}
