package mvc;

import view.Assignment_View;
import model.Assignment_Model;
import controller.Assignment_Controller;


public class MVC_Assignment {

	public static void main(String[] args) {

		Assignment_View theView = new Assignment_View();
		Assignment_Model theModel = new Assignment_Model();
        // @SuppressWarnings("unused")
        // Assignment_Controller theController = new Assignment_Controller(theView,theModel);
        // theView.setVisible(true);
    }
}
