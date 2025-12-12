# --------------------------
# Variables
# --------------------------
SRC = $(shell find src -name "*.java")
BIN = bin
JUNIT = lib/junit/*
PACKAGE = test.pets

# Compiler and flags
JAVAC = javac
JAVAC_FLAGS = -cp $(JUNIT) -d $(BIN)

# Test runner
JAVA = java
JAVA_FLAGS_DISCOVER = -jar lib/junit/* discover --select-package $(PACKAGE) -cp $(BIN)

JAVA_FLAGS_TEST = -jar lib/junit/* execute --select-package $(PACKAGE) -cp $(BIN)

# --------------------------
# Default target
# --------------------------
all: compile test

# --------------------------
# Compile Java sources
# --------------------------
compile:
	@mkdir -p $(BIN)
	$(JAVAC) $(JAVAC_FLAGS) $(SRC)

# --------------------------
# Discover JUnit tests
# --------------------------
discover:
	$(JAVA) $(JAVA_FLAGS_DISCOVER)


# --------------------------
# Run JUnit tests
# --------------------------

test: $(JAVA) $(JAVA_FLAGS_TEST)

# --------------------------
# Clean generated files
# --------------------------
clean:
	rm -rf $(BIN)

