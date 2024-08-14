package demo.com.repository;

import demo.com.entity.CustomerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<CustomerEntity,Integer> {

    Optional<CustomerEntity> findByName(String name);

    Optional<CustomerEntity> findByPhoneOrEmail(String phone, String email);

//    List<CustomerEntity> findBySexAndBirthday(String sex, int starAge, int endAge);
}

