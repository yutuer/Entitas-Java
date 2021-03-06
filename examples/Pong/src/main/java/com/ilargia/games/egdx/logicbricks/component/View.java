package com.ilargia.games.logicbrick.component;

import com.badlogic.gdx.math.Shape2D;
import com.ilargia.games.entitas.api.IComponent;
import com.ilargia.games.entitas.Component;

@Component(pools = {"Core"})
public class View implements IComponent {
    public Shape2D shape;

    public View(Shape2D shape) {
        this.shape = shape;
    }
}