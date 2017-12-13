package restaurants.client;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("restaurants")
public interface RestaurantsFeignClient extends RestaurantsClient {

}
