public class JComboBox {
	public JComboBox(){...}
	public void addItem(Object anObject){ ...}
}

//Wrapper de JComboBox 
public class JComboBox {
	DSJComboBox adaptee;
	public JComboBox(){adaptee= new DSJComboBox();}
	
	public void addItem(Object anObject){
		adaptee.addItem(anObject);
	}
}