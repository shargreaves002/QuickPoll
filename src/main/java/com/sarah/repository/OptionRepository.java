package com.sarah.repository;

import org.springframework.data.repository.CrudRepository;
import com.sarah.domain.Option;

public interface OptionRepository extends CrudRepository<Option, Long> {
}
