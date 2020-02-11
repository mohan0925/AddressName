package addressName;

import java.util.ArrayList; // import ArrayList class
import java.util.Scanner; // import Scanner class
import java.io.*; // import input output class
public class AddressNameTest {
	// variables to store values of each field
	static int House_no; 
	static String street_name;
	static String county;
	static String Town;
	static String postcode;	 		 
	static int index_value;
	static int index;
	static String new_response;
	//Scanner class used for taking the inputs 
	static Scanner myObj = new Scanner(System.in);	
	/* Method for entering new address	for user */
	public void new_address()
	{
		System.out.println("Enter new address details"); 
		System.out.println("Enter House Number"); 
	    House_no=myObj.nextInt();	    
	    myObj.nextLine(); 	    
	    System.out.println("Enter Street Name"); 
	    street_name=myObj.nextLine();	    	    
	    System.out.println("Enter Town Name"); 
	    Town=myObj.nextLine();	    	    
	    System.out.println("Enter Country Name"); 
	    county=myObj.nextLine();	    		    
	    System.out.println("Enter PostCode"); 
	    postcode=myObj.nextLine();
	    // increments the index value by 1 when new_address() is called
	    index++;
	}
	public static void main(String[] args) 
	{	    /* calling Default constructor of AddressName*/
			AddressName add_name_obj= new AddressName();
			/*calling default constructor of AddressNameTest*/
			AddressNameTest values= new AddressNameTest();
			/* Creating the arraylist for AddressName*/
			ArrayList<AddressName> address_class_object= new ArrayList<AddressName>();
			/* calling the new address method for entering values*/
			values.new_address();
			address_class_object.add(new AddressName(index,House_no,street_name,Town,county,postcode));
			values.new_address();
			address_class_object.add(new AddressName(index,House_no,street_name,Town,county,postcode));		    
		    System.out.println("Entered Address");
		    for(AddressName address_data:address_class_object)
	    	{
		    	 System.out.println(address_data.toString());
	    	}		   
		    /*Asks user to update the address or not*/
		    System.out.println("Do you want to update the Address?   yes/no");
		    String update_response=myObj.nextLine();
		    /*Taking the user response yes/no*/
		    if(update_response.equalsIgnoreCase("yes"))
		    {
		    	System.out.println("Enter the index of the data you want to update");
		    	index_value=myObj.nextInt();
		    	// index value is initialised 
		    	int index_val=0;
		    	for(AddressName address_data:address_class_object)
		    	{
		    		//checking the user entered index values and index item value is arraylist is same or not
		    		// if values are same then using setter new values are updated
		    		if(index_value==address_data.get_index())
			    	{
			    		values.new_address();
			    		address_class_object.get(index_val).set_H_no(House_no);
			    		address_class_object.get(index_val).set_street_name(street_name);
			    		address_class_object.get(index_val).set_Town(Town);
			    		address_class_object.get(index_val).set_county(county);
			    		address_class_object.get(index_val).set_postcode(postcode);
			    	}
		    		//after every loop index value is incremented by 1
		    		index_val++;		    	
		    	}
		    }
		    else
		    {
		    	System.out.println("Entered Address");
		    }
		    for(AddressName address_data:address_class_object)
	    	{
		    	System.out.println(address_data);
	    	}
	}

}
