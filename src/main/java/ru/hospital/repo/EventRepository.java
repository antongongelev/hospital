package ru.hospital.repo;

import org.springframework.data.repository.CrudRepository;
import ru.hospital.domain.entity.Event;

public interface EventRepository extends CrudRepository<Event, Long> {
}
