package lordfokas.stargatetech.machine;

import net.minecraft.tileentity.TileEntity;
import lordfokas.stargatetech.networks.stargate.Address;
import lordfokas.stargatetech.networks.stargate.StargateNetwork;
import lordfokas.stargatetech.util.Helper;

public class StargateTE extends TileEntity {
	public static final String ID = "StargateTE";
	public Address addr;
	
	public StargateTE(){}
	
	@Override
	public void validate(){
		super.validate();
		addr = StargateNetwork.instance().getMyAddress(worldObj, xCoord, yCoord, zCoord);
		if(addr != null) System.out.println("NEW ADDR: " + addr.getName());
	}
	
	public int getDirection(){
		return worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
	}
	
	public void setDirection(int d){
		worldObj.setBlockMetadata(xCoord, yCoord, zCoord, d);
	}
}
