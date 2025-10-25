package pe.com.techpress.tech_press_daw.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.techpress.tech_press_daw.Models.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
}
