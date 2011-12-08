PARSING_DIR = 'parsing'
ENGINE_DIR  = 'engine'

.PHONY : make_parsing make_engine

default : make_parsing make_engine

clean :
	@rm ./*.class
	@$(MAKE) -s -C $(PARSING_DIR) clean
	@$(MAKE) -s -C $(ENGINE_DIR) clean

make_parsing : 
	@$(MAKE) -s -C $(PARSING_DIR)

make_engine :
	@$(MAKE) -s -C $(ENGINE_DIR)

