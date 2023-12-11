package com.crud.crud.service;

import com.crud.crud.entities.Brand;
import com.crud.crud.repository.BrandRepository;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BrandManager {
    private final BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    public void add(Brand brand){
        brandRepository.brandRepository.put(brand.getId(),brand);
    }
    public Map<Long,Brand>getAll(){
        return brandRepository.brandRepository;
    }
    public Brand getById(long id){

        return brandRepository.brandRepository.get(id);
    }
    public void delete(long id){

        brandRepository.brandRepository.remove(id);

    }
    public void update(Brand brand,long id){
        brandRepository.brandRepository.put(id,brand);
    }

}
