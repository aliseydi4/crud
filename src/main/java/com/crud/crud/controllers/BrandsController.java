package com.crud.crud.controllers;

import com.crud.crud.entities.Brand;
import com.crud.crud.service.BrandManager;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("brand")
public class BrandsController {
    private final BrandManager brandManager;

    public BrandsController(BrandManager brandManager) {
        this.brandManager = brandManager;
    }

    @PostMapping
    public void add(@RequestBody Brand brand) {
        brandManager.add(brand);
    }

    @GetMapping("getAll")
    public Map<Long, Brand> getAll() {
        return brandManager.getAll();
    }

    @GetMapping
    public Brand getById(@RequestParam long id) {
        return brandManager.getById(id);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id) {
         brandManager.delete(id);
    }
    @PutMapping()
    public void update(@RequestBody Brand brand,@RequestParam long id){
        brandManager.update(brand,id);
    }

}
