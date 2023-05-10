package CustomSocialNetwork;

import java.net.URL;

public class LikeType {
    private String typeName;
    private URL emoji;

    public LikeType(String typeName, URL emoji) {
        this.typeName = typeName;
        this.emoji = emoji;
    }

    public URL getEmoji() {
        return emoji;
    }

    public void setEmoji(URL emoji) {
        this.emoji = emoji;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
