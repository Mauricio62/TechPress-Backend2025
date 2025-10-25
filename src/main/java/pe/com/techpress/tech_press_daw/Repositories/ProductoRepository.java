package pe.com.techpress.tech_press_daw.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.techpress.tech_press_daw.Models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
