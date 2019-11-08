package org.finra.springboothibernate.repository.oneToMany;

import org.finra.springboothibernate.model.oneToMany.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
