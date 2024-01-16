# SimpleInfoBroadcast (Plugin)

## Overview
SimpleInfoBroadcast is a lightweight plugin for PaperMC servers, designed to broadcast custom messages to players at set intervals. Ideal for server announcements, reminders, or any information you need to communicate regularly, this plugin offers an easy and automated way to keep your players informed.

## Features
- **Customizable Messages:** Define your own set of messages to be broadcasted.
- **Configurable Intervals:** Set how frequently messages should be broadcasted.
- **Command for Easy Reload:** Change settings on the fly without restarting the server.
- **Prefix Customization:** Customize the prefix for all broadcast messages.
- **Console Logging Option:** Choose whether to log messages to the console.

## Installation
1. Download the SimpleInfoBroadcast.jar file.
2. Place it into your server's `plugins` folder.
3. Restart your server, or if it's already running, load the plugin using a plugin manager.

## Configuration
After the first run, the plugin will generate a `config.yml` file in the `plugins/SimpleInfoBroadcast` folder. You can edit this file to customize the plugin's behavior.

### Configurable Options
- **prefix:** The prefix that appears before each broadcast message.
- **interval:** Time in seconds between each broadcast message.
- **log:** Set to `true` if you want broadcast messages to be logged in the console.
- **messages:** A list of messages to be broadcasted. You can use color codes and formatting codes.

### Example Configuration
```yaml
prefix: "<gray>[<dark_gray>Info<gray>] "
interval: 10
log: false
messages:
  - "<red>Example message 1"
  - "<blue><i>Example message 2"
  - "<green><b>Example message 3"
