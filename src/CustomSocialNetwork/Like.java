package CustomSocialNetwork;

public class Like {
    private User author;
    private LikeType type;

    public Like(User author, LikeType type) {
        this.author = author;
        this.type = type;
    }

    public LikeType getType() {
        return type;
    }

    public void setType(LikeType type) {
        this.type = type;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
