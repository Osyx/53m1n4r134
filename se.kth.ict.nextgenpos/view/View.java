package view;

import controller.Controller;
import model.ProductCatalog.itemIdOutOfRangeException;

/**
 * A placeholder for the view.
 */
public class View {
    private Controller cont;

    /**
     * Creates a new <code>View</code>.
     * @param cont           The controller of the application.
     */
    public View(Controller cont) {
	this.cont = cont;
    }

    /**
     * Simulates a view. Makes some calls to the controller.
     */
    public void test() {
	cont.makeNewSale();
	enterItem(1);
	enterItem(10);
    }

    private void enterItem(int itemId) {
	int quantity = 1;
	System.out.println("");
	try {
		System.out.println("Result for item " + itemId + ": " + cont.enterItem(itemId, quantity));
	} catch (itemIdOutOfRangeException itemIdNotFoundException) {
		System.out.println("There is no item with an item ID of \"" + itemIdNotFoundException.getItemId() + "\", please try again.");
	}
	System.out.println("");
    }
}
