package com.shtogg.shop.repo;

import com.shtogg.shop.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
    
}
