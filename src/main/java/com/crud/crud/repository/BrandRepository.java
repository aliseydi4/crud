package com.crud.crud.repository;

import com.crud.crud.entities.Brand;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class BrandRepository {
   public Map<Long, Brand>brandRepository=new HashMap<>();


   }



