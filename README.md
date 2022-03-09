# DecoratorGame

This is a project testing your understanding of the decorator pattern by applying it to a video game. In this particular example, you are being shown a poor quality version of the code and being tasked with redesiging it from the ground up. 

In this game, you have been tasked with improving the implementation given in Sword. At the moment, the Sword class holds a wide range of different variables to track the different gems added to the sword. When at attack is made with the SillySwordSetup it is given a GameCharecter to attack and checks for each Gem variable.

GameCharecter is not your code and you should not edit it at all in this work.

## Better Swords with the decorator pattern
You can redesign this system to implement a better version of SillySwordSetup (perhaps one worthy of just being called sword!) following the decorator pattern. Start by considering page 91 or Head First Design Patterns - ask yourself what are the component, the concrete component, the decorator and the concrete decorators in this case?

Hints:
* Imagine you want to add more weapons to the game like a spear or a bow and each of them can have different gems added to them. 
* Imagine that you might also need to add different types of gem in the future (A water gem for example). 
* GameCharecter is not a part of this system.

Before moving to implementation, check your understanding with your tutor or demonstrator - you can probably draw a diagram to show 

## Fixing fire exploits

You realise that your game has a serious issue - fire damage seems to be much, much too strong. Inspecting the SillySwordSetup class you relaise that this is because it is not working as intended! The intention is that a sword attack with multiple firegem buffs on it should not apply the bonus firevulnerabilioty damage but, becasue of the way the current code is implemented, the first gem test sets the target on fire and then each subsequent attack adds fireVulnerability bonus damage onto it.

While you are at it,can you fix it so that instead of seeing multiple printOuts for each gem, instead we see a single printout for each type of damage the charecter takes?

How can you fix this issue in your decorator code? Look at Head First Design Patterns page xxx for a clue about this particular issue. The fix is not trivial in this case!
