# Contributing
Thanks for deciding to commit to our mod! We currently accept pull requests from any developers that are willing to contribute. If you have any questions pertaining to contributing, feel free to make a post on our [issues page](https://github.com/MackQian/OSSMinecraftMod/issues?q=is%3Aopen+is%3Aissue) with the `question` label.

This document is split into four sections:
1. [Getting Started With Our Code](#getting-started-with-our-code)
2. [Style Guidelines](#style-guidelines)
3. [Contributing New Features](#contributing-new-features)
4. [Fixing Existing Bugs](#fixing-existing-bugs)

Before starting your contribution, make sure to read our [Code of Conduct](https://github.com/MackQian/TheDeepBlue/blob/main/CODE_OF_CONDUCT.md).

## Getting Started With Our Code
Stephen

## Style guidelines
Although we don't have any formal guidelines on Java code itself, we ask that you make sure to use comments wherever necessary. Spending less than a minute write out a comment explaining your block of code can save another developer half an hour of reading and testing it. We also ask that you follow our current directory structure, separating Client and Server code into our `client` and `common` directories. 

## Contributing New Features

### 1. Create an issue with the `enhancement` label
Start by creating a new issue on our [issues page](https://github.com/MackQian/OSSMinecraftMod/issues?q=is%3Aopen+is%3Aissue), and make sure to give it the `enhancement` label. In the post, you should describe what your new feature idea is. Explain exactly what you want to add, and how you want to go about implementing it.

### 2. Chat with us!
Members of our team will respond to your post, making sure that the new feature fits well with the rest of the mod. We will also ensure that the planned implementation of the feature is consistent with the rest of the mod's code.

### 3. Fork our repository
Create a fork of this repository, then clone it to your computer. Check out the [Getting started with our code](#getting-started-with-our-code) section of this document for a quick how-to on building the project.

### 4. Implement your feature
Add your feature to the cloned repository, making sure to follow our [Style Guidelines](#style-guidelines). Don't forget to add your new items/blocks/entities to [Registration.java](https://github.com/MackQian/OSSMinecraftMod/blob/main/src/main/java/com/oss/ossmod/Registration.java).

### 5. Create a pull request
Finally, create a pull request with your code. Our Gradle GitHub action will make sure it builds, then we'll review and merge it!

## Fixing Existing Bugs
### 1. Find a bug that you would like to fix
Browse our [issues page](https://github.com/MackQian/OSSMinecraftMod/issues?q=is%3Aopen+is%3Aissue) and look for a bug that you would like to tackle. We will do our best to mark straightforward issues with the `good first issue` label.

### 2. Fork our repository
Create a fork of this repository, then clone it to your computer. Check out the [Getting started with our code](#getting-started-with-our-code) section of this document for a quick how-to on building the project.

### 3. Implement your fix
Fix the bug in the project, and perform some tests to ensure the issue is resolved. If our project gains traction in the community, we will be sure to make a public Discord server where mod development and bug fixing can be discussed.

### 4. Create a pull request
Finally, create a pull request with your code. Our Gradle GitHub action will make sure it builds, then we'll review and merge it!
