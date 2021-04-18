'''
This file converts an outdated 1.15 model file into one that works with 1.16.
To use, place this script in a directory with 1 or more outdated Java model files, and each
will have a copy of it created with correct functions and structure.

Note: You must fix textureWidth and textureSize manually
'''

import glob, os

def formatLine(line, indent):
  out = ""
  for i in range(indent):
    out += "    "
  out += line.strip() + "\n"
  return out


for file in glob.glob("*.java"):
  readFrom = open(file, "r")
  outFile = open(file[0:-5]+"_out.txt", "w")
  break

pos = 0
inFile = list(readFrom)

# Skip over start of file
while ("public" not in inFile[pos]):
  pos += 1

className = inFile[pos].split()[2]
pos += 1

# Read the private variables
while ("public" not in inFile[pos]):
  outFile.write(formatLine(inFile[pos], 1))
  pos += 1

# Add the className
outFile.write(formatLine("public " + className + "() {", 2))
pos += 1

width, height = inFile[pos:pos+2]

width = width.split()[-1][0:-1]
height = height.split()[-1][0:-1]
pos += 2

while ("}" not in inFile[pos]):

  line = inFile[pos]
  if ("bb_main" in line):
    outFile.write(formatLine(line, 3))
    outFile.write(
      formatLine("bb_main.setTexSize(" + width + ", " + height + ")", 3)
    )
  elif ("setRotationPoint" in line):
    outFile.write(
      formatLine(line.replace("setRotationPoint", "setPos"), 3)
    )
  elif ("setTextureOffset" in line):
    outFile.write(
      formatLine(line.replace("setTextureOffset", "texOffs"), 3)
    )
  elif ("setRotationAngle" in line):
    obj = line.strip()[17:-2]
    modelName, x, y, z = obj.split(", ")
    outFile.write(formatLine(modelName + ".xRot = " + x + ";", 3))
    outFile.write(formatLine(modelName + ".yRot = " + y + ";", 3))
    outFile.write(formatLine(modelName + ".zRot = " + z + ";", 3))


  else:
    outFile.write(formatLine(inFile[pos], 3))
  pos += 1


readFrom.close()
outFile.close()

print("Conversion complete!")
