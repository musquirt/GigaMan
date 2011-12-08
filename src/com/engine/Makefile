CORE_DIR     = core
GRAPHICS_DIR = graphics
INPUT_DIR    = input

.PHONY : make_engine_subs

clean :
	@rm *.class
	@$(MAKE) -s -C $(GRAPHICS_DIR) clean
	@$(MAKE) -s -C $(INPUT_DIR) clean
	@$(MAKE) -s -C $(CORE_DIR) clean

make_engine_subs :
	@$(MAKE) -s -C $(GRAPHICS_DIR)
	@$(MAKE) -s -C $(INPUT_DIR)
	@$(MAKE) -s -C $(CORE_DIR)

