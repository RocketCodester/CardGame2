
import org.lgna.story.resources.biped.PlayingCardResource;

public class PlayingCard extends Biped {

    public PlayingCard(final PlayingCardResource resource) {
        super(resource);
    }

    public void setPlayingCardResource(final PlayingCardResource playingCardResource) {
        this.setJointedModelResource(playingCardResource);
    }
}
