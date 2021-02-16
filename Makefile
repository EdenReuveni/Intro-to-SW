#Eden Reuveni
#302313184

CC=gcc
TARGETS=withFlags noFlags
FLAGS=-fsanitize=integer-divide-by-zero -static-libubsan -fsanitize=leak -static-libubsan -fsanitize=null -static-libubsan -fsanitize=bounds -static-libubsan
all: $(TARGETS)


withFlags: Ex1.c
	$(CC) $(FLAGS) Ex1.c -o withFlags


noFlags: Ex1.c
	$(CC) Ex1.c -o noFlags


clean:
	rm -f *.o $(TARGETS)
	
.PHONY: all clean
