package by.step.car_department.dao.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ResponsibilityDocumentDto {

    private Long id;
    private CarDtoForGet car;
    private DriverDtoForGet driver;
    private Instant created;
    private Instant updated;
}
