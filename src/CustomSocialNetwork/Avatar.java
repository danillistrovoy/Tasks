package CustomSocialNetwork;

import java.net.URL;

public class Avatar extends Photo {
    private URL mainPagePicture;
    private URL previewPicture;

    public Avatar(User author, URL picture, URL mainPagePicture, URL previewPicture) {
        super(author, picture);
        this.mainPagePicture = mainPagePicture;
        this.previewPicture = previewPicture;
    }
}
