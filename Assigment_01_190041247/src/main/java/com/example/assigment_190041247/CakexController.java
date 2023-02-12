package com.example.assigment_190041247;

public class CakexController {
    private CakexModel model;
    private CakexView view;

    public CakexController(CakexModel model, CakexView view){
        this.model = model;
        this.view = view;
    }

    public void setCakeName(String name){
        model.setName(name);
    }

    public String getCakeName(){
        return model.getName();
    }

    public void setCakeId(String id){
        model.setId(id);
    }

    public String getCakeId(){
        return model.getId();
    }

    public void setType(String type){

        model.setType(type);
    }

    public String getType(){
        return model.getType();
    }

    //The controller will pass the user requested info to the view and
    // update the view with that info through this method
    public void updateView(){
        view.printCakeDetails(model.getName(), model.getId(), model.getType());
    }
}
