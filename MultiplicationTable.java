package com.firstjavaproject;

public class MultiplicationTable
{
	void print() {
for(int i=0;i<=10;i++) {
	System.out.println("5 *"+i+" = "+5*i);

}}
void print (int table) {
for(int i=0;i<=10;i++){                                            //function overloading
	System.out.println(table +"*" +i+"="+ table*i);
	
	
}}
void print (int table,int from ,int to) {
for(int i=from;i<=to;i++){
	System.out.println(table +"*" +i+"="+ table*i);
	
	
}

	}
	
}
