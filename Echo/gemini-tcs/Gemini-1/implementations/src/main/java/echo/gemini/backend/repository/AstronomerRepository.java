package echo.gemini.backend.repository;

import echo.gemini.backend.model.Astronomer;
import org.springframework.data.repository.CrudRepository;


public interface AstronomerRepository extends CrudRepository<Astronomer, Integer> {
}
