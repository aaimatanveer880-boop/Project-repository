class Review {
    private String userName;
    private String comment;
    private int rating;

    public Review(String userName, String comment, int rating) {
        this.userName = userName;
        this.comment = comment;
        this.rating = rating;
    }

    public void displayReview() {
        System.out.println("User: " + userName);
        System.out.println("Rating: " + rating + "/5");
        System.out.println("Comment: " + comment);
        System.out.println("----------------------");
    }
}