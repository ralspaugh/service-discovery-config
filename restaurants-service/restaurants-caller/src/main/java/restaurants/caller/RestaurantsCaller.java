package restaurants.caller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restaurants.client.RestaurantsClient;

@RestController
public class RestaurantsCaller {

    @Autowired
    private RestaurantsClient client;

    @Value("${caller.restaurant.name}")
    private String restaurantName;

    @RequestMapping("/")
    public String index() {
        return client.findRestaurantByName(restaurantName).toString();
    }
}
