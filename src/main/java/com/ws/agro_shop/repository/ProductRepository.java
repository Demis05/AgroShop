package com.ws.agro_shop.repository;

import com.ws.agro_shop.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


/**
 * Product repository
 *
 *  Product the domain type the repository manages
 *  Long the type of the id of the entity the repository manages
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Override
    Iterable<Product> findAll();

    @Override
    <S extends Product> S save(S s);

    @Override
    Optional<Product> findById(Long aLong);

    @Override
    long count();

    @Override
    void deleteById(Long aLong);



    /**
     * Counts all entities that have id contained in provided list
     *
     * @param ids list of ids
     * @return amount of matching entries
     */
//    @Query(COUNT_ALL_ENTITIES_BY_IDS_LIST)
//    long countAll(@Param("ids") List<String> ids);
}
