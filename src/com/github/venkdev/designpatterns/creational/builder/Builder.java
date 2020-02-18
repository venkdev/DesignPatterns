package com.github.venkdev.designpatterns.creational.builder;

public class Builder {

    private String text;
    private int num;

    public Builder(BuilderHelper builderHelper) {
        this.text = builderHelper.text;
        this.num = builderHelper.num;
    }


    @Override
    public String toString() {
        return "Builder{" +
                "text='" + text + '\'' +
                ", num=" + num +
                '}';
    }

    public static class BuilderHelper{
        private String text;
        private int num;

        private BuilderHelper() {
        }

        public static BuilderHelper getInstance(){
            return new BuilderHelper();
        }

        public BuilderHelper text(String text){
            this.text = text;
            return this;
        }

        public BuilderHelper num(int num){
            this.num = num;
            return this;
        }

        public Builder build(){
            return new Builder(this);
        }
    }

}

class DriverProgram{
    public static void main(String args[]){
        Builder.BuilderHelper builderHelper = Builder.BuilderHelper.getInstance();
        Builder builder = builderHelper.num(1).num(1).text("gnh").build();
        System.out.println(builder);
    }
}
