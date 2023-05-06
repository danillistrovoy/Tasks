package CustomSocialNetwork;

public class Like {
    private User author;
    private LikeType type;

    public Like(User author, LikeType type) {
        this.author = author;
        this.type = type;
    }
}
