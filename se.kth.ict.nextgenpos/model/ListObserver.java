package model;

import java.util.List;

public interface ListObserver {

	public void notify(List<SalesLineItem> lineItems);
}