package restaurants.caller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restaurants.client.RestaurantsClient;
import restaurants.domain.Restaurant;

@RestController
@RefreshScope
public class RestaurantsCaller {

    @Autowired
    private RestaurantsClient client;

    @Value("${caller.restaurant.name}")
    private String restaurantName;

    @RequestMapping("/")
    public String index() {
        Restaurant restaurant = client.findRestaurantByName(restaurantName);
        return "I found a restaurant named " + restaurant.getName() + " in " + restaurant.getBorough() + ".";
    }
}
