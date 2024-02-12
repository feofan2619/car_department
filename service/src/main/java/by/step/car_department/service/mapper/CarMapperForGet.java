package by.step.car_department.service.mapper;

import by.step.car_department.dao.model.CarEntity;
import by.step.car_department.dao.model.dto.CarDtoForGet;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CarMapper {

    CarEntity dtoToEntity(CarDtoForGet carDtoForGet);

    CarDtoForGet entityToDto(CarEntity carEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", source = "id", ignore = true)
    @Mapping(target = "boardNumber", source = "boardNumber", ignore = true)
    @Mapping(target = "carCertificate", source = "carCertificate", ignore = true)
    CarEntity updateCarEntityFromCarDto(CarDtoForGet carDtoForGet, @MappingTarget CarEntity carEntity);
}
