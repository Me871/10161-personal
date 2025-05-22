# 10161-personal
My personal repository for robotics research.

## Research Topics
### Safety
* We should protect against future damage by grounding all of our electronics [using this grounding cable](https://github.com/FIRST-Tech-Challenge/ftcdocs/blob/main/docs/source/hardware_and_software_configuration/configuring/managing_esd/managing-esd.rst#step-4-ground-electronics-to-metal-frame-with-an-approved-cable).

### Improvements
* We should have a [robot log](https://github.com/FIRST-Tech-Challenge/FtcRobotController/wiki/Datalogging) (like a flight recorder) to make it easier to diagnose issues.
* Form better in-match roles:
  * The Navigator has final command over everyone; nobody argues against them. They give general commands as the game goes on, only giving one command at a time (like grab, go to, hang on, etc)
  * The Pilot and Gunner should be well-trained to do the tasks that the Navigator asks. Part of this comes from training everyone on every role, so they become used to what to expect.
  * The Pilot has full control over the robot's movement, and can lock out the Gunner's movement control if needed.
  * The Gunner has control over all of the robot's accessories, and has some control over the robot's movement.
* Control improvements:
  * Pilot: Change to drone-style controls. Holding either Bumper locks out the Gunner's movement controls.
  * Gunner: Have the most used controls on Left Thumbstick. Others are on the D-Pad and Color Buttons, and those controls can be throttled with the Triggers. The Right Thumbstick walks the robot at 1/4 of the speed of the driver's.
* We should use [GitHub Wikis](https://docs.github.com/en/communities/documenting-your-project-with-wikis/about-wikis) to write meeting notes, which will be compiled into an Engineer's Notebook at the end of the season. This also makes formatting much easier, since we just write the simpler notes every meeting, then make it look nice later on.
* We should formally define each accessory/design/etc that we make in our documentation so that it's clear what we're talking about.

### Luxury Features
* We could [use an LED strip](https://github.com/FIRST-Tech-Challenge/FtcRobotController/blob/master/FtcRobotController/src/main/java/org/firstinspires/ftc/robotcontroller/external/samples/ConceptLEDStick.java) to give operators feedback as to where an element is.
* I'd like to get some [clip-on thumbstick extensions](https://www.thingiverse.com/thing:4615344) for the driver's controller so that I can have finer control.
* The [competition manual (R904)](https://ftc-resources.firstinspires.org/file/ftc/game/manual) suggests using a USB hub to save the USB ports on the driver station.
* We could make an operator's console (R905) that hangs on the cart and holds the controllers, then you can grab it and place it on the tables where we play: This would make it much easier to manage all of that stuff.
* We could use [GitHub Organizations](https://docs.github.com/en/organizations/collaborating-with-groups-in-organizations/about-organizations) to help make sharing our work easier.
