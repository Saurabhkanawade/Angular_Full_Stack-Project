package com.angular.angular_endpoint.mapper;

import com.angular.angular_endpoint.entity.PersonEntity;
import com.angular.angular_endpoint.model.PersonModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    public PersonEntity modelToEntity(PersonModel personModel);

    public PersonModel entityToModel(PersonEntity personEntity);
}
