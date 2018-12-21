
import org.lgna.story.resources.prop.CastleWallResource;

public class CastleWall extends Prop {

    public CastleWall(final CastleWallResource resource) {
        super(resource);
    }

    public void setCastleWallResource(final CastleWallResource castleWallResource) {
        this.setJointedModelResource(castleWallResource);
    }
}
