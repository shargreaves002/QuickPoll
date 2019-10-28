package com.sarah.repository;

import org.springframework.data.repository.CrudRepository;
import com.sarah.domain.Poll;

public interface PollRepository extends CrudRepository<Poll, Long> {
}
