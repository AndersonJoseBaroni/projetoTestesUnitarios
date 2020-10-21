package com.br.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.br.api.dto.BeerDTO;
import com.br.api.entity.Beer;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
