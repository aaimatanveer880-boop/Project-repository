import java.util.ArrayList;

class ReviewService {

    private ArrayList<Review> reviews;

    public ReviewService() {
        reviews = new ArrayList<>();
    }

    public void addReview(String user, String comment, int rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating! Must be 1-5");
            return;
        }

        reviews.add(new Review(user, comment, rating));
        System.out.println("Review Added!");
    }

    public void showAllReviews() {
        if (reviews.isEmpty()) {
            System.out.println("No reviews yet.");
            return;
        }

        for (Review r : reviews) {
            r.displayReview();
        }
    }
}