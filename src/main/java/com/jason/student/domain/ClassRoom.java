package com.jason.student.domain;

/**
 * @author jason
 * @date 2019-05-07  14:19:29
 */
public class ClassRoom {

    private Integer id;
    private String classRoomName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassRoomName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public ClassRoom() {
    }

    public ClassRoom(Integer id, String classRoomName) {
        this.id = id;
        this.classRoomName = classRoomName;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "id=" + id +
                ", classRoomName='" + classRoomName + '\'' +
                '}';
    }
}
