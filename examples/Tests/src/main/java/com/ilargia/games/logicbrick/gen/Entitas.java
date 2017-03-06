package com.ilargia.games.logicbrick.gen;

import com.ilargia.games.entitas.Context;
import com.ilargia.games.entitas.api.*;
import com.ilargia.games.logicbrick.gen.input.InputEntity;
import com.ilargia.games.logicbrick.gen.game.GameEntity;
import com.ilargia.games.logicbrick.gen.gui.GuiEntity;
import com.ilargia.games.logicbrick.gen.scene.SceneEntity;
import com.ilargia.games.logicbrick.gen.sensor.SensorEntity;
import com.ilargia.games.logicbrick.gen.actuator.ActuatorEntity;
import com.ilargia.games.logicbrick.gen.input.InputComponentsLookup;
import com.ilargia.games.logicbrick.gen.game.GameComponentsLookup;
import com.ilargia.games.logicbrick.gen.gui.GuiComponentsLookup;
import com.ilargia.games.logicbrick.gen.scene.SceneComponentsLookup;
import com.ilargia.games.logicbrick.gen.sensor.SensorComponentsLookup;
import com.ilargia.games.logicbrick.gen.actuator.ActuatorComponentsLookup;
import com.ilargia.games.logicbrick.gen.input.InputContext;
import com.ilargia.games.logicbrick.gen.game.GameContext;
import com.ilargia.games.logicbrick.gen.gui.GuiContext;
import com.ilargia.games.logicbrick.gen.scene.SceneContext;
import com.ilargia.games.logicbrick.gen.sensor.SensorContext;
import com.ilargia.games.logicbrick.gen.actuator.ActuatorContext;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class Entitas implements IContexts {

	public InputContext input;
	public GameContext game;
	public GuiContext gui;
	public SceneContext scene;
	public SensorContext sensor;
	public ActuatorContext actuator;

	public Entitas() {
		input = createInputContext();
		game = createGameContext();
		gui = createGuiContext();
		scene = createSceneContext();
		sensor = createSensorContext();
		actuator = createActuatorContext();
	}

	public InputContext createInputContext() {
		return new InputContext(InputComponentsLookup.totalComponents, 0,
				new ContextInfo("Input",
						InputComponentsLookup.componentNames(),
						InputComponentsLookup.componentTypes()),
				factoryInputEntity());
	}

	public GameContext createGameContext() {
		return new GameContext(GameComponentsLookup.totalComponents, 0,
				new ContextInfo("Game", GameComponentsLookup.componentNames(),
						GameComponentsLookup.componentTypes()),
				factoryGameEntity());
	}

	public GuiContext createGuiContext() {
		return new GuiContext(GuiComponentsLookup.totalComponents, 0,
				new ContextInfo("Gui", GuiComponentsLookup.componentNames(),
						GuiComponentsLookup.componentTypes()),
				factoryGuiEntity());
	}

	public SceneContext createSceneContext() {
		return new SceneContext(SceneComponentsLookup.totalComponents, 0,
				new ContextInfo("Scene",
						SceneComponentsLookup.componentNames(),
						SceneComponentsLookup.componentTypes()),
				factorySceneEntity());
	}

	public SensorContext createSensorContext() {
		return new SensorContext(SensorComponentsLookup.totalComponents, 0,
				new ContextInfo("Sensor", SensorComponentsLookup
						.componentNames(), SensorComponentsLookup
						.componentTypes()),
				factorySensorEntity());
	}

	public ActuatorContext createActuatorContext() {
		return new ActuatorContext(ActuatorComponentsLookup.totalComponents, 0,
				new ContextInfo("Actuator", ActuatorComponentsLookup
						.componentNames(), ActuatorComponentsLookup
						.componentTypes()),
				factoryActuatorEntity());
	}

	@Override
	public Context[] allContexts() {
		return new Context[]{input, game, gui, scene, sensor, actuator};
	}

	public EntityBaseFactory<InputEntity> factoryInputEntity() {
		return () -> {
			return new InputEntity();
		};
	}

	public EntityBaseFactory<GameEntity> factoryGameEntity() {
		return () -> {
			return new GameEntity();
		};
	}

	public EntityBaseFactory<GuiEntity> factoryGuiEntity() {
		return () -> {
			return new GuiEntity();
		};
	}

	public EntityBaseFactory<SceneEntity> factorySceneEntity() {
		return () -> {
			return new SceneEntity();
		};
	}

	public EntityBaseFactory<SensorEntity> factorySensorEntity() {
		return () -> {
			return new SensorEntity();
		};
	}

	public EntityBaseFactory<ActuatorEntity> factoryActuatorEntity() {
		return () -> {
			return new ActuatorEntity();
		};
	}
}