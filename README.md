# DecoratorGame

This is a project testing your understanding of the decorator pattern by applying it to a video game. In this particular example, you are being shown a poor quality version of the code and being tasked with redesiging it from the ground up. 

You should not change the GameCharecter class in this work.

In this game, you have been tasked with improving the implementation given in Sword. At the moment, the Sword class holds a wide range of different variables to track the different gems applied to it.

## Better Swords with the decorator pattern

How can you redesign this system to implement a better version of sword (perhaps one just called sword!) following the decorator pattern?



## Fixing fire exploits

You realise that your game has a serious issue - fire damage seems to be much, much too strong. Inspecting the SillySwordSetup class you relaise that this is because it is not working as intended! The intention is that a sword attack with multiple firegem buffs on it should not apply the bonus firevulnerabilioty damage but, becasue of the way the current code is implemented, the first gem test sets the target on fire and then each subsequent attack adds fireVulnerability bonus damage onto it.

While you are at it,can you fix it so that instead of seeing multiple printOuts for each gem, instead we see a single printout for each type of damage the charecter takes?

How can you fix this issue in your decorator code? Look at Head First Design Patterns page xxx for a clue about this particular issue. The fix is not trivial in this case!
