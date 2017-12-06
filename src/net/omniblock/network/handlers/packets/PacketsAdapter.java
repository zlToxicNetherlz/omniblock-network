package net.omniblock.network.handlers.packets;

import net.omniblock.network.handlers.packets.readers.AuthReaders;
import net.omniblock.network.handlers.packets.readers.OtherReaders;
import net.omniblock.network.handlers.packets.readers.PlayerReaders;
import net.omniblock.network.handlers.packets.readers.ServerReaders;

public class PacketsAdapter {

	public static void registerReaders() {

		AuthReaders.start();
		OtherReaders.start();
		PlayerReaders.start();
		ServerReaders.start();

	}

}