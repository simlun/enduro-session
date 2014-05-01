.PHONY: all debug test system-test clean

export PATH := $(shell pwd)/scripts:$(shell pwd)/scripts/lib:$(PATH)
# Try to use lein2 but fall back on lein (because Travis CI calls it lein2):
LEIN := $(shell (which lein2 >/dev/null 2>&1) && echo lein2 || echo lein)
CLJ := $(shell find . -name '*.clj')

all: debug test system-test

debug:
	@echo PATH=${PATH}
	@echo LEIN=${LEIN}
	@echo CLJ=${CLJ}

test:
	$(LEIN) midje

target/system-test-server.jar: $(CLJ)
	$(LEIN) with-profile +system-test uberjar

system-test: target/system-test-server.jar
	scripts/system-test

clean:
	$(LEIN) clean
