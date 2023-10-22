package org.example;

class MechPart {
    private Component[] parts;
    MechPart(boolean type){
         if (!type){
            Component[] parts= {Component.NONE, Component.NONE, Component.NONE, Component.NONE, Component.NONE, Component.NONE};
         }
         else{
             Component[] parts= {Component.NONE, Component.NONE, Component.NONE, Component.NONE, Component.NONE, Component.NONE,Component.NONE, Component.NONE, Component.NONE, Component.NONE, Component.NONE, Component.NONE};
         }
    }
    void Change(int type, Component newComponent){
        parts[type]=newComponent;
    }
}
