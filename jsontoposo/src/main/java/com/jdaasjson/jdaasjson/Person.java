package com.jdaasjson.jdaasjson;

import java.util.HashMap;
import java.util.Map;

public class Person
{
  private Map<String,MyObject1> person=new HashMap<String, MyObject1>();

  public Map<String, MyObject1> getPerson() {
      return person;
  }

  public void setPerson(Map<String, MyObject1> person) {
      this.person = person;
  }

  @Override
  public String toString() {
    return "Person{" +
    "person=" + person +
    '}';
  }
}

 class MyObject1
{

    int id;
    String first_name;
    String last_name;
    String email;
    String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
  @Override
  public String toString() {
    return "MyObject{" +
    "first_name='" + first_name + '\'' +
    ", last_name='" + last_name + '\'' +
    '}';
  }

}