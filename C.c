
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <limits.h>


void bounds(){ //Creating an array with two cells and going to third cell
    int a[2]={0,1};
    int b;
    b=a[2];

}

void divided_by_zero(){ //Dividing an integer by zero
int a=7;
int b=0;

printf("%d",a/b);

}

void leak(){ //Allocating memroy for a pointer and not releasing it
int* p;
p=(int*)malloc(5);


}

void null(){ //Executing pointer arithmetics on null pointers
int* a=NULL;
int* b=NULL;
a+=*b;

}

int main(){
    bounds(); //Calling bounds function
    divided_by_zero(); //Calling divided_by_zero function
    leak(); //Callint leak function
    null(); //Calling null function

    return 0;


}
