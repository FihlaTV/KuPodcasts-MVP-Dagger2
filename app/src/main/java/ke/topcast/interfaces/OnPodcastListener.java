package ke.topcast.interfaces;

import ke.topcast.models.Podcast;

/**
 * Created by saeed on 8/10/18.
 */

public interface OnPodcastListener {
    void onPodcastSelected(Podcast podcast);

    void onAddedtoBookmark(Podcast podcast);
}