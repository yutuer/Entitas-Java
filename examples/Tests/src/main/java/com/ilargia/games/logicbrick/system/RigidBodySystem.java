package com.ilargia.games.logicbrick.system;


import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.ilargia.games.entitas.api.IContext;
import com.ilargia.games.entitas.collector.Collector;
import com.ilargia.games.entitas.systems.ReactiveSystem;
import com.ilargia.games.logicbrick.gen.game.GameContext;
import com.ilargia.games.logicbrick.gen.game.GameEntity;
import com.ilargia.games.logicbrick.gen.game.GameMatcher;

import java.util.List;

public class RigidBodySystem extends ReactiveSystem<GameEntity> {

    public RigidBodySystem(GameContext context, World world) {
        super(context);
    }

    @Override
    protected Collector getTrigger(IContext context) {
        return context.createCollector(GameMatcher.RigidBody());
    }

    @Override
    protected void execute(List<GameEntity> entities) {
        for (GameEntity e : entities) {
            Body body = e.getRigidBody().body;
            e.retain(body);
            body.setUserData(e);
        }
        _collector.clearCollectedEntities();
    }

    @Override
    protected boolean filter(GameEntity entity) {
        return entity.hasRigidBody();
    }
}
