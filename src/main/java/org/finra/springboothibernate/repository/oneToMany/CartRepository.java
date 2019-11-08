package org.finra.springboothibernate.repository.oneToMany;

import org.finra.springboothibernate.model.oneToMany.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
