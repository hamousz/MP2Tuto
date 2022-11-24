package ch.epfl.cs107.play.game.tutos.area.tuto1;

import ch.epfl.cs107.play.game.actor.SimpleGhost;
import ch.epfl.cs107.play.game.actor.TextGraphics;
import ch.epfl.cs107.play.game.tutos.area.SimpleArea;
import ch.epfl.cs107.play.math.Vector;

public class Village extends SimpleArea {

    @Override
    protected void createArea() {
        SimpleGhost ghost  = SimpleGhost(new Vector(18,7), "ghost", );
        }
    

    @Override
    public String getTitle() {
        return "zelda/Village"; }
}
