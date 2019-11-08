package org.finra.springboothibernate.service.oneToMany.impl;

import org.finra.springboothibernate.model.oneToMany.Item;
import org.finra.springboothibernate.repository.oneToMany.ItemRepository;
import org.finra.springboothibernate.service.oneToMany.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public Item addItem(Item item) {
		return itemRepository.save(item);
	}
}
