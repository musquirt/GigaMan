SOURCE_DIR = src

.PHONY : make_source

default : make_source

clean : 
	@rm ./*.class
	@$(MAKE) -s -C $(SOURCE_DIR) clean

make_source :
	@$(MAKE) -s -C $(SOURCE_DIR)
