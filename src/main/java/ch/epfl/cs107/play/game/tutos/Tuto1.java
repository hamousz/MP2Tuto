package ch.epfl.cs107.play.game.tutos;

import ch.epfl.cs107.play.game.areagame.Area;
import ch.epfl.cs107.play.game.areagame.AreaGame;
import ch.epfl.cs107.play.game.tutos.area.SimpleArea;
import ch.epfl.cs107.play.io.FileSystem;
import ch.epfl.cs107.play.window.Window;

public class Tuto1 extends AreaGame {

    Area area;
    private void createAreas() { // ajouter aires voulues au jeu
        addArea(area);
    }

    @Override
    public void end() {
       // super.end();
    }

    @Override
    public void update(float deltaTime) {
        super.update(deltaTime);
    }

    @Override
    public String getTitle() {
        return "Tuto1 youpi";
    }

    @Override
    public boolean begin(Window window, FileSystem fileSystem) {
        if (super.begin(window, fileSystem)) { // traitement spécifiques à Tuto1
            return true;
        } else return false;
    }

}
