package kr.co.fastcampus.eatgo.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    //findAll과 findById를 interface로 분리한다.
    List<Restaurant> findAll();

    Optional<Restaurant> findById(Long id);

    Restaurant save(Restaurant restaurant);

}
