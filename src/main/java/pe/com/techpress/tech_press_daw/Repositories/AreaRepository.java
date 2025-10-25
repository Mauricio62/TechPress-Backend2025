package pe.com.techpress.tech_press_daw.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.techpress.tech_press_daw.Models.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> {
}
