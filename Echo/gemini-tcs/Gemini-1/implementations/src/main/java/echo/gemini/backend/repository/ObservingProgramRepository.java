package echo.gemini.backend.repository;
import echo.gemini.backend.model.ObservingProgramEcho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ObservingProgramRepository extends CrudRepository<ObservingProgramEcho, Integer> {
    // Repository methods
}
