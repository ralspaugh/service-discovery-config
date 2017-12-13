package restaurants.domain;

import java.util.List;

public class RestaurantResponse {
    private List<Restaurant> restaurants;

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RestaurantResponse{");
        sb.append("restaurants=").append(restaurants);
        sb.append('}');
        return sb.toString();
    }
}
