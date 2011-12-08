default : GameParser.class LevelParser.class Parser.class

clean :
	@rm ./*.class

GameParser.class : GameParser.java Parser.class
	@javac -cp ../../ GameParser.java

LevelParser.class : LevelParser.java Parser.class
	@javac -cp ../../ LevelParser.java

Parser.class : Parser.java
	@javac -cp ../../ Parser.java
	
