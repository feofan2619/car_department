package by.step.car_department.dao.repository;

import by.step.car_department.dao.model.DriverCertificateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverCertificateRepository extends JpaRepository<DriverCertificateEntity, Long> {
}
