package com.ilargia.games.egdx.logicbricks.component.sensor;


import com.badlogic.gdx.physics.box2d.Contact;
import com.ilargia.games.entitas.api.IComponent;
import com.ilargia.games.entitas.api.IEntity;
import com.ilargia.games.entitas.codeGenerator.Component;
import com.ilargia.games.entitas.factories.EntitasCollections;

import java.util.Set;

@Component(pools = {"Sensor"})
public class CollisionSensor implements IComponent {
    // Config Values
    public String targetTag;

    public boolean collisionSignal;


    public CollisionSensor(String targetTag) {
        this.targetTag = targetTag;
        this.collisionSignal = false;
    }
}
