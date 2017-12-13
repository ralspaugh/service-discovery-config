package restaurants.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import restaurants.domain.Restaurant;

@RepositoryRestResource(collectionResourceRel = "restaurants", path = "restaurants")
public interface RestaurantRepository extends MongoRepository<Restaurant, Long> {

    Restaurant findByName(@Param("name") String name);
}
