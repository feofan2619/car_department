package by.step.car_department.dao.repository;

import by.step.car_department.dao.model.ResponsibilityDocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsibilityDocumentEntityRepository extends JpaRepository<ResponsibilityDocumentEntity,Long> {
}
