package com.corejsf;

import java.io.Serializable;
import javax.inject.Named; 
import javax.enterprise.context.RequestScoped; 

@Named
@RequestScoped
public class Planetarium implements Serializable {
    private static final long serialVersionUID = 1L;
    private String selectedPlanet;
  
  public String getSelectedPlanet() { return selectedPlanet; }
  
  public String changePlanet(String newValue) {
     selectedPlanet = newValue;
     return selectedPlanet;
  }
}
