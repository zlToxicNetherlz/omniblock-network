/*
 *  TheXTeam - Copyright (C) 2016
 *
 *  This program is not a free software; you cannot redistribute it and/or modify it.
 *
 *  Only this enabled the editing and writing by the members of the team. 
 *  No third party is allowed to modification of the code.
 *
 */

package net.omniblock.network.library.helpers.scoreboard;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public abstract class UpdatableBoard extends Board {
	private List<Player> players;

	public UpdatableBoard() {
		this.players = new ArrayList<>();
	}

	@Override
	public void startDisplay(Player p) {
		players.add(p);
		update(p);
	}

	@Override
	public void stopDisplay(Player p) {
		players.remove(p);
		p.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
	}

	public void update() {
		for (Player p : players)
			update(p);
	}

	protected abstract void update(Player p);

}
