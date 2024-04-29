package echo.gemini.backend.repository;

import echo.gemini.backend.model.SciencePlanEcho;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface SciencePlanRepository extends CrudRepository<SciencePlanEcho, Integer> {
    List<SciencePlanEcho> findByAstronomersId(Integer astronomerId);
}