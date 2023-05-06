package CustomSocialNetwork;

import java.util.List;

public abstract class Community {
    private Avatar avatar;
    private User creator;
    private boolean privacy;
    private String name;
    private List<User> members;
    private List<Photo> photos;
    private List<Post> posts;
    private List<Dialogue> dialogues;
    private List<Message> discussions;

    public void deletePost(Post post){

    }
    public void addPost(Post post){

    }
    public void deletePhoto(Photo photo){

    }
    public void addPhoto(Photo photo){

    }
    public void addMember(User user){

    }
    public void kickMember(User user){

    }

    public Community(Avatar avatar, User creator, String name) {
        this.avatar = avatar;
        this.creator = creator;
        this.name = name;
    }
}
