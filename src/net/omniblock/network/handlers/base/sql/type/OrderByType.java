/*
 *  Omniblock Developers Team - Copyright (C) 2016
 *
 *  This program is not a free software; you cannot redistribute it and/or modify it.
 *
 *  Only this enabled the editing and writing by the members of the team. 
 *  No third party is allowed to modification of the code.
 *
 */

package net.omniblock.network.handlers.base.sql.type;

@Deprecated
public enum OrderByType {

	ASC("ASC"),
	DESC("DESC");

	private String string;

	OrderByType(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return string;
	}

}
