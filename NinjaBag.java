package Entities;

import java.util.ArrayList;
import java.util.List;

public class NinjaBag<T> {

    private List<T> tools;

    public NinjaBag() {
        this.tools = new ArrayList<>();
    }

    public void addTools(T tool) {
        tools.add(tool);
    }

    public void showTool(){
        for(T tool : tools) {
            System.out.println(tool);
        }
    }

    public List<T> getTools() {
        return tools;
    }

    public void setTools(List<T> tools) {
        this.tools = tools;
    }
}
