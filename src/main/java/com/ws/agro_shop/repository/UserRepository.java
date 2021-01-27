package com.ws.agro_shop.repository;

//import com.ws.agro_shop.domain.Role;
import com.ws.agro_shop.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    <S extends User> S save(S s);

    @Override
    Optional<User> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    Iterable<User> findAll();

    @Override
    long count();


    /**
     * Fins user by its email
     *
     * @param email user email
     * @return Optional with userEntity
     */
    Optional<User> findByEmail(String email);

    /**
     * Fins user by its email case insensitive
     *
     * @param email user email
     * @return Optional with userEntity
     */
    Optional<User> findByEmailIgnoreCase(String email);

    /**
     * Finds user by its id and role
     *
     * @param id   user id
     * @param role user role
     * @return true if exist
     */
//    boolean existsByIdAndRoleIn(String id, Role... role);


    /**
     * Returns list of UserEntities with specified role.
     *
     * @param role user role
     * @return list of UserEntities
     */
//    List<User> findUsersByRole(Role role);

    /**
     * Find user by id
     *
     * @param id user id
     * @return Optional with userEntity
     */
    Optional<User> findById(String id);
}

