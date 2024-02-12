package by.step.car_department.dao.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class DriverLicenceDto {

    private Long id;
    private String number;
    private Instant created;
    private Instant updated;
}
