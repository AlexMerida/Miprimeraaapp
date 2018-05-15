package com.teaching.android.miprimeraapp;

public class GameModel {

    private int id;
    private String name;
    private String description;
    private String officialWebUrl;
    private int iconDrawable;
    private int backgroundDrawable;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOfficialWenUsrl() {
        return officialWebUrl;
    }

    public void setOfficialWenUsrl(String officialWenUsrl) {
        this.officialWebUrl = officialWenUsrl;
    }

    public int getIconDrawable() {
        return iconDrawable;
    }

    public void setIconDrawable(int iconDrawable) {
        this.iconDrawable = iconDrawable;
    }

    public int getBackgroundDrawable() {
        return backgroundDrawable;
    }

    public void setBackgroundDrawable(int backgroundDrawable) {
        this.backgroundDrawable = backgroundDrawable;
    }

    public GameModel(int id, String name, String description, String officialWenUsrl, int iconDrawable, int backgroundDrawable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.officialWebUrl = officialWenUsrl;
        this.iconDrawable = iconDrawable;
        this.backgroundDrawable = backgroundDrawable;
    }
}
