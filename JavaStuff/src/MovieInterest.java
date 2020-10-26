public class MovieInterest {

    public String movieTime(double cost, int rating) {
        if (cost < 4.0) {
            return "very";
        } else if (cost >= 10.0) {
            return "not";
        } else if (cost < 10.0 && rating == 5) {
            return "very";
        } else if (cost >= 5.0 && cost <= 9.99 && rating >= 2 && rating <= 4) {
            return "maybe";
        } else {
            return "not";
        }
    }

}
