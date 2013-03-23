package lordfokas.stargatetech.packet;

import cpw.mods.fml.common.network.IPacketHandler;

/**
 * A very early WIP packet handler.
 * @author LordFokas
 */
public abstract class PacketHandler implements IPacketHandler {
	public static final String CHANNEL_STARGATE = "StargateCH";
	public static final byte PACKET_DIALING_COMPUTER_BUTTON = 0x01;
}
