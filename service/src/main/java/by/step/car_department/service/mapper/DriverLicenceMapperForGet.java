package by.step.car_department.service.mapper;

import by.step.car_department.dao.model.DriverLicenceEntity;
import by.step.car_department.dao.model.dto.DriverLicenceDtoForGet;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DriverLicenceMapper {

    DriverLicenceEntity dtoToEntity(DriverLicenceDtoForGet driverLicenceDtoForGet);

    DriverLicenceDtoForGet entityToDto(DriverLicenceEntity driverLicenceEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", source = "id", ignore = true)
    DriverLicenceEntity updateDriverLicenceEntityFromDriverLicenceDto(
            DriverLicenceDtoForGet driverLicenceDtoForGet, @MappingTarget DriverLicenceEntity driverLicenceEntity);
}
