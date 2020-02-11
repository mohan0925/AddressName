package addressName;

/**AddressName class is mainly for assigning the values to the variables house number, street name,
 * town,county,postcode
 * constructors used to set the values to the fields
 * getters used to get the values of the particular fields
 * setters used to set the values of the field
 *
 */
public class AddressName
{
	private int House_no;
	private String street_name;
	private String Town;
	private String county;
	private String postcode;
	private int index;

	/**Default constructor
	 * Field values set to null for street name,town,county,postcode and 0 to integers house number and index
	 */
	public AddressName()
	{
		House_no=0;
		street_name="";
		Town="";
		county="";
		postcode="";
		index=0;
	}
	/**parameterised constructor
	 * 
	 * @param index set the index value for every data by incrementing 1 value each time
	 * @param House_no set the house number from argument
	 * @param street_name set the street name from argument
	 * @param Town set the town name from argument
	 * @param county set the county from argument
	 * @param postcode set the postcode from argument
	 */
	public AddressName(int index,int House_no,String street_name,String Town,String county,String postcode)
	{
		this.index=index;
		this.House_no=House_no;
		this.street_name=street_name;
		this.Town=Town;
		this.county=county;
		this.postcode=postcode;
	
	}
	/**
	 * 
	 * @param House_no set the house number value from argument
	 */
	public void set_H_no(int House_no) {
		this.House_no = House_no;
	}
	/**
	 * 
	 * @param street_name set the street name value from argument
	 */
	public void set_street_name(String street_name) {
		this.street_name = street_name;
	}
	/**
	 * 
	 * @param Town set the town value from argument
	 */
	public void set_Town(String Town) {
		this.Town = Town;
	}
	/**
	 * 
	 * @param county set the county value from argument
	 */
	public void set_county(String county) {
		this.county = county;
	}
	/**
	 * 
	 * @param postcode set the postcode value from argument
	 */
	public void set_postcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * 
	 * @return index it returns the integer index value
	 */
	public int get_index() {
		return index;
	}
	/**
	 * 
	 * @return House_no it returns the integer house number value
	 */
	public int get_House_no() {
		return House_no;
	}
	/**
	 * 
	 * @return street_name it returns the string street name value
	 */
	public String get_street_name() {
		return street_name;
	}
	/**
	 * 
	 * @return Town it returns the string town value
	 */
	public String get_Town() {
		return Town;
	}
	/**
	 * 
	 * @return county it returns the string county value
	 */
	public String get_county() {
		return county;
	}
	/**
	 * 
	 * @return postcode it returns the string postcode value 
	 */
	public String get_postcode() {
		return postcode;
	}
	/**
	 * Method ovverrides the in-built toString() method 
	 * When this method is called it returns the output in the following format
	 */
	@Override
	public String toString() {
		return "Index ="+index+", House Number=" + House_no + ", Street Name=" + street_name + ", Town="+Town + ", county=" +county+ ", postcode="+postcode ;
	}
	
}
