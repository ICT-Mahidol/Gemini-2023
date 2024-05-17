package echo.gemini.backend.repository;

import echo.gemini.backend.model.Observer;
import org.springframework.data.repository.CrudRepository;

public interface ObserverRepository extends CrudRepository<Observer, Integer> {
}