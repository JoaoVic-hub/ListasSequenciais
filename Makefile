SRC_DIR=src
BIN_DIR=bin

all: compile run

compile:
	mkdir -p $(BIN_DIR)
	javac -d $(BIN_DIR) $(SRC_DIR)/ListaSequencial.java $(SRC_DIR)/TestListaSequencial.java

run:
	java -cp $(BIN_DIR) TestListaSequencial

clean:
	rm -rf $(BIN_DIR)
