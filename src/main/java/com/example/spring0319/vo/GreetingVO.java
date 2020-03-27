package com.example.spring0319.vo;

public class GreetingVO {
    private final long id;
    private final String content;

    public GreetingVO(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "GreetingVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
