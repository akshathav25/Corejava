package com.ait.day3.Encapsulation;

public class EncapsulationEx {

@Override
	public String toString() {
		return "EncapsulationEx: \nserialNum=" + serialNum + "\nname=" + name + "\nage=" + age ;
	}
private int serialNum;
private String name;
private int age;
public int getSerialNum() {
	return serialNum;
}
public void setSerialNum(int serialNum) {
	this.serialNum = serialNum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


}
