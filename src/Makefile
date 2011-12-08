COMMON_DIR = com

.PHONY : make_common

default : GigaMan.class make_common

GigaMan.class : GigaMan.java
	@javac GigaMan.java

make_common :
	@$(MAKE) -s -C $(COMMON_DIR)

clean :
	@rm ./*.class
	@$(MAKE) -s -C $(COMMON_DIR) clean

