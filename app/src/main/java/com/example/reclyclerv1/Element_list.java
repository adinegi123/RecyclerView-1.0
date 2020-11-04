package com.example.reclyclerv1;

public class Element_list {
    private int imageResource;
    private String text1;
    private String text2;
    public Element_list(int imageResource,String text1,String text2)
    {
        this.imageResource=imageResource;
        this.text1=text1;
        this.text2=text2;
    }
    public int getImage()
    {
        return imageResource;
    }
    public String getText1()
    {
        return text1;
    }

    public  String getText2()
    {
        return text2;
    }

}
