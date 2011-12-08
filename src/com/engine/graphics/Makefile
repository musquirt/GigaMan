default : Animation.class Sprite.class NullRepaintManager.class ScreenManager.class

clean :
	@rm ./*.class

Animation.class : Animation.java
	@javac -cp ../../../ Animation.java

Sprite.class : Animation.class Sprite.java
	@javac -cp ../../../ Sprite.java

NullRepaintManager.class : NullRepaintManager.java
	@javac -cp ../../../ NullRepaintManager.java

ScreenManager.class : ScreenManager.java
	@javac -cp ../../../ ScreenManager.java

