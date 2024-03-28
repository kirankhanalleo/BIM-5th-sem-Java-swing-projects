package com.java2gui_kiran_A_19;
import java.io.Serializable;
public class KiranBeanClass implements Serializable {
    private String id, name, programme, college;
    public KiranBeanClass() {
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProgramme(String programme) {
        this.programme = programme;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getProgramme() {
        return this.programme;
    }
    public String getCollege() {
        return this.college;
    }
}