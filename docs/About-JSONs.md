As you may have noticed, this mod makes frequent use of JSON files. Minecraft and Forge store configuration data for much of their important tools in nested JSONs with lists.
For example, making a block involves the use of multiple JSON files. One contains information about the textures used for their models, another contains its actual BlockState,
and another contains data that helps determine its behavior.
Biomes also have their own JSONs, which include the types of creatures as nested JSONs containing more information for each one, sounds, effects, and calls to surface builders.
The surface builder JSON format is used simply for configurating the top,under, and underwater materials used in creating chunk designs.
Craftable items will also have recipe JSONs which will determine the crafting patterns and materials used for creating them.<br>
For example, to create a JSON for an Obsidian Axe, we can do the following:
```
{
  "type": "minecraft:crafting_shaped",
  "pattern": [
    "YY",
    "Y|",
    " |"
  ],
  "key": {
    "|": {
      "item": "minecraft:stick"
    },
    "Y": {
      "item": "minecraft:obsidian"
    }
  },
  "result": {
    "item": "ossmod:obsidian_axe"
  }
}
```
Ingredients are always required. Patterns must fit in a 3x3 grid (size of a grid while using a crafting table), and a key must be given if a pattern is specified.
If a pattern is not specified, then the recipe is simply just the ingredient placed in the crafting grid. You can specify the number of an item that is yielded by the recipe
by adding an additional term "count" under the "result" tag.
<br><br>Further details for configuration JSONs can be found by looking at the ones that we have added, or by reaching out to contributors.
