
import org.lgna.story.resources.biped.PlayingCardResource;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.prop.CastleWallResource;
import org.lgna.story.event.SceneActivationListener;
import org.lgna.story.*;

public class Scene extends SScene {

    public Scene() {
        super();
    }

    private void performCustomSetup() {
    }

    private void performGeneratedSetUp() {
        this.setAtmosphereColor(new Color(0.588, 0.886, 0.988));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(Color.BLACK);
        this.setFogDensity(0.0);
        this.setName("myScene");
        this.ground.setPaint(SGround.SurfaceAppearance.GRASS);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.995185, 0.0980144, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(9.61E-16, 1.56, -7.85));
        this.castleWall.setPaint(Color.WHITE);
        this.castleWall.setOpacity(1.0);
        this.castleWall.setName("castleWall");
        this.castleWall.setVehicle(this);
        this.castleWall.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.castleWall.setPositionRelativeToVehicle(new Position(0.0, 0.0, 0.0));
        this.castleWall.setSize(new Size(5.27, 3.66, 1.22));
        this.castleWall2.setPaint(Color.WHITE);
        this.castleWall2.setOpacity(1.0);
        this.castleWall2.setName("castleWall2");
        this.castleWall2.setVehicle(this);
        this.castleWall2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.castleWall2.setPositionRelativeToVehicle(new Position(5.2, 0.0, 0.0));
        this.castleWall2.setSize(new Size(5.27, 3.66, 1.22));
        this.player1Sign.setValue("Player 1");
        this.player1Sign.setPaint(Color.WHITE);
        this.player1Sign.setOpacity(1.0);
        this.player1Sign.setName("player1Sign");
        this.player1Sign.setVehicle(this);
        this.player1Sign.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.player1Sign.setPositionRelativeToVehicle(new Position(1.5, 1.5, -3.0));
        this.player1Sign.setSize(new Size(1.0, 0.273, 0.00611));
        this.player2Sign.setValue("Player 2");
        this.player2Sign.setPaint(Color.WHITE);
        this.player2Sign.setOpacity(1.0);
        this.player2Sign.setName("player2Sign");
        this.player2Sign.setVehicle(this);
        this.player2Sign.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.player2Sign.setPositionRelativeToVehicle(new Position(-1.5, 1.5, -3.0));
        this.player2Sign.setSize(new Size(1.0, 0.263, 0.00589));
        this.winPlayer1Sign.setValue("Win!!");
        this.winPlayer1Sign.setPaint(Color.WHITE);
        this.winPlayer1Sign.setOpacity(0.0);
        this.winPlayer1Sign.setName("winPlayer1Sign");
        this.winPlayer1Sign.setVehicle(this);
        this.winPlayer1Sign.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.winPlayer1Sign.setPositionRelativeToVehicle(new Position(1.5, 1.0, -3.0));
        this.winPlayer1Sign.setSize(new Size(1.0, 0.328, 0.00954));
        this.winPlayer2Sign.setValue("Win!!");
        this.winPlayer2Sign.setPaint(Color.WHITE);
        this.winPlayer2Sign.setOpacity(0.0);
        this.winPlayer2Sign.setName("winPlayer2Sign");
        this.winPlayer2Sign.setVehicle(this);
        this.winPlayer2Sign.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.winPlayer2Sign.setPositionRelativeToVehicle(new Position(-1.5, 1.0, -3.0));
        this.winPlayer2Sign.setSize(new Size(1.0, 0.328, 0.00954));
        this.player1ScoreSign.setValue("Score: 0");
        this.player1ScoreSign.setPaint(Color.WHITE);
        this.player1ScoreSign.setOpacity(1.0);
        this.player1ScoreSign.setName("player1ScoreSign");
        this.player1ScoreSign.setVehicle(this);
        this.player1ScoreSign.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.player1ScoreSign.setPositionRelativeToVehicle(new Position(1.5, 0.5, -3.0));
        this.player1ScoreSign.setSize(new Size(1.0, 0.204, 0.00574));
        this.player2ScoreSign.setValue("Score: 0");
        this.player2ScoreSign.setPaint(Color.WHITE);
        this.player2ScoreSign.setOpacity(1.0);
        this.player2ScoreSign.setName("player2ScoreSign");
        this.player2ScoreSign.setVehicle(this);
        this.player2ScoreSign.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.player2ScoreSign.setPositionRelativeToVehicle(new Position(-1.5, 0.5, -3.0));
        this.player2ScoreSign.setSize(new Size(1.0, 0.204, 0.00574));
        this.cone1.setBaseRadius(0.125);
        this.cone1.setLength(0.25);
        this.cone1.setPaint(Color.WHITE);
        this.cone1.setOpacity(0.0);
        this.cone1.setName("cone1");
        this.cone1.setVehicle(this);
        this.cone1.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.cone1.setPositionRelativeToVehicle(new Position(0.5, 0.0, -3.0));
        this.cone1.setSize(new Size(0.25, 0.25, 0.25));
        this.cone2.setBaseRadius(0.125);
        this.cone2.setLength(0.25);
        this.cone2.setPaint(Color.WHITE);
        this.cone2.setOpacity(0.0);
        this.cone2.setName("cone2");
        this.cone2.setVehicle(this);
        this.cone2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.cone2.setPositionRelativeToVehicle(new Position(-0.5, 0.0, -3.0));
        this.cone2.setSize(new Size(0.25, 0.25, 0.25));
        this.originalCamera.setName("originalCamera");
        this.originalCamera.setVehicle(this);
        this.originalCamera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.995185, 0.0980144, 6.12323E-17));
        this.originalCamera.setPositionRelativeToVehicle(new Position(9.61E-16, 1.56, -7.85));
        this.originalCamera.setColorId(Color.RED);
        this.coneOutside.setBaseRadius(0.125);
        this.coneOutside.setLength(0.25);
        this.coneOutside.setPaint(Color.WHITE);
        this.coneOutside.setOpacity(1.0);
        this.coneOutside.setName("coneOutside");
        this.coneOutside.setVehicle(this);
        this.coneOutside.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.coneOutside.setPositionRelativeToVehicle(new Position(8.0, 0.0, -3.0));
        this.coneOutside.setSize(new Size(0.25, 0.25, 0.25));
        this.playingCard1.setPaint(Color.WHITE);
        this.playingCard1.setOpacity(1.0);
        this.playingCard1.setName("playingCard1");
        this.playingCard1.setVehicle(this);
        this.playingCard1.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.playingCard1.setPositionRelativeToVehicle(new Position(8.0, 0.0, -3.0));
        this.playingCard1.setSize(new Size(0.5, 1.38, 0.432));
        this.playingCard2.setPaint(Color.WHITE);
        this.playingCard2.setOpacity(1.0);
        this.playingCard2.setName("playingCard2");
        this.playingCard2.setVehicle(this);
        this.playingCard2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.playingCard2.setPositionRelativeToVehicle(new Position(8.0, 0.0, -3.0));
        this.playingCard2.setSize(new Size(0.5, 1.38, 0.432));
        this.playingCard3.setPaint(Color.WHITE);
        this.playingCard3.setOpacity(1.0);
        this.playingCard3.setName("playingCard3");
        this.playingCard3.setVehicle(this);
        this.playingCard3.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.playingCard3.setPositionRelativeToVehicle(new Position(8.0, 0.0, -3.0));
        this.playingCard3.setSize(new Size(0.5, 1.38, 0.432));
        this.playingCard4.setPaint(Color.WHITE);
        this.playingCard4.setOpacity(1.0);
        this.playingCard4.setName("playingCard4");
        this.playingCard4.setVehicle(this);
        this.playingCard4.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.playingCard4.setPositionRelativeToVehicle(new Position(8.0, 0.0, -3.0));
        this.playingCard4.setSize(new Size(0.5, 1.38, 0.432));
        this.playingCard5.setPaint(Color.WHITE);
        this.playingCard5.setOpacity(1.0);
        this.playingCard5.setName("playingCard5");
        this.playingCard5.setVehicle(this);
        this.playingCard5.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.playingCard5.setPositionRelativeToVehicle(new Position(8.0, 0.0, -3.0));
        this.playingCard5.setSize(new Size(0.5, 1.38, 0.432));
        this.playingCard6.setPaint(Color.WHITE);
        this.playingCard6.setOpacity(1.0);
        this.playingCard6.setName("playingCard6");
        this.playingCard6.setVehicle(this);
        this.playingCard6.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.playingCard6.setPositionRelativeToVehicle(new Position(8.0, 0.0, -3.0));
        this.playingCard6.setSize(new Size(0.5, 1.38, 0.432));
        this.playingCard7.setPaint(Color.WHITE);
        this.playingCard7.setOpacity(1.0);
        this.playingCard7.setName("playingCard7");
        this.playingCard7.setVehicle(this);
        this.playingCard7.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.playingCard7.setPositionRelativeToVehicle(new Position(8.0, 0.0, -3.0));
        this.playingCard7.setSize(new Size(0.5, 1.38, 0.432));
        this.playingCard8.setPaint(Color.WHITE);
        this.playingCard8.setOpacity(1.0);
        this.playingCard8.setName("playingCard8");
        this.playingCard8.setVehicle(this);
        this.playingCard8.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.playingCard8.setPositionRelativeToVehicle(new Position(8.0, 0.0, -3.0));
        this.playingCard8.setSize(new Size(0.5, 1.38, 0.432));
        this.playingCard9.setPaint(Color.WHITE);
        this.playingCard9.setOpacity(1.0);
        this.playingCard9.setName("playingCard9");
        this.playingCard9.setVehicle(this);
        this.playingCard9.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.playingCard9.setPositionRelativeToVehicle(new Position(8.0, 0.0, -3.0));
        this.playingCard9.setSize(new Size(0.5, 1.38, 0.432));
        this.playingCard10.setPaint(Color.WHITE);
        this.playingCard10.setOpacity(1.0);
        this.playingCard10.setName("playingCard10");
        this.playingCard10.setVehicle(this);
        this.playingCard10.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.playingCard10.setPositionRelativeToVehicle(new Position(8.0, 0.0, -3.0));
        this.playingCard10.setSize(new Size(0.5, 1.38, 0.432));
    }

    private void initializeEventListeners() {
        this.addSceneActivationListener(new SceneActivationListener() {
            public void sceneActivated(final SceneActivationEvent e) {
                Scene.this.myFirstMethod();
            }
        });
    }

    protected void handleActiveChanged(final Boolean isActive, final Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }

    public void myFirstMethod() {
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;
        int randomNumber1, randomNumber2;
        PlayingCard firstCard, secondCard;
        for (int a = 1; a <= 5; a++) {
            do {
                randomNumber1 = (int) (Math.random() * 10 + 1);
                randomNumber2 = (int) (Math.random() * 10 + 1);
            } while (randomNumber1 == randomNumber2);
            firstCard = determinePlayingCard(randomNumber1);
            secondCard = determinePlayingCard(randomNumber2);
            this.dealOutCards(firstCard, secondCard);
            if (randomNumber1 > randomNumber2) {
                scorePlayer1++;
                displayWinner(winPlayer1Sign, player1ScoreSign, scorePlayer1);
            } else {
                scorePlayer2++;
                displayWinner(winPlayer2Sign, player2ScoreSign, scorePlayer2);
            }
            this.disappearCards(firstCard, secondCard);
        }
    }

    public PlayingCard determinePlayingCard(int num) {
        switch (num) {
            case 1:
                return playingCard1;
            case 2:
                return playingCard2;
            case 3:
                return playingCard3;
            case 4:
                return playingCard4;
            case 5:
                return playingCard5;
            case 6:
                return playingCard6;
            case 7:
                return playingCard7;
            case 8:
                return playingCard8;
            case 9:
                return playingCard9;
            case 10:
                return playingCard10;
            default:
                return playingCard1;
        }
    }

    public void dealOutCards(final PlayingCard chosenPlayer1Card, final PlayingCard chosenPlayer2Card) {
        /*do in order*/ {//display winner
            this.castleWall2.say("DEAL OUT THE CARDS PLEASE!", Say.duration(3.0));
            chosenPlayer1Card.moveTo(this.cone1);
            chosenPlayer2Card.moveTo(this.cone2);
        }
    }

    public void displayWinner(final TextModel winSign, final TextModel scoreSign,
            int transferredScore) {
        /*do in order*/ {//display winner
            for (int x = 1; x <= 5; x++) {
                winSign.setOpacity(1.0, SetOpacity.duration(.5));
                winSign.setOpacity(0.0, SetOpacity.duration(.5));
            }
            scoreSign.setValue("Score: " + transferredScore);
        }
    }

    public void disappearCards(final PlayingCard whichCard1, final PlayingCard whichCard2) {
        /*do in order*/ {//cards disappear
            whichCard1.turn(TurnDirection.LEFT, 8.0);
            whichCard1.moveTo(this.coneOutside);
            whichCard2.turn(TurnDirection.LEFT, 8.0);
            whichCard2.moveTo(this.coneOutside);
            this.ground.delay(4.0);
        }
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public CastleWall getCastleWall() {
        return this.castleWall;
    }

    public CastleWall getCastleWall2() {
        return this.castleWall2;
    }

    public TextModel getPlayer1Sign() {
        return this.player1Sign;
    }

    public TextModel getPlayer2Sign() {
        return this.player2Sign;
    }

    public TextModel getWinPlayer1Sign() {
        return this.winPlayer1Sign;
    }

    public TextModel getWinPlayer2Sign() {
        return this.winPlayer2Sign;
    }

    public TextModel getPlayer1ScoreSign() {
        return this.player1ScoreSign;
    }

    public TextModel getPlayer2ScoreSign() {
        return this.player2ScoreSign;
    }

    public Cone getCone1() {
        return this.cone1;
    }

    public Cone getCone2() {
        return this.cone2;
    }

    public SCameraMarker getOriginalCamera() {
        return this.originalCamera;
    }

    public Cone getConeOutside() {
        return this.coneOutside;
    }

    public PlayingCard getPlayingCard1() {
        return this.playingCard1;
    }

    public PlayingCard getPlayingCard2() {
        return this.playingCard2;
    }

    public PlayingCard getPlayingCard3() {
        return this.playingCard3;
    }

    public PlayingCard getPlayingCard4() {
        return this.playingCard4;
    }

    public PlayingCard getPlayingCard5() {
        return this.playingCard5;
    }

    public PlayingCard getPlayingCard6() {
        return this.playingCard6;
    }

    public PlayingCard getPlayingCard7() {
        return this.playingCard7;
    }

    public PlayingCard getPlayingCard8() {
        return this.playingCard8;
    }

    public PlayingCard getPlayingCard9() {
        return this.playingCard9;
    }

    public PlayingCard getPlayingCard10() {
        return this.playingCard10;
    }
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final CastleWall castleWall = new CastleWall(CastleWallResource.DEFAULT);
    private final CastleWall castleWall2 = new CastleWall(CastleWallResource.DEFAULT);
    private final TextModel player1Sign = new TextModel();
    private final TextModel player2Sign = new TextModel();
    private final TextModel winPlayer1Sign = new TextModel();
    private final TextModel winPlayer2Sign = new TextModel();
    private final TextModel player1ScoreSign = new TextModel();
    private final TextModel player2ScoreSign = new TextModel();
    private final Cone cone1 = new Cone();
    private final Cone cone2 = new Cone();
    private final SCameraMarker originalCamera = new SCameraMarker();
    private final Cone coneOutside = new Cone();
    private final PlayingCard playingCard1 = new PlayingCard(PlayingCardResource.ONE1);
    private final PlayingCard playingCard2 = new PlayingCard(PlayingCardResource.TWO2);
    private final PlayingCard playingCard3 = new PlayingCard(PlayingCardResource.THREE3);
    private final PlayingCard playingCard4 = new PlayingCard(PlayingCardResource.FOUR4);
    private final PlayingCard playingCard5 = new PlayingCard(PlayingCardResource.FIVE5);
    private final PlayingCard playingCard6 = new PlayingCard(PlayingCardResource.SIX6);
    private final PlayingCard playingCard7 = new PlayingCard(PlayingCardResource.SEVEN7);
    private final PlayingCard playingCard8 = new PlayingCard(PlayingCardResource.EIGHT8);
    private final PlayingCard playingCard9 = new PlayingCard(PlayingCardResource.NINE9);
    private final PlayingCard playingCard10 = new PlayingCard(PlayingCardResource.TEN10);
}
