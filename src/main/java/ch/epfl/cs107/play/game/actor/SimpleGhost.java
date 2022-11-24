package ch.epfl.cs107.play.game.actor;

import ch.epfl.cs107.play.game.areagame.actor.Sprite;
import ch.epfl.cs107.play.math.Vector;
import ch.epfl.cs107.play.window.Canvas;

import java.awt.*;


public class SimpleGhost extends Entity {
    Sprite sprite;
    SimpleGhost simpleGhost;
    float niveauEnergie;
    String spriteName;
    private TextGraphics hpText;

    public float getNiveauEnergie() {
        return niveauEnergie;
    }

    /**
     * Default Entity constructor
     *
     * @param position (Coordinate): Initial position of the entity. Not null
     */
    public SimpleGhost(Vector position, String spriteName, TextGraphics hpText) {
        super(position);
        this.spriteName = spriteName;
        this.hpText = new TextGraphics(Integer.toString((int) niveauEnergie), 0.4f, Color.BLUE);
        hpText.setParent(this);
        this.hpText.setAnchor(new Vector(-0.3f, 0.1f));
    }

    @Override
    public void draw(Canvas canvas) {
        System.out.println("niveau d'énergie " + niveauEnergie);
    }

    public boolean isWeak() {
        if (simpleGhost.niveauEnergie <= 0) return true;
        return false;
    }

    public void strengthen() {
        simpleGhost.niveauEnergie = 10;
    }

    public void update(float deltaTime) {
        while (niveauEnergie >= 0) {
            niveauEnergie -= deltaTime;
            hpText = new TextGraphics(Integer.toString((int) niveauEnergie), 0.4f, Color.BLUE);


        }

    }
}
