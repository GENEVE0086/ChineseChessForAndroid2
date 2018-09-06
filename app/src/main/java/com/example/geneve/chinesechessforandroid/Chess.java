package com.example.geneve.chinesechessforandroid;

public abstract class Chess {
    //颜色枚举，
    enum Color{Black,Red,Null};

    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    Chess(Color color){
        this.color =  color;

    }

    Chess(){
        color = Color.Null;
    }
}
