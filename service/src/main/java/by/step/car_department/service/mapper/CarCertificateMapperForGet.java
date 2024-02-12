package by.step.car_department.service.mapper;

import by.step.car_department.dao.model.CarCertificateEntity;
import by.step.car_department.dao.model.dto.CarCertificateDtoForGet;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CarCertificateMapper {

    CarCertificateEntity dtoToEntity(CarCertificateDtoForGet certificateDto);

    CarCertificateDtoForGet entityToDto(CarCertificateEntity certificateEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", source = "id", ignore = true)
    @Mapping(target = "numberVIN", source = "numberVIN", ignore = true)
    @Mapping(target = "manufactureYear", source = "manufactureYear", ignore = true)
    CarCertificateEntity updateCarCertificateEntityFromCarCertificateDto(
            CarCertificateDtoForGet carCertificateDtoForGet, @MappingTarget CarCertificateEntity certificateEntity);
}
