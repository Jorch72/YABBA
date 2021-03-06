package com.latmod.yabba.api;

import com.feed_the_beast.ftblib.lib.client.SpriteSet;
import com.feed_the_beast.ftblib.lib.icon.Color4I;
import com.feed_the_beast.ftblib.lib.icon.Icon;
import com.feed_the_beast.ftblib.lib.util.BlockUtils;
import com.feed_the_beast.ftblib.lib.util.misc.TextureSet;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;

/**
 * @author LatvianModder
 */
public class BarrelSkin
{
	public final String id;
	public final TextureSet textures;
	public Icon icon = Icon.EMPTY;
	public SpriteSet spriteSet;
	public IBlockState state = BlockUtils.AIR_STATE;
	public String displayName = "";
	public BlockRenderLayer layer = BlockRenderLayer.SOLID;
	public Color4I color = Icon.EMPTY;

	public BarrelSkin(String _id, TextureSet _textures)
	{
		id = new ResourceLocation(_id).toString();
		textures = _textures;
	}

	public int hashCode()
	{
		return id.hashCode();
	}

	public boolean equals(Object o)
	{
		if (o == this)
		{
			return true;
		}
		else if (o instanceof BarrelSkin)
		{
			return id.equals(((BarrelSkin) o).id);
		}

		return false;
	}

	public String toString()
	{
		return displayName.isEmpty() ? id : displayName;
	}
}