/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxfxmldiagramme;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;

/**
 *
 * @author ralph
 */
public class SampleController implements Initializable {
    
    
    @FXML
    private PieChart pc;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<PieChart.Data> bcChartData = FXCollections.observableArrayList(
                new PieChart.Data("Jan", 10), new PieChart.Data("Feb", 8), new PieChart.Data("Mrz", 12));
        pc.setData(bcChartData);
    }    
}
