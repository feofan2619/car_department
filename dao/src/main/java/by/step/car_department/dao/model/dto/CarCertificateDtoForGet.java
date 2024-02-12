package by.step.car_department.dao.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class CarCertificateDto {

    private Long id;
    private String color;
    private String nameBrand;
    private String nameModel;
    private String numberCarCertificate;
    private String numberVIN;
    private Integer manufactureYear;
    private Instant created;
    private Instant updated;
}
