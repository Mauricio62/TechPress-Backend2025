package pe.com.techpress.tech_press_daw.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.techpress.tech_press_daw.Models.Empleado;
import pe.com.techpress.tech_press_daw.Repositories.EmpleadoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public Optional<Empleado> obtenerEmpleadoId(Integer id) {
        return empleadoRepository.findById(id);
    }

    public Empleado actualizarEmpleado(Integer id, Empleado nuevoEmpleado) {
        Optional<Empleado> empleadoExistente = empleadoRepository.findById(id);
        if (empleadoExistente.isPresent()) {
            Empleado empleado = empleadoExistente.get();
            empleado.setNombre(nuevoEmpleado.getNombre());
            empleado.setApellido(nuevoEmpleado.getApellido());
            empleado.setEmail(nuevoEmpleado.getEmail());
            empleado.setFecha_contrato(nuevoEmpleado.getFecha_contrato());
            empleado.setArea(nuevoEmpleado.getArea());
            return empleadoRepository.save(empleado);
        } else {
            throw new RuntimeException("Empleado no encontrada con ID: " + id);
        }
    }

    public void eliminarEmpleado(Integer id) {
        empleadoRepository.deleteById(id);
    }

}
