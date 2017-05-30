package entitas.generated.dir2;

import ilargia.entitas.api.IComponent;
import ilargia.entitas.codeGenerator.annotations.Contexts;
import ilargia.entitas.codeGenerator.annotations.EntityIndex;

@Contexts(names = {"Input", "Core", "Test"})
public class Player implements IComponent {
	@EntityIndex
	public ID id;

	public Player(ID id) {
		this.id = id;
	}

	public enum ID {
		PLAYER1, PLAYER2
	}

}