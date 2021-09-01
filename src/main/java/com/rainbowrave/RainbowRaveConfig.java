package com.rainbowrave;

import static com.rainbowrave.RainbowRaveConfig.NpcsToHighlight.SAME;
import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("rainbow_rave")
public interface RainbowRaveConfig extends Config
{
	enum NpcsToHighlight {
		NONE,
		SAME,
		ALL
	}

	enum ObjectsToHighlight {
		NONE,
		SAME,
		ALL
	}

	@ConfigItem(
		keyName = "colorSpeed",
		name = "Color speed (ms)",
		description = "How fast the colors change (ms per full cycle)",
		position = 0
	)
	default int colorSpeed()
	{
		return 6000;
	}

	@ConfigItem(
		keyName = "syncColor",
		name = "Sync colors",
		description = "Make all highlighted things be the same color as each other.",
		position = 1
	)
	default boolean syncColor()
	{
		return false;
	}

	@ConfigItem(
		keyName = "highlightSelf",
		name = "Highlight self",
		description = "Highlight your own player character. Uses Npc Indicator's settings.",
		position = 2
	)
	default boolean highlightSelf()
	{
		return false;
	}

	@ConfigItem(
		keyName = "highlightOthers",
		name = "Highlight others",
		description = "Highlight other players' characters. Uses Npc Indicator's settings.",
		position = 3
	)
	default boolean highlightOthers()
	{
		return false;
	}

	@ConfigItem(
		keyName = "whichNpcsToHighlight",
		name = "Npc highlight",
		description = "Which npcs to highlight",
		position = 4
	)
	default NpcsToHighlight whichNpcsToHighlight()
	{
		return SAME;
	}

	@ConfigItem(
		keyName = "smoothWaves",
		name = "Tile color waves",
		description = "Whether the tiles should have a smooth transition from color to color between two adjacent tiles.",
		position = 5
	)
	default boolean smoothWaves()
	{
		return false;
	}

	@ConfigItem(
		keyName = "fillTiles",
		name = "Fill tiles",
		description = "Fills the tile with an opaque square.",
		position = 6
	)
	default boolean fillTiles()
	{
		return false;
	}

	@ConfigItem(
		keyName = "whichObjectsToHighlight",
		name = "Object highlight",
		description = "Which objects to highlight",
		position = 7
	)
	default ObjectsToHighlight whichObjectsToHighlight()
	{
		return ObjectsToHighlight.SAME;
	}

}
