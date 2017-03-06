package com.ilargia.games.logicbrick.gen.scene;

import com.ilargia.games.entitas.matcher.Matcher;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class SceneMatcher {

	private static Matcher _matcherBackground;
	private static Matcher _matcherCamera;
	private static Matcher _matcherGameWorld;
	private static Matcher _matcherLight;
	private static Matcher _matcherTiled;

	public static Matcher Background() {
		if (_matcherBackground == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(SceneComponentsLookup.Background);
			matcher.componentNames = SceneComponentsLookup.componentNames();
			_matcherBackground = matcher;
		}
		return _matcherBackground;
	}

	public static Matcher Camera() {
		if (_matcherCamera == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(SceneComponentsLookup.Camera);
			matcher.componentNames = SceneComponentsLookup.componentNames();
			_matcherCamera = matcher;
		}
		return _matcherCamera;
	}

	public static Matcher GameWorld() {
		if (_matcherGameWorld == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(SceneComponentsLookup.GameWorld);
			matcher.componentNames = SceneComponentsLookup.componentNames();
			_matcherGameWorld = matcher;
		}
		return _matcherGameWorld;
	}

	public static Matcher Light() {
		if (_matcherLight == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(SceneComponentsLookup.Light);
			matcher.componentNames = SceneComponentsLookup.componentNames();
			_matcherLight = matcher;
		}
		return _matcherLight;
	}

	public static Matcher Tiled() {
		if (_matcherTiled == null) {
			Matcher matcher = (Matcher) Matcher
					.AllOf(SceneComponentsLookup.Tiled);
			matcher.componentNames = SceneComponentsLookup.componentNames();
			_matcherTiled = matcher;
		}
		return _matcherTiled;
	}
}