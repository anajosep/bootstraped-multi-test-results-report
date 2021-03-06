package com.github.bogdanlivadariu.reporting.cucumber.json.models;

/**
 * Represents a tag for a {@link Feature} or {@link Element}
 */
public class Tag {

    private String name;

    private Integer line;

    public String getName() {
        return name;
    }

    public Integer getLine() {
        return line;
    }
}
